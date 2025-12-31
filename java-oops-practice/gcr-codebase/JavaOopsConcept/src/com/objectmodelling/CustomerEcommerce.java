package com.objectmodelling;

public class CustomerEcommerce {

    private String name;

    public CustomerEcommerce(String name) {
        this.name = name;
    }

    // Communication
    public void placeOrder(Order order, Product product) {
        System.out.println(name + " is placing an order...");
        order.addProduct(product);
    }

}