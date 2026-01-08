package com.day5.bookbazaar;

public class Book {

    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public boolean hasStock(int qty) {
        return qty <= stock;
    }

    public void reduceStock(int qty) {
        stock -= qty;
    }
}
