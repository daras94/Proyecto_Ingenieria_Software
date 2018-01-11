package com.uvportal.uahgii.uvportal;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
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

import java.util.ArrayList;
import java.util.Calendar;

public class TipoReserva extends AppCompatActivity {

    private Button fecha_button;
    private Button reserva_espacio_button;
    private Button reserva_hora_button;

    private Spinner hora_spinner;
    private Spinner espacio_spinner;

    private TextView precio_textview;
    private TextView aforo_textview;

    private String ip;

    private ArrayList<Espacio> espacios;
    private ArrayList<String> nombre_espacios;

    private RequestQueue rq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_reserva);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        fecha_button = (Button) findViewById(R.id.button_fecha);
        reserva_espacio_button = (Button) findViewById(R.id.button_espacio);
        reserva_espacio_button.setEnabled(false);
        reserva_hora_button = (Button) findViewById(R.id.button_hora);

        hora_spinner = (Spinner) findViewById(R.id.spinner_hora);
        espacio_spinner = (Spinner) findViewById(R.id.spinner_espacio);

        precio_textview = (TextView) findViewById(R.id.textview_precio);
        aforo_textview = (TextView) findViewById(R.id.textview_aforo);

        SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
        ip = sp.getString("ip","localhost");

        rq = Volley.newRequestQueue(this);

        fecha_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c = Calendar.getInstance();
                DatePickerDialog dpd = new DatePickerDialog(TipoReserva.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        fecha_button.setText(i+"-"+(i1+1)+"-"+i2);
                    }
                },c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
                dpd.show();
            }
        });

        reserva_espacio_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReservaEspacio.class);
                intent.putExtra("fecha",fecha_button.getText().toString());
                int codigo = espacios.get(espacio_spinner.getSelectedItemPosition()).getCodigo();
                intent.putExtra("espacio",codigo);
                startActivity(intent);
            }
        });

        espacios = new ArrayList<>();
        nombre_espacios = new ArrayList<>();

        JsonRequest jr = new JsonArrayRequest(Request.Method.GET, "http://" + ip + ":9400/espacios" , null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try{
                    for(int i = 0; i<response.length(); i++){
                        JSONObject espacio = response.getJSONObject(i);
                        int codigo  = espacio.getInt("Codigo");
                        String nombre  = espacio.getString("Nombre");
                        double precio = espacio.getDouble("Precio");
                        int aforo = espacio.getInt("Aforo");

                        nombre_espacios.add(nombre);
                        espacios.add(new Espacio(codigo,nombre,precio,aforo));
                    }

                    ArrayAdapter<Integer> aa = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item,nombre_espacios);
                    aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    espacio_spinner.setAdapter(aa);

                    reserva_espacio_button.setEnabled(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast toast = Toast.makeText(getApplicationContext(), "Inaccesible", Toast.LENGTH_SHORT);
                toast.show();
                finishActivity(0);
            }
        });

        jr.setRetryPolicy(new DefaultRetryPolicy(0,DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        rq.add(jr);

        espacio_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) view).setTextColor(Color.BLACK);
                ((TextView) view).setGravity(Gravity.CENTER);
                precio_textview.setText(String.valueOf(espacios.get(i).getPrecio()));
                aforo_textview.setText(String.valueOf(espacios.get(i).getAforo()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Integer[] horas = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};

        ArrayAdapter<Integer> aa = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item,horas);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hora_spinner.setAdapter(aa);

        hora_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView) view).setTextColor(Color.BLACK);
                ((TextView) view).setGravity(Gravity.CENTER);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
