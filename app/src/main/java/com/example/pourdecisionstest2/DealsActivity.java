// File: DealsActivity.java
package com.example.pourdecisionstest2;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pourdecisionstest2.DealsAdapter;

import java.util.Arrays;

public class DealsActivity extends AppCompatActivity {
    String[] deals = {
            "Champs Downtown: Half-off wings, $2 drafts",
            "Doggie's Pub: $1 wells, Free cover before 10",
            "Bill Pickle's Taproom: Buy 1 Get 1 Free pitchers",
            "Cafe 210 West: Happy hour 4-6 PM, $3 Margaritas",
            "Brother's: Trivia night deals",
            "Shandygaff: Dollar beers 9–11 PM",
            "The Phyrst: Green beer specials",
            "The Basement NightClub: Ladies night: Free drinks",
            "Primanti Bros: Wing night Thursday",
            "Lion's Den: Karaoke specials",
            "Sharkie's Bar and Bottle Shop: $2 shots, $3 beers",
            "The Brewery: Live music drink specials",
            "Champs North Atherton: Sports night: $4 pitchers"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals);

        RecyclerView recyclerView = findViewById(R.id.recycler_deals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DealsAdapter(deals));

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // Close this activity and return to previous
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
