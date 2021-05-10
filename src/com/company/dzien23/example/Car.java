package com.company.dzien23.example;

import java.util.Objects;

public class Car {

    private String company;

    private String model;

    private int productionYear;

    public Car(String company, String model, int productionYear) {

        this.company = company;
        this.model = model;
        this.productionYear = productionYear;

    }

//equals principles
//    - x.equals(x) should be always true
//    - x.equals(y) == true -> y.equals(x) == true
//    - x.equals(y) == true i y.equals(z) == true -> x.equals(z) == true
//    - in case of null -> false


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;


        if (!Objects.equals(company, car.company)) {
            return false;
        }
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }
}
