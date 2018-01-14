package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CuentaProfesor extends AppCompatActivity {

    private Button realizar_reservas_button;

    private Button ver_reservas_button;

    private Button actas_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_profesor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        realizar_reservas_button = (Button) findViewById(R.id.button_realizar_reservas);
        ver_reservas_button = (Button) findViewById(R.id.button_ver_reservas);
        actas_button = (Button) findViewById(R.id.button_actas);

        realizar_reservas_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TipoReserva.class);
                startActivity(intent);
            }
        });

        ver_reservas_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VerReservas.class);
                startActivity(intent);
            }
        });
    }

}
