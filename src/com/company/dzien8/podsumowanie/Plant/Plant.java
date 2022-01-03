package com.company.dzien8.podsumowanie.Plant;

public class Plant {


    //konstruktor


    public Plant(int numberOfLeaves) {
        this.color = "green";
        this.numberOfLeaves = numberOfLeaves;
    }

    public int numberOfLeaves;
    public String color;

    //metoda

    public void rise() {
        System.out.println("I'm rising");

    }
}
