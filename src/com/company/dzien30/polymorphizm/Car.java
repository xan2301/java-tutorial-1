package com.company.dzien30.polymorphizm;

public class Car {

//      oracle doc - The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have
//      many different forms or stages. This principle can also be applied to object - oriented programming and languages like the Java language.
//      Subclasses of a class can be define their own unique behaviors and yet share of the same functionality of the parent class.


    protected String color;

    public Car(final String color) {
        this.color = color;
    }

    public void describe() {
        System.out.println("Car color: " + color);
    }


}
