package br.com.posturacerta;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import br.com.posturacerta.desempenho.DesempenhoFragment;
import br.com.posturacerta.dicas.DicasFragment;
import br.com.posturacerta.principal.PrincipalFragment;
import br.com.posturacerta.ui.main.TabViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabViewPagerAdapter sectionsPagerAdapter = new TabViewPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.allTabs);
        tabs.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PrincipalFragment(), "Principal");
        adapter.addFragment(new DesempenhoFragment(), "Desempenho");
        adapter.addFragment(new DicasFragment(), "Dicas");
        viewPager.setAdapter(adapter);

         viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.allTabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}