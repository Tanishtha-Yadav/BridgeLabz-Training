package com.inheritance.hybrid.restaurantmanagement;

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is prepares and cooks food");
    }
}
