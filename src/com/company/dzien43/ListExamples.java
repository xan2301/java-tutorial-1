package com.company.dzien43;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            list.add("String" + i);


        }

        System.out.println(list);

    }

}
