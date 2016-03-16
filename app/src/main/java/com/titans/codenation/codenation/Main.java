package com.titans.codenation.codenation;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    NavigationView navigationView = null;
    Toolbar toolbar = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //setting the fragment initially
        MainFragment fragment = new MainFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_contaier, fragment);
        fragmentTransaction.commit();
    }
//setting items to be clicked for views
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id == item.getItemId();

        if(id == R.id.nav_camera){
            //handle camera output...navigation
        }

        return false;
    }
}
