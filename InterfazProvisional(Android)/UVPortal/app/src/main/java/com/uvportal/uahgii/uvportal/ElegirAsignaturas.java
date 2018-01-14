package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ElegirAsignaturas extends AppCompatActivity {


    private String ip;
    private String expediente;

    private FloatingActionButton elegir_asignaturas_button;

    private ArrayList<Asignatura> obligatorias;
    private ArrayList<Asignatura> optativas;
    private ArrayList<Asignatura> transversales;
    private Asignatura tfg;

    private int creditosObligatorios;
    private int creditosOptativos;
    private int creditosTransversales;
    private int creditosOptativosExtra;

    private int creditosGlobales;

    private RequestQueue rq;

    private String datos;

    private AsignaturasTabAdapter adapter;

    private ViewPager viewPagerAsignaturas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_asignaturas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        elegir_asignaturas_button = (FloatingActionButton) findViewById(R.id.fab_elegir_asignaturas);

        adapter = new AsignaturasTabAdapter(getSupportFragmentManager());

        viewPagerAsignaturas = (ViewPager) findViewById(R.id.viewpager_asignaturas) ;

        viewPagerAsignaturas.setOffscreenPageLimit(3);

        viewPagerAsignaturas.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_asignaturas);

        tabLayout.setupWithViewPager(viewPagerAsignaturas);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");
        SharedPreferences sp2 = getSharedPreferences("usuario",MODE_PRIVATE);
        expediente = sp2.getString("expediente","0");

        rq = Volley.newRequestQueue(this);

        obligatorias = new ArrayList<>();
        optativas = new ArrayList<>();
        transversales = new ArrayList<>();


        final JsonRequest jr = new JsonArrayRequest(Request.Method.GET, "http://" + ip + ":9200/asignaturasMatriculablesByAlumno/"+expediente , null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try{
                    datos = response.toString();

                    for(int i = 0; i<response.length(); i++){
                        JSONObject asignaturaGrupos = response.getJSONObject(i);
                        JSONObject asignatura = asignaturaGrupos.getJSONObject("Asignatura");
                        int codigo = asignatura.getInt("Codigo");
                        String nombre = asignatura.getString("Nombre");
                        int carrera = asignatura.getInt("Carrera");
                        String tipo = asignatura.getString("Tipo");
                        int creditos= asignatura.getInt("Creditos");
                        if(tipo.equals("OB")){
                            obligatorias.add(new Asignatura(codigo,nombre,carrera,tipo,creditos));
                        }else if(tipo.equals("OP")){
                            optativas.add(new Asignatura(codigo,nombre,carrera,tipo,creditos));
                        }else if(tipo.equals("T")){
                            transversales.add(new Asignatura(codigo,nombre,carrera,tipo,creditos));
                        }else if(tipo.equals("TFG")){
                            tfg = new Asignatura(codigo,nombre,carrera,tipo,creditos);
                        }

                    }
                    if(tfg!=null){
                        ((ListaAsignaturas) adapter.getItem(0)).setAsignaturas(obligatorias,tfg);
                    } else{
                        ((ListaAsignaturas) adapter.getItem(0)).setAsignaturas(obligatorias);
                    }
                    ((ListaAsignaturas) adapter.getItem(1)).setAsignaturas(optativas);
                    ((ListaAsignaturas) adapter.getItem(2)).setAsignaturas(transversales);
                } catch (Exception e) {
                    Log.e("KJ",e.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if(error.networkResponse.statusCode==400){
                    Toast toast = Toast.makeText(getApplicationContext(), "Matricula ya realizada", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Inaccesible", Toast.LENGTH_SHORT);
                    toast.show();
                }
                Intent intent = new Intent(getApplicationContext(), CuentaAlumno.class);
                startActivity(intent);
            }
        });

        jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

        JsonRequest jr2 = new JsonObjectRequest(Request.Method.GET, "http://" + ip + ":9200/creditosalumno/"+expediente , null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    creditosObligatorios = response.getInt("CreditosObligatorios");
                    creditosOptativos = response.getInt("CreditosOptativos");
                    creditosTransversales = response.getInt("CreditosTransversales");
                    creditosOptativosExtra = response.getInt("CreditosOptativosExtra");
                    creditosGlobales = creditosObligatorios + creditosOptativos + creditosTransversales;
                    ((ListaAsignaturas) adapter.getItem(0)).setCreditos(creditosObligatorios);
                    ((ListaAsignaturas) adapter.getItem(0)).setCreditosGlobales(creditosGlobales);
                    ((ListaAsignaturas) adapter.getItem(1)).setCreditos(creditosOptativos + creditosOptativosExtra);
                    ((ListaAsignaturas) adapter.getItem(1)).setCreditosGlobales(creditosGlobales);
                    ((ListaAsignaturas) adapter.getItem(2)).setCreditos(creditosTransversales);
                    ((ListaAsignaturas) adapter.getItem(2)).setCreditosGlobales(creditosGlobales);
                    rq.add(jr);
                } catch (Exception e) {
                    Log.e("KJ",e.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                Toast toast = Toast.makeText(getApplicationContext(), "Inaccesible", Toast.LENGTH_SHORT);
                toast.show();
                finishActivity(0);
            }
        });

        jr2.setRetryPolicy(new DefaultRetryPolicy(2500,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        rq.add(jr2);

        elegir_asignaturas_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    JSONArray seleccionadas = new JSONArray();
                    ArrayList<Integer> codigos = getCodigos();
                    JSONArray data = new JSONArray(datos);
                    for(int i = 0; i<data.length(); i++){
                        JSONObject asignaturaGrupos = data.getJSONObject(i);
                        JSONObject asignatura = asignaturaGrupos.getJSONObject("Asignatura");
                        int codigo = asignatura.getInt("Codigo");
                        if(codigos.contains(codigo)){
                            seleccionadas.put(asignaturaGrupos);
                        }
                    }
                    if(seleccionadas.length()==0){
                        Toast toast = Toast.makeText(getApplicationContext(), "Ninguna asignatura seleccionada", Toast.LENGTH_SHORT);
                        toast.show();
                    }else{
                        Intent intent = new Intent(getApplicationContext(), ElegirGrupos.class);
                        intent.putExtra("Asignaturas",seleccionadas.toString());
                        startActivity(intent);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        });

    }

    public int getCreditosGlobales(){
        return creditosGlobales;
    }

    public ArrayList<Integer> getCodigos(){
        ArrayList<Integer> codigos = new ArrayList<>();
        for(int i = 0; i<3; i++){
            ListaAsignaturas la = (ListaAsignaturas) adapter.getItem(i);
            codigos.addAll(la.getCodigos());
        }
        return codigos;
    }

    public void addCreditosGlobales(int num){
        creditosGlobales+=num;
        Log.e("KIJBN",String.valueOf(creditosGlobales));
        ((ListaAsignaturas) adapter.getItem(0)).setCreditosGlobales(creditosGlobales);
        ((ListaAsignaturas) adapter.getItem(1)).setCreditosGlobales(creditosGlobales);
        ((ListaAsignaturas) adapter.getItem(2)).setCreditosGlobales(creditosGlobales);
    }
}
