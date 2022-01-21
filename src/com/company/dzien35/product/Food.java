package com.company.dzien35.product;

import com.company.dzien35.person.ConsumingMan;
import com.company.dzien35.person.ProducingMan;

public abstract class Food {

    private final String name;

    private final ProducingMan producingMan;

    private final ConsumingMan consumingMan;

    public Food(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.name = name;
        this.producingMan = producingMan;
        this.consumingMan = consumingMan;
    }


}
