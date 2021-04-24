package com.company.dzien15;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
//        int out = a-- - c - ++b;
//        System.out.println(out);
        int out1 = a - (--c) - (++b);
        System.out.println(out1);

    }
}
