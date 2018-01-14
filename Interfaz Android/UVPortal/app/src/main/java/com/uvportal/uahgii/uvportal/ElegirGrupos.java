package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class ElegirGrupos extends AppCompatActivity {

    private String ip;
    private String expediente;

    private RequestQueue rq;

    private String datos;

    private Spinner pago_spinner;

    private ArrayList<Integer> pagos;

    private ArrayList<Asignatura> listaAsignatura;

    private LinearLayout listViewGrupos;

    private Spinner.OnItemSelectedListener oisl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_grupos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        datos = intent.getStringExtra("Asignaturas");

        oisl = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) view).setTextColor(Color.BLACK);
                ((TextView) view).setGravity(Gravity.CENTER);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

        pagos =new ArrayList<>();
        pagos.add(1);
        pagos.add(2);
        pagos.add(3);
        pago_spinner = (Spinner) findViewById(R.id.spinner_pago);
        ArrayAdapter<Integer>  aap = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,pagos);
        aap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pago_spinner.setAdapter(aap);
        pago_spinner.setOnItemSelectedListener(oisl);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    JSONObject matriculaAlta = new JSONObject();
                    JSONArray grupos = new JSONArray();
                    for(int i = 0; i<listViewGrupos.getChildCount()/2+1;i++){
                        Log.e("IKJHB",String.valueOf(i));
                        View v = (View) listViewGrupos.getChildAt(i*2);
                        Log.e("IKJHB",String.valueOf(i*2));
                        JSONObject asignatura = new JSONObject();
                        asignatura.put("CodigoAsignatura",listaAsignatura.get(i).getCodigo());

                        Log.e("IKJHB",listaAsignatura.get(i).getNombre());

                        Spinner teo = (Spinner) v.findViewById(R.id.spinner_teoria);
                        Spinner lab = (Spinner) v.findViewById(R.id.spinner_lab);

                        int codTeo = (int) teo.getSelectedItem();
                        int codLab = (int) lab.getSelectedItem();

                        asignatura.put("CodigoGrupoTeoria",codTeo);
                        asignatura.put("CodigoGrupoLab",codLab);
                        grupos.put(asignatura);
                    }
                    matriculaAlta.put("Grupos",grupos);
                    Spinner pago = (Spinner) findViewById(R.id.spinner_pago);
                    int tipoPago = (int) pago.getSelectedItem();
                    Log.e("LKJN",String.valueOf(tipoPago));
                    matriculaAlta.put("TipoPago",tipoPago);


                    Log.e("qwerty",matriculaAlta.toString());

                    JsonRequest jr = new JsonObjectRequest(Request.Method.POST, "http://" + ip + ":9200/crearMatricula/"+expediente , matriculaAlta, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            try{
                                Toast toast = Toast.makeText(getApplicationContext(), "Matricula realizada", Toast.LENGTH_SHORT);
                                toast.show();
                                Intent intent = new Intent(getApplicationContext(), CuentaAlumno.class);
                                startActivity(intent);
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

                    jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                    rq.add(jr);

                }catch(JSONException e){
                    Log.e("qwerty",e.toString());
                    e.printStackTrace();
                }
            }
        });

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");
        SharedPreferences sp2 = getSharedPreferences("usuario",MODE_PRIVATE);
        expediente = sp2.getString("expediente","0");

        listViewGrupos = (LinearLayout) findViewById(R.id.lista_grupos);


        listaAsignatura = new ArrayList<>();

        rq = Volley.newRequestQueue(this);

        try{
            JSONArray asigGrupos = new JSONArray(datos);
            Log.e("JKHB",datos);
            Log.e("JKHB",String.valueOf(asigGrupos.length()));
            for(int i = 0; i<asigGrupos.length(); i++){
                View v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.list_item_asig_grupos,listViewGrupos,false);
                Spinner teoriaSpinner = v.findViewById(R.id.spinner_teoria);
                Spinner labSpinner = v.findViewById(R.id.spinner_lab);
                JSONObject asignaturaGrupos = asigGrupos.getJSONObject(i);
                JSONObject asignatura = asignaturaGrupos.getJSONObject("Asignatura");
                int codigo = asignatura.getInt("Codigo");
                String nombre = asignatura.getString("Nombre");
                int carrera = asignatura.getInt("Carrera");
                String tipo = asignatura.getString("Tipo");
                int creditos= asignatura.getInt("Creditos");
                TextView nom = v.findViewById(R.id.txt_nombre);
                nom.setText(nombre);
                Asignatura a = new Asignatura(codigo,nombre,carrera,tipo,creditos);
                listaAsignatura.add(a);
                JSONArray grupos = asignaturaGrupos.getJSONArray("Grupos");
                ArrayList<Integer> listaGruposT = new ArrayList<>();
                ArrayList<Integer> listaGruposL = new ArrayList<>();
                for(int j = 0; j < grupos.length(); j++){
                    JSONObject grupo = grupos.getJSONObject(j);
                    int id = grupo.getInt("IdGrupo");
                    int miembros = grupo.getInt("Miembros");
                    String tipoGrupo = grupo.getString("Tipo");
                    if(tipoGrupo.equals("T")){
                        listaGruposT.add(id);
                    }else{
                        listaGruposL.add(id);
                    }
                }

                ArrayAdapter<Integer>  aat = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,listaGruposT);
                aat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                teoriaSpinner.setAdapter(aat);
                teoriaSpinner.setOnItemSelectedListener(oisl);


                ArrayAdapter<Integer>  aal = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,listaGruposL);
                aal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                labSpinner.setAdapter(aal);
                labSpinner.setOnItemSelectedListener(oisl);
                Log.e("count",String.valueOf(listViewGrupos.getChildCount()));
                listViewGrupos.addView(v);
                Log.e("count",String.valueOf(listViewGrupos.getChildCount()));


                if(i!=asigGrupos.length()-1){
                    View vi = new View(getApplicationContext());
                    vi.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,5));
                    vi.setBackgroundColor(Color.GRAY);
                    listViewGrupos.addView(vi);
                }

            }

        }catch(Exception e){
            Log.e("qwerty",e.toString());
        }



    }


    private void realizarMatricula(){


    }

}
