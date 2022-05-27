package com.company.dzien43;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {

        List<String> citiesList = new ArrayList<>();


        citiesList.add("Warsaw");
        citiesList.add("Gdansk");
        citiesList.add("Wroclaw");
        citiesList.add("Szczecin");

        System.out.println(citiesList.get(0));
        System.out.println(citiesList.get(1));
        System.out.println(citiesList.get(2));
        System.out.println(citiesList.get(3));

        System.out.println(citiesList.size());
        System.out.println(citiesList.contains("Szczecin"));
        System.out.println(citiesList.isEmpty());


    }

}
