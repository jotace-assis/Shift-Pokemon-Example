package com.example.logonrm.shiftcarros.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.logonrm.shiftcarros.fragments.PokemonFragment;
import com.example.logonrm.shiftcarros.fragments.StarWarsFragment;

import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter {

    public List<Fragment> fragments;

    public TabAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
