package com.example.tilen.happyinvestor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.tilen.happyinvestor.model.StockData;

public class GoogleActivity extends AppCompatActivity {

    public static final StockData[] APPLE_STOCKS = new StockData[]{
            new StockData(3239318, 139.31),
            new StockData(3239318, 137.84),
            new StockData(3239318, 136.12),
    };
    private StockAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        adapter = new StockAdapter(this);
        adapter.setData(APPLE_STOCKS);


        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}