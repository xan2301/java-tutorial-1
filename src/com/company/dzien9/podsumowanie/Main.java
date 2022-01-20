package com.company.dzien9.podsumowanie;

import com.company.dzien9.podsumowanie.cat.Cat;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();


        System.out.println(cat.name);
        System.out.println(cat1.name);
        cat.name = "Burek";
        cat1.name = "lessie";
        System.out.println(cat.name);
        System.out.println(cat1.name);


    }


}
