package com.example.tilen.happyinvestor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tilen.happyinvestor.model.StockData;

/**
 * Created by Tilen on 23.5.2016.
 */
public class StockAdapter extends BaseAdapter {

    private final LayoutInflater layoutInflater;
    private StockData[] data;

    public StockAdapter(Context context) {
        this.layoutInflater = LayoutInflater.from(context);
    }

    public void setData(StockData[] data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (data != null) {
            return data.length;
        } else {
            return 0;
        }
    }

    @Override
    public StockData getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        StockData item = getItem(position);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        double price = item.getPrice();
        String stringPrice = String.valueOf(price);
        textView.setText(stringPrice);

        return view;
    }
}
