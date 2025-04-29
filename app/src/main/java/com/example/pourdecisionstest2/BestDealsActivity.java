// File: BestDealsActivity.java
package com.example.pourdecisionstest2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BestDealsActivity extends AppCompatActivity {
    String[] bestDeals = {
            "Free Entry at The Basement NightClub",
            "$1 Wings at Brother's Bar and Grill",
            "$2 Drinks at Champs Downtown"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_deals);

        ((TextView) findViewById(R.id.best_deal_1)).setText(bestDeals[0]);
        ((TextView) findViewById(R.id.best_deal_2)).setText(bestDeals[1]);
        ((TextView) findViewById(R.id.best_deal_3)).setText(bestDeals[2]);
    }
}