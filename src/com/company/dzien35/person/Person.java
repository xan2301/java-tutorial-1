package com.company.dzien35.person;

public abstract class Person implements ConsumingMan {

    private final String name;

    private final String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
