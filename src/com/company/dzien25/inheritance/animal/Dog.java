package com.company.dzien25.inheritance.animal;

public class Dog extends Animal {

    private String name;

    public Dog(String color, String name) {
        super(color);
        this.name = name;
    }
}
