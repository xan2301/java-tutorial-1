package com.company.dzien37.zoo;

public class Animal {

    Integer cellsNumber;

    String name;

    public Animal(String name) {
        this.name = name;
    }

    void breathe() {

        System.out.println("breathe1 " + name);
    }

}
