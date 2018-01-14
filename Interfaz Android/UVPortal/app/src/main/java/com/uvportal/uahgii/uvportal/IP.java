package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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

/**
 * A login screen that offers login via email/password.
 */
public class IP extends AppCompatActivity  {


    // UI references.
    private EditText IPView;

    private RequestQueue rq;

    private String ip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);

        Intent intent = getIntent();

        rq = Volley.newRequestQueue(this);

        IPView = (EditText) findViewById(R.id.ip);

        Button nuevoAlumnoButton = (Button) findViewById(R.id.ip_enter_button);
        nuevoAlumnoButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                ip = IPView.getText().toString().trim();

                try {
                    SharedPreferences sp = getSharedPreferences("ip", MODE_PRIVATE);
                    SharedPreferences.Editor e = sp.edit();
                    e.putString("ip", IPView.getText().toString().trim());
                    e.commit();
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent);
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Ip no valida", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

    }




}

