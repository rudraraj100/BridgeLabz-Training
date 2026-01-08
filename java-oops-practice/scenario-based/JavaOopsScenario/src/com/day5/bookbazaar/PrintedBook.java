package com.day5.bookbazaar;

public class PrintedBook extends Book implements IDiscountable {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Polymorphism
    @Override
    public void applyDiscount() {
        // 10% discount for printed books
        setPrice(getPrice() * 0.9);
    }
}

