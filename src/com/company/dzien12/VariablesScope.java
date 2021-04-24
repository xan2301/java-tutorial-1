package com.company.dzien12;


public class VariablesScope {

    public static void main(String[] args) {
        method1();
    int a = 2;

        System.out.println(a);
    }

        {

            int a = 5;

            System.out.println(a);

        }

       private static void method1() {

            int a = 5;
            System.out.println(a);

        }



    }



