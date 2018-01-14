package com.uvportal.uahgii.uvportal;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
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
import java.util.HashMap;
import java.util.Map;

public class VerReservas extends AppCompatActivity {

    private ListView reservas_list;

    private ArrayList<Reserva> reservas;

    private String ip;

    private String nif;

    private RequestQueue rq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_reservas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");
        SharedPreferences sp2 = getSharedPreferences("usuario",MODE_PRIVATE);
        nif = sp2.getString("nif","0");

        rq = Volley.newRequestQueue(this);

        reservas_list = (ListView) findViewById(R.id.lista_reservas);

        reservas = new ArrayList<>();

        JsonRequest jr = new JsonArrayRequest(Request.Method.GET, "http://" + ip + ":9400/reservas/"+nif , null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try{
                    for(int i = 0; i<response.length(); i++){
                        JSONObject reserva = response.getJSONObject(i);
                        int espacio  = reserva.getInt("Espacio");
                        String fecha  = reserva.getString("Fecha");
                        int hora = reserva.getInt("Hora");

                        reservas.add(new Reserva(espacio,fecha,hora,nif));
                    }

                    ReservasListAdapter aa = new ReservasListAdapter(getApplicationContext(),reservas);
                    reservas_list.setAdapter(aa);

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
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<>();
                /*params.put("User-Agent", "Nintendo Gameboy");
                params.put("Accept-Language", "fr");*/

                return params;
            }
        };


        jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        rq.add(jr);

        reservas_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, View view, final int i, long l) {
                Reserva reserva = reservas.get(i);
                final int espacio  = reserva.getEspacio();
                final String fecha  = reserva.getFecha();
                final int hora = reserva.getHora();

                AlertDialog.Builder builder = new AlertDialog.Builder(VerReservas.this,R.style.Theme_AppCompat_Dialog);
                builder.setTitle("Confirmar");
                builder.setMessage("Quiere cancelar la reserva?");

                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        JsonRequest jr = new JsonObjectRequest(Request.Method.DELETE, "http://" + ip + ":9400/reservas/cancelar?dia="+fecha+"&hora="+hora+"&espacio="+espacio , null, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                try{

                                    reservas.remove(i);
                                    ((ReservasListAdapter) reservas_list.getAdapter()).notifyDataSetChanged();
                                    Toast toast = Toast.makeText(getApplicationContext(), "Cancelado correctamente", Toast.LENGTH_SHORT);
                                    toast.show();

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

                        dialog.dismiss();
                    }
                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();

            }
        });
    }

}
