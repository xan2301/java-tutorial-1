package com.company.dzien10;

public class StringConcatenation {

    public static void main(String[] args) {
        String hello = "Hello";
        String space = " ";
        String world = "world";
        String exclamation = "!";
        String result ="NO RESULT:";

//        1:

//        System.out.println("result1 variable: " + (hello + space + world + exclamation));
//        System.out.println("result1: " + hello + space + world + exclamation);
//        System.out.println();

        //2:

//        String result2 = 10 + 20 + hello + space + world + 30 + 40;
//
//        // 10 + 20 to int dalej to String
//        System.out.println("result1 variable: " + (result2));
//        System.out.println("result2: " + 10 + 20 + hello + space + world + 30 + 40);
//        System.out.println();

        result = hello.concat(space).concat(world).concat(exclamation);
        String result3 = hello.concat(space).concat(world).concat(exclamation);
        System.out.println("result3 variable: " + result3);
        System.out.println("result3: " + hello.concat(space).concat(world).concat(exclamation) );

        String sb = hello +
                space +
                world +
                exclamation;
        System.out.println(sb);



    }
}
