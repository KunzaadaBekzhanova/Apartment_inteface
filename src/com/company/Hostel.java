package com.company;

public class Hostel extends Buildings  implements Rental{
    public Hostel(String adress, Person[] apartments) {
        super(adress, apartments);
    }

    @Override
    public void paidRental() {
        System.out.println("Hostal is rental");
    }
}
