package com.example.studentplacementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AdminFeeds extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<modelfeed> modelfeedArrayList= new ArrayList<>();
    Adapterfeed adapterfeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_feeds);

        recyclerView = findViewById(R.id.recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterfeed= new Adapterfeed(this,modelfeedArrayList);
        recyclerView.setAdapter(adapterfeed);

        populateRecyclerView();
    }
    public void populateRecyclerView(){

        modelfeed modelfeed = new modelfeed(1,5,2,R.drawable.cpi,R.drawable.gatecpipost,
                "CPI","10 hrs","Hello Students");
        modelfeedArrayList.add(modelfeed);
        modelfeed = new modelfeed(2,35,10,R.drawable.blogo,R.drawable.cpilab,
                "Bhavyata Bosamiya","8 hrs","Guys our computer lab");
        modelfeedArrayList.add(modelfeed);
        modelfeed = new modelfeed(3,15,7,R.drawable.personlogo,R.drawable.placemetcpi,
                "Ashutosh Trivedi","6 hrs","Placement Companies we have...");
        modelfeedArrayList.add(modelfeed);
        modelfeed = new modelfeed(4,20,5,R.drawable.blogo,R.drawable.sportactivity,
                "Bhavyata Bosamiya","3 hrs","cpi encourage us wid amazing sport activities.");
        modelfeedArrayList.add(modelfeed);

        adapterfeed.notifyDataSetChanged();
    }
}