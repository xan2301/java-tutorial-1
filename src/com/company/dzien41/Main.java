package com.company.dzien41;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);

        Car car2 = new Car();

        System.out.println(Car.staticNumberOfCarsCreated);
        Car car3 = new Car();

        System.out.println(Car.staticNumberOfCarsCreated);
        Car car4 = new Car();

        System.out.println(Car.staticNumberOfCarsCreated);

        Car car5 = new Car();

        System.out.println(Car.staticNumberOfCarsCreated);

        System.out.println();

        System.out.println(car1.numberOfCarsCreated);
        System.out.println(car2.numberOfCarsCreated);
        System.out.println(car3.numberOfCarsCreated);
        System.out.println(car4.numberOfCarsCreated);
        System.out.println(car5.numberOfCarsCreated);


    }
}
