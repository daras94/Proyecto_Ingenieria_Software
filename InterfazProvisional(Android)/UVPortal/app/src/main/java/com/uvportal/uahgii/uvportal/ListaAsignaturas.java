package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Daniel on 17/12/2017.
 */

public class ListaAsignaturas extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_lista_asignaturas, container, false);

        ListView listaCarreras = (ListView) rootView.findViewById(R.id.lista_asignaturas);
        String[] carreras = {"PDL", "EOC", "ISA" , "BBDD", "RDC"};
        ArrayList<String> carrerasList = new ArrayList<>(Arrays.asList(carreras));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.asignatura_item,R.id.txt_asignatura_item,carrerasList);
        listaCarreras.setAdapter(adapter);

        listaCarreras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CheckBox cb = view.findViewById(R.id.checkbox_asignatura);
                cb.setChecked(!cb.isChecked());
            }
        });

        return rootView;
    }
}
