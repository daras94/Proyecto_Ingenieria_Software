package com.uvportal.uahgii.uvportal;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MatriculasAlumno extends AppCompatActivity {

    private Spinner año_spinner;
    private ListView asignaturas_list;

    private String ip;
    private String expediente;

    private HashMap<Integer,ArrayList<Asignatura>> matriculas;

    private ArrayList<Integer> añosList;

    private RequestQueue rq;

    private AsignaturasMatriculadasAdapter aa;
    private ArrayAdapter<Integer> sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matriculas_alumno);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        año_spinner = (Spinner) findViewById(R.id.spinner_año);
        asignaturas_list = (ListView) findViewById(R.id.lista_asignaturas);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");
        SharedPreferences sp2 = getSharedPreferences("usuario",MODE_PRIVATE);
        expediente = sp2.getString("expediente","0");

        rq= Volley.newRequestQueue(this);

        matriculas = new HashMap<>();
        añosList = new ArrayList<>();

        JsonRequest jr = new JsonArrayRequest(Request.Method.GET, "http://" + ip + ":9200/verExpediente/"+expediente , null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try{

                    ArrayList<Asignatura> asignaturasList = new ArrayList<>();
                    for(int i = 0; i<response.length(); i++){
                        asignaturasList = new ArrayList<>();
                        JSONObject matricula = response.getJSONObject(i);
                        int año = matricula.getInt("Anno");
                        JSONArray asignaturas = matricula.getJSONArray("Asignaturas");
                        for(int j = 0; j<asignaturas.length(); j++){
                            JSONObject asignaturaMat = asignaturas.getJSONObject(j);
                            JSONObject asignatura = asignaturaMat.getJSONObject("Asignatura");
                            int codigo = asignatura.getInt("Codigo");
                            String nombre = asignatura.getString("Nombre");
                            int carrera = asignatura.getInt("Carrera");
                            String tipo = asignatura.getString("Tipo");
                            int creditos= asignatura.getInt("Creditos");
                            double nota = asignaturaMat.getDouble("Nota");
                            Asignatura asig = new Asignatura(codigo,nombre,carrera,tipo,creditos,nota);
                            asignaturasList.add(asig);
                        }
                        matriculas.put(año,asignaturasList);
                        añosList.add(año);
                    }

                    Collections.sort(añosList,Collections.<Integer>reverseOrder());

                    aa = new AsignaturasMatriculadasAdapter(getApplicationContext(),asignaturasList);
                    asignaturas_list.setAdapter(aa);

                    sa = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item,añosList);
                    sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    año_spinner.setAdapter(sa);

                } catch (Exception e) {
                    e.printStackTrace();
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

        año_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) view).setTextColor(Color.BLACK);
                ((TextView) view).setGravity(Gravity.CENTER);
                aa = new AsignaturasMatriculadasAdapter(getApplicationContext(),matriculas.get(añosList.get(i)));
                asignaturas_list.setAdapter(aa);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
