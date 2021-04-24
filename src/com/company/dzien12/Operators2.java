package com.company.dzien12;

public class Operators2 {
    public static void main(String[] args) {

        //klikam new operators; alt + enter w operators kursor,
        Operators2 operators2 = new Operators2();
        operators2.logicalOperators();

    }

    private void comparison() {


        int a = 1;
        int b = 2;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a >= b));
        System.out.println("a => b: " + (a <= b));

    }

    private void stringComparison() {

        String a = "word1";
        String b = "word1";


        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a.equals(b): " + (a.equals(b)));

        String c = "new sentence";
//        new - przy pomocy konstruktora
        String d = new String("new sentence");

        System.out.println("c == d: " + (c == d));
        System.out.println("c.equals(d): " + (c.equals(d)));

    }

    private static void logicalOperators() {

//        boolean a = 1 > 2;
//        boolean b = 3 != 2;

// koniunkcja i alternatywa operator zaprzeczenia nr 3

        // koniunkcja && tylko jesli true = true + true inaczej false

        // alternatywa|| jesli conajmniej jeden jest true czyli: true = true + true lub true = false + true  inaczej false

        //xor (alternatywa rozlaczna) jst true jedynie jezeli oba sa false true = false + false inaczej false


        boolean a = firstBooleanProvider();
        boolean b = secondBooleanProvider();
        boolean c = thirdBooleanProvider();

        System.out.println("a & b | c =: " + ((a & b | c)));
        System.out.println("a | b & c=: " + ((a | b&c)));
//        System.out.println("!a =: " + (!a));
//
//        // xor alternatywa rozlaczna
       System.out.println("(a ^ b) & c =: " + ((a ^ b) &c));
    }

    private static boolean firstBooleanProvider() {
        System.out.println("firstBooleanProvider");
        return false;
    }

    private static boolean secondBooleanProvider() {
        System.out.println("secondBooleanProvider");
        return false;
    }

    private static boolean thirdBooleanProvider() {
        System.out.println("thirdBooleanProvider");
        return true;
    }

}
