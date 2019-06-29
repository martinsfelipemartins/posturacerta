package br.com.posturacerta.ui.main;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.posturacerta.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class TabViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentsForTabsList = new ArrayList<>();
    private List<String> tabNameList = new ArrayList<>();

    public TabViewPagerAdapter(FragmentManager fm) {
        super(fm);
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
        tabNameList.add(title);
      }
}