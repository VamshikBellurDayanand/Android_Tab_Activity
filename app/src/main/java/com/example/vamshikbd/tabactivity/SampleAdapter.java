package com.example.vamshikbd.tabactivity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SampleAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public SampleAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return FirstFragment.newInstance(position + 1);
        } else if(position == 1) {
            return SecondFragment.newInstance(position + 1);
        } else if(position == 2) {
            return ThirdFragment.newInstance(position + 1);
        } else {
            return FourthFragment.newInstance(position + 1);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "first";
            case 1:
                return "second";
            case 2:
                return "third";
            case 3:
                return "fourth";
            default:
                return null;
        }
    }
}
