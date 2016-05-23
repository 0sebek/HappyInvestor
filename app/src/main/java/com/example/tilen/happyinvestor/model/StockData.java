package com.example.tilen.happyinvestor.model;

/**
 * Created by Tilen on 23.5.2016.
 */
public class StockData {

    private long id;
    private double price;

    public StockData(long id, double price) {
        this.id = id;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
