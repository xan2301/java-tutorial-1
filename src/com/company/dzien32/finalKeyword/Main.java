package com.company.dzien32.finalKeyword;

public class Main {
    public static void main(String[] args) {
        final Car car = new Car("red");
        System.out.println(car);
        car.setColor("blue");
        System.out.println(car);

    }

    private static void describe(Car car){
        car.setColor("yellow");

    }


}
