package com.uvportal.uahgii.uvportal;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.database.Cursor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.HashMap;

public class ElegirCarrera extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>{

    JSONObject alumno;

    ListView listaCarreras;

    HashMap<String,Integer> carrerasMap = new HashMap<>();

    ArrayList<String> carreras = new ArrayList<>();

    String ip;

    String nif;

    ArrayAdapter<String> adapter;

    RequestQueue rq;

    ProgressBar pgb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_carrera);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        rq = Volley.newRequestQueue(this);

        pgb = (ProgressBar) findViewById(R.id.load);

        nif = b.get("nif").toString();
        String pass = b.get("pass").toString();
        String email = b.get("email").toString();
        String nombre = b.get("nombre").toString();
        String apellido1 = b.get("apellido1").toString();
        String apellido2 = b.get("apellido2").toString();
        String cc = b.get("cc").toString();
        String fecha = b.get("fecha").toString();

        listaCarreras = (ListView) findViewById(R.id.lista_carreras);

        alumno = new JSONObject();

        try {
            alumno.put("NIF",nif);
            alumno.put("Contrasenna",pass);
            alumno.put("Nombre",nombre);
            alumno.put("Apellido1",apellido1);
            alumno.put("Apellido2",apellido2);
            alumno.put("FechaNacimiento",fecha);
            alumno.put("Email",email);
            alumno.put("CuentaCorriente",cc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");


        JsonRequest jr = new JsonArrayRequest(Request.Method.GET, "http://" + ip + ":9000/carreras", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    for (int i = 0; i < response.length(); i++) {

                        String nombre = response.getJSONObject(i).getString("Nombre");
                        Log.d("nombre", nombre);
                        Integer codigo = response.getJSONObject(i).getInt("Codigo");
                        carrerasMap.put(nombre, codigo);
                        adapter.add(nombre);

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                pgb.setVisibility(View.INVISIBLE);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error",error.toString());
            }
        });

        jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        rq.add(jr);

        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.list_item_simple,R.id.txt_carrera_item,new ArrayList<String>());
        listaCarreras.setAdapter(adapter);

        Log.d("QWERT","Request enviada");

        listaCarreras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView txt = view.findViewById(R.id.txt_carrera_item);
                String nombre = txt.getText().toString();
                int codigo = carrerasMap.get(nombre);
                try {
                    alumno.put("Carrera",codigo);
                    alumno.put("Expediente",0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                enviarAlumno();
            }
        });


    }

    public void enviarAlumno(){
        JsonRequest jr = new JsonObjectRequest(Request.Method.POST, "http://" + ip + ":9000/alumno", alumno, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                intent.putExtra("login",nif);
                startActivity(intent);
            }
        },null);
        jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        rq.add(jr);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
