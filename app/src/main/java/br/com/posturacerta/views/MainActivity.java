package br.com.posturacerta.views;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import br.com.posturacerta.R;
import br.com.posturacerta.desempenho.DesempenhoFragment;
import br.com.posturacerta.dicas.DicasFragment;
import br.com.posturacerta.views.PrincipalFragment;
import br.com.posturacerta.model.TabViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.allTabs);
        viewPager = findViewById(R.id.view_pager);
        getFragments();
        viewPager.setAdapter(new TabViewPagerAdapter(getSupportFragmentManager(), fragmentList, this));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void getFragments() {

        fragmentList = new ArrayList<>();
        fragmentList.add(new PrincipalFragment());
        fragmentList.add(new DesempenhoFragment());
        fragmentList.add(new DicasFragment());

        tabLayout.addTab(tabLayout.newTab().setText("Principal"));
        tabLayout.addTab(tabLayout.newTab().setText("Desempenho"));
        tabLayout.addTab(tabLayout.newTab().setText("Dicas"));
    }

}