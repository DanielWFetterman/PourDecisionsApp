// File: BarsActivity.java
package com.example.pourdecisionstest2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pourdecisionstest2.BarsAdapter;

public class BarsActivity extends AppCompatActivity {
    String[] bars = {
            "Bar A - Live Music",
            "Bar B - Happy Hour 4-6PM",
            "Bar C - Karaoke Night",
            "Bar D - Trivia Tuesdays",
            "Bar E - Free Pool",
            "Bar F - Ladies Night",
            "Bar G - Craft Beer Special",
            "Bar H - Student Discount",
            "Bar I - Game Night",
            "Bar J - $2 Shots",
            "Bar K - Live DJ",
            "Bar L - Sports Screens",
            "Bar M - Margarita Madness"
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