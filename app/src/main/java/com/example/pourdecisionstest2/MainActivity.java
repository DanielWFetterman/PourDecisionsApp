package com.example.pourdecisionstest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pourdecisionstest2.BestDealsActivity;
import com.example.pourdecisionstest2.DealsActivity;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDeals = findViewById(R.id.btn_deals);
        Button btnBars = findViewById(R.id.btn_bars);
//        Button btnBestDeals = findViewById(R.id.btn_best_deals);
        Button btnDealOfDay = findViewById(R.id.btn_deal_of_the_day);

        btnDeals.setOnClickListener(v -> startActivity(new Intent(this, com.example.pourdecisionstest2.DealsActivity.class)));
        btnBars.setOnClickListener(v -> startActivity(new Intent(this, com.example.pourdecisionstest2.BarsActivity.class)));
//        btnBestDeals.setOnClickListener(v -> startActivity(new Intent(this, com.example.pourdecisionstest2.BestDealsActivity.class)));
        btnDealOfDay.setOnClickListener(v -> startActivity(new Intent(this, com.example.pourdecisionstest2.DealOfDayActivity.class)));

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.more_info) {
            View rootView = findViewById(android.R.id.content);
            Snackbar.make(rootView, "Pour Decisions App\nGet the best deals out there", Snackbar.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}