package com.example.globetrotter;

import android.widget.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager manager) {
        super(manager);
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment page = null;

        switch (position){
            case 0 : page = MapViewFragment.newInstance("one","two");break;
            case 1 : page = TravelPlanFragment.newInstance(1);break;

            default: page = TravelPlanFragment.newInstance(1);break;
        }

        return page;
    }
}
