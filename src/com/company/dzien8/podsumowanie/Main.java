package com.company.dzien8.podsumowanie;

import com.company.dzien8.podsumowanie.Plant.Plant;

public class Main {

    public static void main(String[] args) {
        Plant plant1 = new Plant(6);
        Plant plant2 = new Plant(165);

        System.out.println(plant1.color);
        System.out.println(plant2.color);
        System.out.println(" ");

        System.out.println(plant1.numberOfLeaves);
        System.out.println(plant2.numberOfLeaves);
        System.out.println(" ");

        plant1.rise();
        plant2.rise();
    }


}
