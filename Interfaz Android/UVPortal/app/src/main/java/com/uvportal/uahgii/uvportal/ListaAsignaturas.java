package com.uvportal.uahgii.uvportal;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Daniel on 17/12/2017.
 */

public class ListaAsignaturas extends Fragment {

    private String tipo;

    private ArrayList<Asignatura> asignaturas;

    private Asignatura tfg;

    private LinearLayout listaAsignaturas;

    private int creditosTipo;

    private int creditosGlobales;

    private ViewGroup lista;

    private ArrayList<CheckBox> views;

    private HashMap<CompoundButton,Asignatura> relacion;

    private View tfg_view;

    private TextView tipo_txt;
    private TextView cred_tipo_txt;
    private TextView cred_glob_txt;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        String tipo = getArguments().getString("Tipo");
        this.tipo = tipo;

        View rootView = inflater.inflate(R.layout.fragment_lista_asignaturas, container, false);

        listaAsignaturas = rootView.findViewById(R.id.lista_asignaturas);

        views = new ArrayList<>();

        relacion = new HashMap<>();

        tipo_txt = rootView.findViewById(R.id.textview_tipo);
        cred_tipo_txt = rootView.findViewById(R.id.textview_cred_tipo);
        cred_glob_txt = rootView.findViewById(R.id.textview_cred_glob);

        tipo_txt.setText("Creditos "+tipo);

