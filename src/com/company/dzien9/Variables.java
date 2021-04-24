package com.company.dzien9;

public class Variables {

    public static void main(String[] args) {
        byte a = 2;
        short b = 32_000;
        int c = 147_483_648;
        long d = 2_147_483_648L;
        float e = 2.55f;
        double f =2.5555d;
        char g = '3';
        char h = 98;
        boolean i = true;
        boolean j = false;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);


    }


//      byte    -       1 bajt - zakres od -128 do 127
//      short   -       2 bajty - zakres od -32 768 do 32 767
//      int     -       4 bajty - zakres od -2 147 483 648 do 2 147 483 647
//      long    -       8 bajtów - zakres od -2^63 do (2^63)-1 (posiadają przyrostek L, lub l)
//
//
//      float   -       4 bajty - max ok 6-7 liczb po przecinku (posiadają przyrostek F, lub f)
//      double  -       8 bajtów - max ok 15 cyfr po przecinku (posiadają przyrostek D, lub d)
//
//      char    -       2 bajty - single character (literki) (wartości z tablicy ASCII)
//      boolean -       1 bit - true or false (wartość logiczna 0 albo 1)


}
