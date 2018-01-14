package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class CuentaAlumno extends AppCompatActivity {

    private Button datos_button;
    private Button ver_matriculas_button;
    private Button reservar_matricula_button;
    private Button realizar_matricula_button;

    private String ip;

    private String expediente;

    private RequestQueue rq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_alumno);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        datos_button = (Button) findViewById(R.id.button_ver_datos);
        ver_matriculas_button = (Button) findViewById(R.id.button_ver_matriculas);
        reservar_matricula_button = (Button) findViewById(R.id.button_reservar_matricula);
        realizar_matricula_button = (Button) findViewById(R.id.button_realizar_matricula);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");
        SharedPreferences sp2 = getSharedPreferences("usuario",MODE_PRIVATE);
        expediente = sp2.getString("expediente","0");

        rq = Volley.newRequestQueue(this);

        datos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),DatosAlumno.class);
                startActivity(intent);
            }
        });

        ver_matriculas_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MatriculasAlumno.class);
                 startActivity(intent);
            }
        });

        reservar_matricula_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JsonRequest jr = new JsonObjectRequest(Request.Method.POST, "http://" + ip + ":9200/realizarReserva/"+expediente , new JSONObject(), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try{
                            Toast toast = Toast.makeText(getApplicationContext(), "Reserva realizada", Toast.LENGTH_SHORT);
                            toast.show();
                        } catch (Exception e) {
                            Log.e("KJ",e.toString());
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        if(error.networkResponse.statusCode==0){
                            Toast toast = Toast.makeText(getApplicationContext(), "Inaccesible", Toast.LENGTH_SHORT);
                            toast.show();
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(), "Reserva ya existente", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                });

                jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                rq.add(jr);
            }
        });

        realizar_matricula_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ElegirAsignaturas.class);
                startActivity(intent);
            }
        });
    }

}
