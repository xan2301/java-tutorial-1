package com.company.dzien23;

import com.company.dzien23.example.Car;

import java.math.BigDecimal;

public class EqualsAndHashCode {

    public static void main(String[] args) {
//        EqualsAndHashCode.simpleTypesComparison();
//        System.out.println();
//        EqualsAndHashCode.decimalTypesComparison();
        EqualsAndHashCode.equalsExample();
    }


    private static void simpleTypesComparison() {

        System.out.println("19 == 19: " + (19 == 19));
        System.out.println("19 != 19: " + (19 != 19));
        System.out.println("10249L == 10249L: " + (10249L == 10249L));
        System.out.println("10249L != 10249L: " + (10249L != 10249L));
        System.out.println("'X' == 'X': " + ('X' == 'X'));
        System.out.println("'X' != 'X': " + ('X' != 'X'));
        System.out.println("true == true: " + (true == true));
        System.out.println("true != true: " + (true != true));


    }


    private static void decimalTypesComparison() {

        System.out.println("0.1 + 0.2 == 0.3: " + (0.1 + 0.2 == 0.3)); // ?

        System.out.println("0.1 + 0.2 == 0.3: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.0001)); // ?

        BigDecimal bd3 = new BigDecimal("0.3");
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println(bd3.equals(bd1.add(bd2)));
    }

    private static void equalsExample() {
        Car car1 = new Car("Mercedes", "A-Class", 2010);
        Car car2 = new Car("BMW", "X1", 2009);
        Car car3 = new Car("Mercedes", "Golf", 2015);
        Car car4 = new Car("Audi", "A4", 2018);
        Car car5 = new Car("Audi", "A4", 2018);

        System.out.println("car4 == car5: " + (car4 == car5));
        System.out.println("car4.equals(car5): " + car4.equals(car5));


//        System.out.println("hash1: " + car1.hashCode());
//        System.out.println("hash2: " + car2.hashCode());
//        System.out.println("hash3: " + car3.hashCode());
//        System.out.println("hash4: " + car4.hashCode());
//        System.out.println("hash5: " + car5.hashCode());

    }


}

