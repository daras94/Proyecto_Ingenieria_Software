package com.uvportal.uahgii.uvportal;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Daniel on 17/12/2017.
 */

public class AsignaturasAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Obligatorias", "Optativas", "Transversales" };

    public AsignaturasAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ListaAsignaturas();
        } else if (position == 1){
            return new ListaAsignaturas();
        } else if (position == 2) {
            return new ListaAsignaturas();
        } else {
            return new ListaAsignaturas();
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
