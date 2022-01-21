package com.company.dzien35;

import com.company.dzien35.person.Consumer;
import com.company.dzien35.person.ConsumingMan;
import com.company.dzien35.person.Producer;
import com.company.dzien35.person.ProducingMan;
import com.company.dzien35.product.Food;

public class FoodFactory {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();
    }

    private void run() {

        ProducingMan[] producingPeople = new ProducingMan[]{
                new Producer("Alicja", "Zupowa"),
                new Producer("Krzysztof", "Ciastkarska")
        };

        ConsumingMan[] consumingPeople = new ConsumingMan[]{

                new Consumer("Rafał", "Pożeracz"),
                new Consumer("Angelika", "Zajadacz")

        };

        int counter = 0;

        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                counter++;

            }
        }


        Food[] foods = new Food[counter];

        int index = 0;

        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {


                Food food = producingPerson.produce("some food", consumingPerson);
                foods[index]= food;
                index++;
            }

        }


        System.out.println("Printing Food");
        for (Food food : foods) {
            System.out.println(food);
            
        }
        }


    }



