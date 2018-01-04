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

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class Login extends AppCompatActivity  {


    // UI references.
    private EditText IPView;
    private EditText NIFView;
    private EditText PassView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();


        // Set up the login form.
        IPView = (EditText) findViewById(R.id.ip);

        NIFView = (EditText) findViewById(R.id.nif);

        PassView = (EditText) findViewById(R.id.password);

        if(intent.hasExtra("nif")){
            NIFView.setText(intent.getStringExtra("nif"));
        }

        Button accederButton = (Button) findViewById(R.id.nif_sign_in_button);
        accederButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CuentaAlumno.class);
                startActivity(intent);
            }
        });

        Button nuevoAlumnoButton = (Button) findViewById(R.id.register_button);
        nuevoAlumnoButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("ip",MODE_PRIVATE);
                SharedPreferences.Editor e = sp.edit();
                e.putString("ip",IPView.getText().toString().trim());
                e.commit();
                Log.d("IP",sp.getString("ip","localhost"));
                Log.d("IP",sp.getString("ip",IPView.getText().toString().trim() ));
                Intent intent = new Intent(getApplicationContext(), IntroducirUsuario.class);
                startActivity(intent);
            }
        });
    }




}

