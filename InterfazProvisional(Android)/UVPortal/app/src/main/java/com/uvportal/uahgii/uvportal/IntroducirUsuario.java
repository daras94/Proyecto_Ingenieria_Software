package com.uvportal.uahgii.uvportal;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;

import org.json.JSONObject;

import java.util.Calendar;

public class IntroducirUsuario extends AppCompatActivity {

    EditText nif;
    EditText pass;
    EditText email;
    EditText nombre;
    EditText apellido1;
    EditText apellido2;
    EditText cc;
    EditText fecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_usuario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //comprobarAlumno();
                Intent intent = new Intent(getApplicationContext(), ElegirCarrera.class);
                Bundle b = new Bundle();
                b.putString("nif",nif.getText().toString());
                b.putString("pass",pass.getText().toString());
                b.putString("email",email.getText().toString());
                b.putString("nombre",nombre.getText().toString());
                b.putString("apellido1",apellido1.getText().toString());
                b.putString("apellido2",apellido2.getText().toString());
                b.putString("cc",cc.getText().toString());
                b.putString("fecha",fecha.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        nif = (EditText) findViewById(R.id.nif);

        pass = (EditText) findViewById(R.id.password);

        email = (EditText) findViewById(R.id.email);

        nombre = (EditText) findViewById(R.id.nombre);


        apellido1 = (EditText) findViewById(R.id.apellido1);

        apellido2 = (EditText) findViewById(R.id.apellido2);

        cc = (EditText) findViewById(R.id.cuenta_corriente);

        fecha = (EditText) findViewById(R.id.fecha_nacimiento);
        fecha.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(final View view, boolean b) {
                if(b){
                    Calendar c = Calendar.getInstance();
                    DatePickerDialog dpd = new DatePickerDialog(IntroducirUsuario.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                            EditText et = (EditText) view;
                            et.setText(i+"-"+(i1+1)+"-"+i2);
                        }
                    },c.get(Calendar.YEAR)-18, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
                    dpd.show();
                    view.clearFocus();
                }
            }
        });

    }

    /*private void comprobarAlumno() {
        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        String ip = sp.getString("ip","localhost");
        JsonRequest jr = new JsonObjectRequest(Request.Method.GET, "http://" + ip + ":9000/alumno/" + nif.getText().toString(), null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }*/

}
