package com.company.dzien8;

import com.company.dzien8.animal.Cat;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("mruczek");
        Cat cat2 = new Cat("kradnie mleko z lodówki");
        System.out.println(cat1);
//        System.out.println(cat1.leftLegBack);
        System.out.println(cat1.gimmeVoice());
        System.out.println(cat2.gimmeVoice());


        System.out.println("Cat 1 " + cat1.getName());
        System.out.println("Cat 2 " + cat2.getName());
    }

}
