package com.company.dzien24;

import com.company.dzien23.example.Car;

public class ToString {

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "A-Class", 2010);
        Car car2 = new Car("BMW", "X1", 2009);
        Car car3 = new Car("Volkswagen", "Golf", 2015);

//        default toString implementation is converting internal address of the object into integer, but it's not required by Java programming
//        language

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


//        String printableCar = car1.toString();
    }


}

