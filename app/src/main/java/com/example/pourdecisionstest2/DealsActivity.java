// File: DealsActivity.java
package com.example.pourdecisionstest2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pourdecisionstest2.DealsAdapter;

public class DealsActivity extends AppCompatActivity {
    String[] deals = {
            "Buy 1 Get 1 Free at Bar A",
            "50% off Wings at Bar B",
            "$3 Drafts at Bar C"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals);

        RecyclerView recyclerView = findViewById(R.id.recycler_deals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DealsAdapter(deals));
    }
}
