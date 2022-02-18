package com.company;

public class Hotel extends Buildings implements Rental{

    public Hotel(String adress, Person[] apartments) {
        super(adress, apartments);
    }


    @Override
    public void paidRental() {
        System.out.println("Hotel is rental");
    }
}

