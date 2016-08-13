package com.example.android.slidingtabs;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Salvador on 13/08/2016.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int  PAGE_COUNT = 3;
    private String tabTitles[] = new String[] {"Tab1", "Tab2", "Tab3"};
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public  int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return  PageFragment.newInstance(position+1);
    }

    @Override
    public CharSequence getPageTitle(int position){
        // Generate title base on item position
        return tabTitles[position];
    }
}
