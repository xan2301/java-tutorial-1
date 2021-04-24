package com.company.dzien12;

public class NumericPromotion {

    public static void main(String[] args) {

        {
            byte a = 4;
            short b = 5;
            int c = a + b;

            long d = 10;
            long e = c + d;


            System.out.println(c);
        }


        {
            short a = 1;
            float b = 2;
            double c = 3;
            double d = a * b / c;
            System.out.println(c);

        }


    }
}
