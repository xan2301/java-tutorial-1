package com.company.dzien37.zoo;

public class Mammal extends Animal {

    Integer milkProduction = 685;

    public Mammal(String name) {
        super(name);
    }

    void feedWithMilk() {
        System.out.println(milkProduction / cellsNumber);

    }

    public static void main(String[] args) {
        Mammal mammal1 = new Mammal("elephant");
        mammal1.breathe();

        Mammal mammal2 = new Mammal("whale");
        mammal2.breathe();
    }

}