        return rootView;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas){
        try{
            this.asignaturas = asignaturas;

            for(int i = 0;i<asignaturas.size();i++){
                Asignatura a = asignaturas.get(i);
                View v = LayoutInflater.from(getContext()).inflate(R.layout.list_item_asig_matriculable, listaAsignaturas, false);
                TextView nombre_textview = v.findViewById(R.id.txt_nombre);
                TextView creditos_textview = v.findViewById(R.id.txt_creditos);
                CheckBox cb = v.findViewById(R.id.checkbox_asignatura);
                nombre_textview.setText(a.getNombre());
                creditos_textview.setText(String.valueOf(a.getCreditos()));
                relacion.put(cb,a);
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("JHNIO","check");
                        TextView tx = view.findViewById(R.id.txt_nombre);
                        Log.e("JHNIO",tx.getText().toString());
                        CheckBox cb = view.findViewById(R.id.checkbox_asignatura);
                        cb.setChecked(!cb.isChecked());
                        Log.e("JHNIO",String.valueOf(cb.isChecked()));

                    }
                });
                cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        Log.e("JHNIO","check");
                        if(b){
                            creditosTipo-=relacion.get(compoundButton).getCreditos();
                            ((ElegirAsignaturas)getActivity()).addCreditosGlobales(-(relacion.get(compoundButton).getCreditos()));
                        }else{
                            creditosTipo+=relacion.get(compoundButton).getCreditos();
                            ((ElegirAsignaturas)getActivity()).addCreditosGlobales(relacion.get(compoundButton).getCreditos());
                        }
                        cred_tipo_txt.setText(String.valueOf(creditosTipo));
                        activarAsignaturas();
                    }
                });
                views.add(cb);
                listaAsignaturas.addView(v);

                if(i!=asignaturas.size()-1){
                    View vi = new View(getContext());
                    vi.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,5));
                    vi.setBackgroundColor(Color.GRAY);
                    listaAsignaturas.addView(vi);
                }
            }

            activarAsignaturas();

        }catch(Exception e){
            Log.e("KJLNI",e.toString());
        }
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas, Asignatura tfg){
        try{
            this.asignaturas = asignaturas;
            this.tfg = tfg;

            for(int i = 0;i<asignaturas.size();i++){
                Asignatura a = asignaturas.get(i);
                View v = LayoutInflater.from(getContext()).inflate(R.layout.list_item_asig_matriculable, listaAsignaturas, false);
                TextView nombre_textview = v.findViewById(R.id.txt_nombre);
                TextView creditos_textview = v.findViewById(R.id.txt_creditos);
                CheckBox cb = v.findViewById(R.id.checkbox_asignatura);
                nombre_textview.setText(a.getNombre());
                creditos_textview.setText(String.valueOf(a.getCreditos()));
                relacion.put(cb,a);
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("JHNIO","check");
                        TextView tx = view.findViewById(R.id.txt_nombre);
                        Log.e("JHNIO",tx.getText().toString());
                        CheckBox cb = view.findViewById(R.id.checkbox_asignatura);
                        cb.setChecked(!cb.isChecked());
                        Log.e("JHNIO",String.valueOf(cb.isChecked()));
                    }
                });
                cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        Log.e("JHNIO","check");
                        if(b){
                            creditosTipo-=relacion.get(compoundButton).getCreditos();
                            ((ElegirAsignaturas)getActivity()).addCreditosGlobales(-(relacion.get(compoundButton).getCreditos()));
                        }else{
                            creditosTipo+=relacion.get(compoundButton).getCreditos();
                            ((ElegirAsignaturas)getActivity()).addCreditosGlobales(relacion.get(compoundButton).getCreditos());
                        }

                        cred_tipo_txt.setText(String.valueOf(creditosTipo));
                        activarAsignaturas();
                    }
                });
                views.add(cb);
                listaAsignaturas.addView(v);

                View vi = new View(getContext());
                vi.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,5));
                vi.setBackgroundColor(Color.GRAY);
                listaAsignaturas.addView(vi);


            }

            if(tfg!=null){
                View v = LayoutInflater.from(getContext()).inflate(R.layout.list_item_asig_matriculable, listaAsignaturas, false);
                TextView nombre_textview = v.findViewById(R.id.txt_nombre);
                TextView creditos_textview = v.findViewById(R.id.txt_creditos);
                CheckBox cb = v.findViewById(R.id.checkbox_asignatura);
                nombre_textview.setText(tfg.getNombre());
                creditos_textview.setText(String.valueOf(tfg.getCreditos()));
                relacion.put(cb,tfg);
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("JHNIO","check");
                        TextView tx = view.findViewById(R.id.txt_nombre);
                        Log.e("JHNIO",tx.getText().toString());
                        CheckBox cb = view.findViewById(R.id.checkbox_asignatura);
                        cb.setChecked(!cb.isChecked());
                        Log.e("JHNIO",String.valueOf(cb.isChecked()));
                    }
                });
                cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        Log.e("JHNIO","check");
                        /*if(b){
                            creditosTipo-=relacion.get(compoundButton).getCreditos();
                            ((ElegirAsignaturas)getActivity()).addCreditosGlobales(-(relacion.get(compoundButton).getCreditos()));
                        }else{
                            creditosTipo+=relacion.get(compoundButton).getCreditos();
                            ((ElegirAsignaturas)getActivity()).addCreditosGlobales(relacion.get(compoundButton).getCreditos());
                        }*/
                        activarAsignaturas();
                    }
                });
                views.add(cb);
                tfg_view = v;
                listaAsignaturas.addView(v);
            }


        }catch(Exception e){
            Log.e("KJLNI",e.toString());
        }

        activarAsignaturas();
    }

    public void setCreditos(int creditos){
        this.creditosTipo = creditos;
        activarAsignaturas();
        cred_tipo_txt.setText(String.valueOf(creditos));
    }

    public ArrayList<Integer> getCodigos(){
        ArrayList<Integer> codigos = new ArrayList<>();
        try{
            for(CheckBox cb : views){
                if(cb.isChecked()){
                    Asignatura a = relacion.get(cb);
                    codigos.add(a.getCodigo());
                }
            }
        }catch (Exception e){
            Log.e("kjbn",e.toString());
        }


        return codigos;
    }

    public void setCreditosGlobales(int creditos){
        Log.e("KIJBN",tipo+String.valueOf(creditosTipo));
        this.creditosGlobales = creditos;
        if (creditosGlobales<=0){
            cred_glob_txt.setText(String.valueOf(0));
        }else{
            cred_glob_txt.setText(String.valueOf(creditos));
        }

        activarAsignaturas();
    }

    public void activarAsignaturas(){
        if(creditosTipo==0){
            for(CheckBox cb : views){
                if(!cb.isChecked()){
                    View vi = (View) cb.getParent();
                    vi.setBackgroundColor(Color.GRAY);
                    vi.setClickable(false);
                }
            }
        }else{
            for(CheckBox cb : views){
                View vi = (View) cb.getParent();
                vi.setBackgroundColor(Color.WHITE);
                vi.setClickable(true);
            }
        }
        if(tfg!=null){
            if(creditosGlobales>0){
                View vi = tfg_view;
                vi.setBackgroundColor(Color.GRAY);
                vi.setClickable(false);
                CheckBox cb = vi.findViewById(R.id.checkbox_asignatura);
                cb.setChecked(false);
            }else{
                View vi = tfg_view;
                vi.setBackgroundColor(Color.WHITE);
                vi.setClickable(true);
            }
        }


    }
}
