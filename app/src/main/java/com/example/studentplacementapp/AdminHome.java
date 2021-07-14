package com.example.studentplacementapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.studentplacementapp.R;
import com.google.android.material.navigation.NavigationView;

public class AdminHome extends AppCompatActivity {
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    CardView students, company, resume, reports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.navmenu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        students = findViewById(R.id.studentsdetails);
        company = findViewById(R.id.companydetails);
        resume = findViewById(R.id.downloadresume);
        reports = findViewById(R.id.placementreports);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id == R.id.home) {
                    Toast.makeText(getApplicationContext(), "Home Panel is Open", Toast.LENGTH_LONG).show();
                    return true;
                } else if (id == R.id.feeds) {
                    Intent intent1 = new Intent(AdminHome.this, AdminFeeds.class);
                    startActivity(intent1);
                    Toast.makeText(getApplicationContext(), "New Feeds Panel is Open", Toast.LENGTH_LONG).show();
                    return true;
                } else if (id == R.id.sendnotification) {
                    Intent intent2 = new Intent(AdminHome.this, AdminSendnotification.class);
                    startActivity(intent2);
                    Toast.makeText(getApplicationContext(), "Send Notification is Open", Toast.LENGTH_LONG).show();
                    return true;
                } else if (id == R.id.share) {
                    Intent intent3 = new Intent(AdminHome.this, AdminShare.class);
                    startActivity(intent3);
                    Toast.makeText(getApplicationContext(), "Share this page", Toast.LENGTH_LONG).show();
                    return true;
                }else if (id == R.id.Logout){
                    Intent intent4 = new Intent(AdminHome.this,SelectUser.class);
                    startActivity(intent4);
                    Toast.makeText(getApplicationContext(), "Logout Success", Toast.LENGTH_LONG).show();
                    return true;
                }
                return true;
            }
        });

        students.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), AdminStudentsDetails.class);
                startActivity(intent1);
            }
        });
        company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), AdminCompanyDetails.class);
                startActivity(intent2);
            }
        });
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), AdminDownloadresume.class);
                startActivity(intent3);
            }
        });
        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), AdminReports.class);
                startActivity(intent4);
            }
        });

    }
}