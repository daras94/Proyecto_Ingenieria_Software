package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
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
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class ReservaEspacio extends AppCompatActivity {

    private String ip;

    private ListView horas_list;

    private String fecha;
    private int codigo;
    private String nif;
    private int hora;

    private ArrayList<String> horasLibres;

    private RequestQueue rq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_espacio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        codigo = intent.getIntExtra("espacio",1);
        fecha = intent.getStringExtra("fecha");

        horas_list = (ListView) findViewById(R.id.lista_reservas_espacio);

        rq = Volley.newRequestQueue(this);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");
        SharedPreferences sp2 = getSharedPreferences("usuario",MODE_PRIVATE);
        nif = sp2.getString("nif","0");

        horasLibres = new ArrayList<>();

        JsonRequest jr = new JsonArrayRequest(Request.Method.GET, "http://" + ip + ":9400/reservas/disponibles/horas?dia="+fecha+"&espacio="+codigo, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    Log.e("lista",response.toString());
                    horasLibres.clear();
                    for (int i = 0; i < response.length(); i++) {
                        horasLibres.add(String.valueOf(response.getInt(i)));
                    }
                    ArrayAdapter<String> aa = new ArrayAdapter<>(getApplicationContext(),R.layout.list_item_simple,R.id.txt_carrera_item,horasLibres);
                    horas_list.setAdapter(aa);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error",error.toString());
            }
        });

        jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        rq.add(jr);

        horas_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                hora = Integer.parseInt(horasLibres.get(i));

                JSONObject reserva = new JSONObject();

                try {
                    reserva.put("NIF", nif);
                    reserva.put("Espacio",codigo);
                    reserva.put("Fecha",fecha);
                    reserva.put("Hora",hora);
                }catch(JSONException e){
                    e.printStackTrace();
                }

                JsonRequest jr = new JsonObjectRequest(Request.Method.POST, "http://" + ip + ":9400/reservas/reservar", reserva, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            horasLibres.remove(i);
                            ((ArrayAdapter)horas_list.getAdapter()).notifyDataSetChanged();
                            Toast toast = Toast.makeText(getApplicationContext(), "Reservado correctamente", Toast.LENGTH_SHORT);
                            toast.show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });

                jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                rq.add(jr);

            }
        });
    }

}
