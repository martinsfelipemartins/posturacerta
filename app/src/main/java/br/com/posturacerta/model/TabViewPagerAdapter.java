package br.com.posturacerta.model;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class TabViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentsForTabsList = new ArrayList<>();
    Context context;

    public TabViewPagerAdapter(FragmentManager fm, List<Fragment> fragmentsForTabsList,  Context context) {
        super(fm);
        this.fragmentsForTabsList = fragmentsForTabsList;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsForTabsList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return (CharSequence) fragmentsForTabsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsForTabsList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        fragmentsForTabsList.add(fragment);

      }
}