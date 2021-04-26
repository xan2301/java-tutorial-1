package com.company.dzien22;

public class VariableVisibilityScope {


    private String c;

    private void method(String a) {
        System.out.println(a);
        method2(a);

    }

    private void method2(String b) {

        System.out.println(b);

    }







}
