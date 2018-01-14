package com.uvportal.uahgii.uvportal;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;

/**
 * Created by Daniel on 17/12/2017.
 */

public class AsignaturasTabAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Obligatorias", "Optativas", "Transversales" };

    private HashMap<Integer,ListaAsignaturas> fragments;

    public AsignaturasTabAdapter(FragmentManager fm) {
        super(fm);
        fragments = new HashMap<>();
        fragments.put(0,null);
        fragments.put(1,null);
        fragments.put(2,null);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            if(fragments.get(0)==null){
                Bundle args = new Bundle();
                args.putString("Tipo","OB");
                ListaAsignaturas la = new ListaAsignaturas();
                la.setArguments(args);
                fragments.put(0,la);
                return la;
            }else{
                return  fragments.get(0);
            }
        } else if (position == 1){
            if(fragments.get(1)==null){
                Bundle args = new Bundle();
                args.putString("Tipo","OP");
                ListaAsignaturas la = new ListaAsignaturas();
                la.setArguments(args);
                fragments.put(1,la);
                return la;
            }else{
                return  fragments.get(1);
            }
        } else {
            if(fragments.get(2)==null){
                Bundle args = new Bundle();
                args.putString("Tipo","T");
                ListaAsignaturas la = new ListaAsignaturas();
                la.setArguments(args);
                fragments.put(2,la);
                return la;
            }else{
                return  fragments.get(2);
            }
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
