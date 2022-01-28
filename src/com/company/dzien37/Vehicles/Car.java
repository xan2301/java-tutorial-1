package com.company.dzien37.Vehicles;

import java.util.Objects;

public class Car {

    String brand;

    String model;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void drive() {

        System.out.println("driving: " + brand + " " + model);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
