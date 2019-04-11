package com.abeyler.gykfragments;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.blank_layout,new HomeFragment()).commit();
            getSupportActionBar().setTitle("Ana Sayfa");
        }
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                Fragment selectedFragment = null;
                String title = "";
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = new HomeFragment();
                        title = "Ana Sayfa";
                        //selectedFragment = ItemOneFragment.newInstance();
                        break;
                    case R.id.navigation_health_info:
                        selectedFragment = new HealthInfoFragment();
                        title = "Sağlıklı Yaşam İpuçları";
                        break;
                    case R.id.navigation_healthy_foods:
                        selectedFragment = new HealthyFoodsFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.blank_layout,selectedFragment).commit();
                getSupportActionBar().setTitle(title);
                return true;
            }
        });




    }
}
