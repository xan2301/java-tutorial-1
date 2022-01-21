package com.company.dzien35.person;

import com.company.dzien35.product.Food;

public interface ProducingMan {

    Food produce(String productName, ConsumingMan consumingMan);
}
