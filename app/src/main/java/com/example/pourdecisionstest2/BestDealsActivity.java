// File: BestDealsActivity.java
package com.example.pourdecisionstest2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BestDealsActivity extends AppCompatActivity {
    String[] bestDeals = {
            "Free Entry at Bar A",
            "$1 Wings at Bar F",
            "$2 Drinks at Bar K"
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