package com.company;

import java.util.Arrays;

public abstract class Buildings {
    private String adress;
    private Person[] apartments;


    public Buildings(String adress, Person[] apartments) {
        this.adress = adress;
        this.apartments = apartments;
    }




    @Override
    public String toString() {
        return "Buildings{" +
                "adress='" + adress + '\'' +
                ", people=" + apartments.length +
                '}';
    }
}
