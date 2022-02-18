package com.company;

public class Main {

    public static void main(String[] args) {

        Person dad = new Person("Tair");
        Person mom = new Person("Perizat");
        Person daughter = new Person("Hadicha");
        Person son = new Person("Amin");

        Person[] family = {dad,mom,daughter,son};
        Apartment home = new Apartment("Kok-Jar",family);
        System.out.println(home);
        home.payment();


        Person person = new Person("K.M");
        Person person1 = new Person("T.R");
        Person person2 = new Person("M.J");
        Person person3 = new Person("L.J");

        Person[] apartments = {person,person1,person2,person3};
        Hotel apartment = new Hotel("Alamedin-1",apartments);
        System.out.println(apartment);
        apartment.paidRental();


        Person student1 = new Person("Dilbara");
        Person student2 = new Person("Nargiza");
        Person student3 = new Person("Adilet");
        Person student4 = new Person("Azamat");

        Person[] hostels = {student1,student2,student3,student4};
        Hostel hostel = new Hostel("Tunguch",hostels);
        System.out.println(hostel);
        hostel.paidRental();

    }
}
