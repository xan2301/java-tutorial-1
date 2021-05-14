package com.company.dzien29;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Bmw","6",1990);
        System.out.println(car.getCompany());
        System.out.println(car.getModel());
        System.out.println(car.getProductionYear());


        car.setCompany("brak");
        car.setModel("GLA");
        car.setProductionYear(2020);

        System.out.println();

        System.out.println(car.getCompany());
        System.out.println(car.getModel());
        System.out.println(car.getProductionYear());

    }




}
