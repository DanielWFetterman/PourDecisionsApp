package com.example.pourdecisionstest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pourdecisionstest2.BestDealsActivity;
import com.example.pourdecisionstest2.DealsActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDeals = findViewById(R.id.btn_deals);
        Button btnBars = findViewById(R.id.btn_bars);
        Button btnBestDeals = findViewById(R.id.btn_best_deals);

        btnDeals.setOnClickListener(v -> startActivity(new Intent(this, com.example.pourdecisionstest2.DealsActivity.class)));
        btnBars.setOnClickListener(v -> startActivity(new Intent(this, com.example.pourdecisionstest2.BarsActivity.class)));
        btnBestDeals.setOnClickListener(v -> startActivity(new Intent(this, com.example.pourdecisionstest2.BestDealsActivity.class)));
    }
}