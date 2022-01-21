package com.company.dzien35.person;

import com.company.dzien35.product.Chocolate;
import com.company.dzien35.product.Food;
import com.company.dzien35.product.Sandwich;
import com.company.dzien35.product.Soup;

public class Producer extends Person implements ProducingMan {

    public Producer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consuming food:" + food);

    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName) {
            case "chocolate":
                return new Chocolate(productName, this, consumingMan);

            case "soup":
                return new Soup(productName, this, consumingMan);

            default:
                return new Sandwich(productName, this, consumingMan);
        }
    }
}
