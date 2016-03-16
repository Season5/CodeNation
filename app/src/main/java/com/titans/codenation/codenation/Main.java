package com.titans.codenation.codenation;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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

        int id = item.getItemId();

        if(id == R.id.nav_camera){
            //handle camera output...navigation
        }else if(id == R.id.nav_gallery){
            //handle gallery input
        }else if(id == R.id.nav_slideshow){
            //handle output
        }else if(id == R.id.nav_manage){
            //handle output
        }else if(id == R.id.nav_share){
            //output
        }else if(id == R.id.nav_send){

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
