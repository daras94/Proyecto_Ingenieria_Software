package com.uvportal.uahgii.uvportal;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Daniel on 10/01/2018.
 */

public class ReservasListAdapter extends ArrayAdapter {


    public ReservasListAdapter(@NonNull Context context, @NonNull List reservas) {
        super(context, 0,reservas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Reserva reserva = (Reserva) getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_reserva, parent, false);


        TextView txtEspacio = (TextView) convertView.findViewById(R.id.txt_espacio);
        TextView txtFecha = (TextView) convertView.findViewById(R.id.txt_fecha);
        TextView txtHora = (TextView) convertView.findViewById(R.id.txt_hora);

        txtEspacio.setText(String.valueOf(reserva.getEspacio()));
        txtFecha.setText(reserva.getFecha());
        txtHora.setText(String.valueOf(reserva.getHora()));

        return convertView;
    }
}
