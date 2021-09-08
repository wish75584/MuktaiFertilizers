    package com.stubborn.muktaifertilizers;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.stubborn.muktaifertilizers.fragments.AboutUsFragment;
import com.stubborn.muktaifertilizers.fragments.CareerFragment;
import com.stubborn.muktaifertilizers.fragments.ContactFragment;
import com.stubborn.muktaifertilizers.fragments.GalleryFragment;
import com.stubborn.muktaifertilizers.fragments.HomeFragment;
import com.stubborn.muktaifertilizers.fragments.ProductsFragment;
import com.stubborn.muktaifertilizers.fragments.VideosActivity;
import com.stubborn.muktaifertilizers.fragments.VideosFragmentX;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class HomeActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    NavigationView navigationViewl;
    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        color = Color.parseColor("#265828");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactFragment()).commit();


            }
        });
        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        navigationViewl = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.


        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_about, R.id.nav_product, R.id.nav_gallery,R.id.nav_videos, R.id.nav_career, R.id.nav_contact)
                .setDrawerLayout(drawer)
                .build();
        final NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationViewl, navController);



        //*********************code for chnaging background and item color on selcted


        setNavMenuItemThemeColors (color);


        //***************************above code for chnaging background and item color on selcted










        navigationViewl.bringToFront();
        navigationViewl.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        HomeFragment homeFragment = new HomeFragment();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment, homeFragment.getTag()).commit();

                      ///  Toast.makeText(HomeActivity.this, "Home is selected", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.nav_about:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutUsFragment()).addToBackStack("Home").commit();
                      //  Toast.makeText(HomeActivity.this, "Gallery is selected", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.nav_product:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProductsFragment()).commit();
                      //  Toast.makeText(HomeActivity.this, "Slideshow is selected", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.nav_gallery:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GalleryFragment()).commit();
                       // Toast.makeText(HomeActivity.this, "test is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_videos:

                       // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VideosFragmentX()).commit();
                        startActivity(new Intent(HomeActivity.this, VideosFragmentX.class));
                       // Toast.makeText(HomeActivity.this, "video is selected", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.nav_career:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CareerFragment()).commit();
                      //  Toast.makeText(HomeActivity.this, "test is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_contact:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactFragment()).commit();
                      //  Toast.makeText(HomeActivity.this, "test is selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void setNavMenuItemThemeColors (int color){
        //Setting default colors for menu item Text and Icon
        int navDefaultTextColor = Color.parseColor("#787878");
        int navDefaultIconColor = Color.parseColor("#787878");

        //Defining ColorStateList for menu item Text
        ColorStateList navMenuTextList = new ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_checked},
                        new int[]{android.R.attr.state_enabled},
                        new int[]{android.R.attr.state_pressed},
                        new int[]{android.R.attr.state_focused},
                        new int[]{android.R.attr.state_pressed}
                },
                new int[] {
                        color,
                        navDefaultTextColor,
                        navDefaultTextColor,
                        navDefaultTextColor,
                        navDefaultTextColor
                }
        );

        //Defining ColorStateList for menu item Icon
        ColorStateList navMenuIconList = new ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_checked},
                        new int[]{android.R.attr.state_enabled},
                        new int[]{android.R.attr.state_pressed},
                        new int[]{android.R.attr.state_focused},
                        new int[]{android.R.attr.state_pressed}
                },
                new int[] {
                        color,
                        navDefaultIconColor,
                        navDefaultIconColor,
                        navDefaultIconColor,
                        navDefaultIconColor
                }
        );

        navigationViewl.setItemTextColor(navMenuTextList);
        navigationViewl.setItemIconTintList(navMenuIconList);
    }


    public void openContactActivity(View view) {
        startActivity(new Intent(HomeActivity.this,ContactFragment.class));
    }
}
