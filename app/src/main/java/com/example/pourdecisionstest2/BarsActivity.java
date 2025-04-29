// File: BarsActivity.java
package com.example.pourdecisionstest2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pourdecisionstest2.BarsAdapter;

public class BarsActivity extends AppCompatActivity {
    String[] bars = {
            "Champs Downtown",
            "Doggie's Pub",
            "Bill Pickle's Taproom",
            "Cafe 210 West",
            "Brother's",
            "Shandygaff",
            "The Phyrst",
            "The Basement NightClub",
            "Primanti Bros",
            "Lion's Den",
            "Sharkie's Bar and Bottle Shop",
            "The Brewery",
            "Champs North Atherton"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        RecyclerView recyclerView = findViewById(R.id.recycler_bars);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BarsAdapter(bars));
    }
}