package com.company;

public class Apartment extends Buildings implements Payment{
    public Apartment(String adress, Person[] apartments) {
        super(adress, apartments);
    }

    @Override
    public void payment() {
        System.out.println("This apartment with payment");
    }
}
