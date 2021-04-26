package com.company.dzien22;

public class variableVisibilityScope2 {

    private String a;


    public static void main(String[] args) {
        variableVisibilityScope2 example = new variableVisibilityScope2();
        example.method3("ABC");

    }

    private void method (String b) {

        System.out.println(b);
    }
    private void method2 (String c) {

        System.out.println(a);
        System.out.println(c);
    }
    private void method3 (String c,String...e) {

        System.out.println(a);
        System.out.println(c);
        System.out.println(e.length);
    }


    private void method3 () {
//        String d;
//
//        System.out.println(d);
    }


}
