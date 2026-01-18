package com.generics.onlinemarketplace;
import java.util.*;

public class Catalog {
    List<Product<?>> productList = new ArrayList<>();

    public void addProduct(Product<?> product) {
        productList.add(product);
    }

    public void displayCatalog() {
        for (Product<?> p : productList) {
            System.out.println("Name: " + p.name + ", Category: " + p.category.getClass().getSimpleName() + ", Price: " + p.price );
        }
    }
}
