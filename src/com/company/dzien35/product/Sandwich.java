package com.company.dzien35.product;

import com.company.dzien35.person.ConsumingMan;
import com.company.dzien35.person.ProducingMan;

public class Sandwich extends Food {
    public Sandwich(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
