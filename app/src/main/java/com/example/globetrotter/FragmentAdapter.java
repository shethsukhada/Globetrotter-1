package com.example.globetrotter;

import android.widget.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    TravelPlanFragment mtravelPlan;

    public FragmentAdapter(FragmentManager manager) {

        super(manager);
        mtravelPlan = TravelPlanFragment.newInstance(1);
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
            case 1 : page = mtravelPlan;break;
            case 2 : page = NewsFragment.newInstance(1);break;

            default: page = TravelPlanFragment.newInstance(1);break;
        }

        return page;
    }
}
