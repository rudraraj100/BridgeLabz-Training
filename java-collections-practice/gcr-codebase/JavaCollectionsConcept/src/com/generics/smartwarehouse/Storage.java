package com.generics.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
	
	private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}
	
	
	

