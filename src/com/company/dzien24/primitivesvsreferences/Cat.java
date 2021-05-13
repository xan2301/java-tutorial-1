package com.company.dzien24.primitivesvsreferences;

public class Cat {
    public String name;
//    alt + insert - constructor


    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
