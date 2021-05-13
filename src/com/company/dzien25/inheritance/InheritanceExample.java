package com.company.dzien25.inheritance;

import com.company.dzien25.inheritance.animal.Cat;
import com.company.dzien25.inheritance.animal.Spider;

public class InheritanceExample {

    public static void main(String[] args) {

//        public
//        protected
//        default - (package private)
//        private

        Cat cat = new Cat("white","mruczek");
        System.out.println(cat.toString());

        Spider spider = new Spider("aragog","type","alias");



    }


}
