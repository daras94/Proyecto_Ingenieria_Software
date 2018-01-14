package com.uvportal.uahgii.uvportal;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 12/01/2018.
 */

public class AsignaturasMatriculadasAdapter extends ArrayAdapter {


    public AsignaturasMatriculadasAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Asignatura asignatura = (Asignatura) getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_asig_matriculada, parent, false);


        TextView txtNombre = (TextView) convertView.findViewById(R.id.txt_nombre);
        TextView txtTipo = (TextView) convertView.findViewById(R.id.txt_tipo);
        TextView txtCreditos = (TextView) convertView.findViewById(R.id.txt_creditos);
        TextView txtNota = (TextView) convertView.findViewById(R.id.txt_nota);

        txtNombre.setText(asignatura.getNombre());
        txtTipo.setText(asignatura.getTipo());
        txtCreditos.setText(String.valueOf(asignatura.getCreditos()));
        txtNota.setText(String.valueOf(asignatura.getNota()));

        return convertView;
    }
}
