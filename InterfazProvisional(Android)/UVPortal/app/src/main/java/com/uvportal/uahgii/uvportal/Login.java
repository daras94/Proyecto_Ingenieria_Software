package com.uvportal.uahgii.uvportal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
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

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class Login extends AppCompatActivity  {

    private EditText NIFView;
    private EditText PassView;

    private String ip;

    private String nif;
    private String pass;

    private RequestQueue rq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");

        NIFView = (EditText) findViewById(R.id.nif);

        PassView = (EditText) findViewById(R.id.password);

        Intent intent = getIntent();
        if(intent.getStringExtra("login")!=null){
            NIFView.setText(intent.getStringExtra("login"));
        }

        rq = Volley.newRequestQueue(this);

        Button accederButton = (Button) findViewById(R.id.nif_sign_in_button);
        accederButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                nif = NIFView.getText().toString().trim();
                pass = PassView.getText().toString().trim();

                JsonRequest jr = new JsonObjectRequest(Request.Method.POST, "http://" + ip + ":9300/login?nif="+ nif +"&password="+ pass , null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try{

                            String nif = response.getString("nif");
                            String expediente = response.getString("num_expediente");

                            SharedPreferences sp = getSharedPreferences("usuario", MODE_PRIVATE);
                            SharedPreferences.Editor e = sp.edit();
                            e.putString("nif", nif);
                            e.putString("expediente",expediente);
                            e.commit();

                            String tipo = response.getString("tipo_user");
                            if(tipo.equals("ALUMNO")){
                                e.putString("expediente",expediente);
                                e.commit();
                                Intent intent = new Intent(getApplicationContext(), CuentaAlumno.class);
                                startActivity(intent);
                            }else if (tipo.equals("PROFESOR")) {
                                e.putString("expediente","");
                                e.commit();
                                Intent intent = new Intent(getApplicationContext(), CuentaProfesor.class);
                                startActivity(intent);
                            }else{
                                Toast toast = Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT);
                                toast.show();

                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        if(error.networkResponse.statusCode == 400){
                            Toast toast = Toast.makeText(getApplicationContext(), "NIF o contraseña incorrectos", Toast.LENGTH_SHORT);
                            toast.show();
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                });

                jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                rq.add(jr);


            }
        });

        Button nuevoAlumnoButton = (Button) findViewById(R.id.register_button);
        nuevoAlumnoButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IntroducirUsuario.class);
                startActivity(intent);
            }
        });
    }




}

