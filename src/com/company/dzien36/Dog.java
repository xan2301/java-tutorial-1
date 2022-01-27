package com.company.dzien36;

public class Dog {


    String name;

    String color;

    boolean hasTail;

    public Dog(String name) {

        System.out.println("Calling constructor 1");
        this.name = name;


    }

    public Dog(String name, String color) {

        System.out.println("Calling constructor 2");

    }

    public void hau(String color) {

        System.out.println("Dog hauking: " + this.color);


    }


}
