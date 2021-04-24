package com.company.dzien11;

public class StringImportantMethods {

    public static void main(String[] args) {

//      metoda   charAt(int index) - drukje znak na pozycji x w zdaniu

        String s = "KarolRobiKursZJava";
        System.out.println("charAt: " + s.charAt(10));

//        metoda concat(String str) - laczenie stringow metoda concat zamiast "+"

//        String s1 = "KarolRobiKursZJava";
//        String s2 = "DrugiString";
//        String s3 = s1.concat(s2);
//
//        System.out.println("s1: " + s1);
//        System.out.println("s2: " + s2);


//        equals(Object anotherObject) - porównanie stringow ( czy sa takie same)


      /*  String s1 = "KAROLROBIKURSZJAVA";
        String s2 = "KarolRobiKursZJava";

        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equals: " + s1 == s2);
                                                */

//        equalsIgnoreCase(String anotherString) - nie bierze pod uwage czy male czy duze litery

        String s1 = "KarolRobiKursZJava";
        String s2 = "KarolRobiKursZJavA";
        String s3 = "AAA aaaaa ABAA ABCC AA CC AAA";
        String s4 = "KAROLROBIKURSZJAVA";
        String s5 = "karolrobikurszjava";
        String s6 = "                   karolrobikurszjava                ";


        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

//      length() - jakiej dlugosci jest string

        System.out.println("lengh: " + s1.length());

//        replace(char oldChar, char newChar) lub replace(CharSequence target, CharSequence replacement)

        System.out.println("replace: " + s3.replace("AAA", "zz"));

//        substring(int beginIndex) lub substring (int beginIndex, int endIndex) - ucinanie stringa od 7 litery

        System.out.println("substring: " + s1.substring(7));
        System.out.println("substring: " + s1.substring(2, 6));

//       toLowerCase() - zmiana wielkości liter z duzych na male
        System.out.println("toLowerCase: " + s4.toLowerCase());

//        toUpperCase() - zmiana wielkości liter z malych na duze
        System.out.println("toUpperCase: " + s5.toUpperCase());

//        trim() - wyrownanie spacji
        System.out.println("bez trim: " + s6);
        System.out.println("trim: " + s6.trim());

//      contains(CharSequence s) - czy string zawiero slowo

        System.out.println("contains: " + s1.contains("Karoll"));


    }
}
