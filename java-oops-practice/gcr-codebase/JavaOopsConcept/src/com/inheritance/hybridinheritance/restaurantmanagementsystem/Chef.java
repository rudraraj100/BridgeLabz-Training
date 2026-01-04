package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
    	super.displayInfo();
        System.out.println("Chef is preparing food");
    }
}

