package com.uvportal.uahgii.uvportal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

import org.json.JSONObject;

public class DatosAlumno extends AppCompatActivity {

    private String ip;

    private String NIF;

    private RequestQueue rq;

    private TextView nombre_textview;
    private TextView nif_textview;
    private TextView carrera_textview;
    private TextView email_textview;
    private TextView cc_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_alumno);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");
        SharedPreferences sp2 = getSharedPreferences("usuario",MODE_PRIVATE);
        NIF = sp2.getString("nif","0");

        nombre_textview = (TextView) findViewById(R.id.textview_nombre);
        nif_textview = (TextView) findViewById(R.id.textview_nif);
        carrera_textview = (TextView) findViewById(R.id.textview_carrera);
        email_textview = (TextView) findViewById(R.id.textview_email);
        cc_textview = (TextView) findViewById(R.id.textview_cc);

        rq = Volley.newRequestQueue(this);

        JsonRequest jr = new JsonObjectRequest(Request.Method.GET, "http://" + ip + ":9100/alumnoByNIF/"+NIF , null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    String nombre = response.getString("Nombre");
                    String apellido1 = response.getString("Apellido1");
                    String apellido2 = response.getString("Apellido2");
                    int carrera = response.getInt("Carrera");
                    String email = response.getString("Email");
                    String cc = response.getString("CuentaCorriente");

                    nombre_textview.setText(nombre+" "+apellido1+" "+apellido2);
                    nif_textview.setText(NIF);
                    carrera_textview.setText(String.valueOf(carrera));
                    email_textview.setText(email);
                    cc_textview.setText(cc);

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
    }

}
