package com.company.dzien11;

public class InternExamples {

    public static void main(String[] args) {
        String s1 = new String("Karol");
        String s2 = ("Karol");

//        System.out.println("s1 == s2: " + (s1 == s2));
//        System.out.println("s1.equals(s2): " + s1.equals(s2));

//        String s3 = s1.intern();
//        String s4 = s2.intern();
//
//        System.out.println("s3 == s4: " + (s3 == s4));
//        System.out.println("s3.equals(s4): " + s3.equals(s4));

//        System.out.println("s1 == s2: " + (s1 == s2));
//        System.out.println("s1.equals(s2): " + s1.equals(s2));

        String s5 = s1.concat(s2);
        String s6 = "KarolKarol";

        System.out.println("s5 == s6: " + (s5.intern() == s6));
        System.out.println("s5.equals(s6): " + s5.equals(s6));

    }
}
