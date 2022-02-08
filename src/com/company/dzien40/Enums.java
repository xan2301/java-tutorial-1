package com.company.dzien40;

public class Enums {


    public static void main(String[] args) {

        Volkswagen volkswagen = Volkswagen.GOLF;

        if (Volkswagen.ARTEON.equals(volkswagen)){

            System.out.println("My car is Arteon");
        } else {
            System.out.println("My car is not Arteon");
        }



    }
}
