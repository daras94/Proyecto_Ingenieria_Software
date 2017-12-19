package com.uvportal.uahgii.uvportal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class ElegirAsignaturas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_asignaturas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AsignaturasAdapter adapter = new AsignaturasAdapter(getSupportFragmentManager());

        ViewPager viewPagerAsignaturas = (ViewPager) findViewById(R.id.viewpager_asignaturas) ;

        viewPagerAsignaturas.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_asignaturas);

        tabLayout.setupWithViewPager(viewPagerAsignaturas);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
