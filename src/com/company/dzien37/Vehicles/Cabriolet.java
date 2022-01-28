package com.company.dzien37.Vehicles;

public class Cabriolet extends Car {


    public Cabriolet(String brand, String model) {
        super(brand, model);


    }

    public static void main(String[] args) {
        Cabriolet cabriolet1 = new Cabriolet("Ford", "Mustang");
        Cabriolet cabriolet2 = new Cabriolet("Ford", "Mustang");

        System.out.println(cabriolet1.equals((cabriolet2)));

    }

}
