// File: BarsActivity.java
package com.example.pourdecisionstest2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class BarsActivity extends AppCompatActivity {

    public static class Bar {
        String name;
        List<String> deals;

        public Bar(String name, List<String> deals) {
            this.name = name;
            this.deals = deals;
        }
    }

    List<Bar> bars = Arrays.asList(
            new Bar("Champs Downtown", Arrays.asList("Half-off wings", "$2 drafts")),
            new Bar("Doggie's Pub", Arrays.asList("$1 wells", "Free cover before 10")),
            new Bar("Bill Pickle's Taproom", Arrays.asList("Buy 1 Get 1 Free pitchers")),
            new Bar("Cafe 210 West", Arrays.asList("Happy hour 4-6 PM", "$3 Margaritas")),
            new Bar("Brother's", Arrays.asList("Trivia night deals")),
            new Bar("Shandygaff", Arrays.asList("Dollar beers 9–11 PM")),
            new Bar("The Phyrst", Arrays.asList("Green beer specials")),
            new Bar("The Basement NightClub", Arrays.asList("Ladies night: Free drinks")),
            new Bar("Primanti Bros", Arrays.asList("Wing night Thursday")),
            new Bar("Lion's Den", Arrays.asList("Karaoke specials")),
            new Bar("Sharkie's Bar and Bottle Shop", Arrays.asList("$2 shots", "$3 beers")),
            new Bar("The Brewery", Arrays.asList("Live music drink specials")),
            new Bar("Champs North Atherton", Arrays.asList("Sports night: $4 pitchers"))
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        RecyclerView recyclerView = findViewById(R.id.recycler_bars);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BarsAdapter(bars, this::showDealsPopup));

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }

    private void showDealsPopup(Bar bar) {
        String message = String.join("\n", bar.deals);
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle(bar.name + " Deals")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }
}