package com.company.dzien32.finalKeyword;

public class Car {

    private String color;

    public Car(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public final void describe(){
        System.out.println("I'm describing my brilliant car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
