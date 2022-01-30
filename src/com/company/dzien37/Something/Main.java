package com.company.dzien37.Something;

public class Main {

    public static void main(String[] args) {

        House house = new House("Przemek", "Blue", 99);
        House house1 = new House("Jacek", "Blue", 99);
        House house2 = new House("janel", "Blue", 99);
        House house3 = new House("Przemffdfek", "green", 99);


        System.out.println(house.getName());
        System.out.println(house.getHairColour());
        System.out.println(house.getAge());

        System.out.println(house1.getName());
        System.out.println(house1.getHairColour());
        System.out.println(house1.getAge());

        System.out.println(house2.getName());
        System.out.println(house2.getHairColour());
        System.out.println(house2.getAge());


        System.out.println(house3.getName());
        System.out.println(house3.getHairColour());
        System.out.println(house3.getAge());






    }
}
