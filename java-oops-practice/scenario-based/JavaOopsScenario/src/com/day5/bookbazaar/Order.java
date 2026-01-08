package com.day5.bookbazaar;

public class Order {

    private Book book;
    private int quantity;
    private String status = "PLACED";

    public Order(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public void confirmOrder() {
        if (book.hasStock(quantity)) {
            book.reduceStock(quantity);
            status = "CONFIRMED";
        } else {
            status = "FAILED";
        }
    }

    public double totalCost() {
        return book.getPrice() * quantity;
    }

    public void show() {
        System.out.println("Book: " + book.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: ₹" + totalCost());
        System.out.println("Status: " + status);
    }
}
