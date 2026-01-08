package com.day5.bookbazaar;

public class EBook extends Book implements IDiscountable {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Polymorphism
    @Override
    public void applyDiscount() {
        // 20% discount for EBooks
        setPrice(getPrice() * 0.8);
    }
}



	
