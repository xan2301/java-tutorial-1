package com.company.dzien24.primitivesvsreferences;

import com.company.dzien24.primitivesvsreferences.Cat;

public class PrimitivesVsReferences {

    public static void main(String[] args) {
        int a = 4;
        double c = 10;
        boolean f= false;


        String abc = "abc";

        Cat refCat1 = new Cat("CAT1");
        Cat refCat2 = refCat1;
        Cat refCat3 = refCat1;
        Cat refCat4 = refCat1;

        System.out.println(refCat1);
        refCat1.name = "Cat_Other";
        System.out.println(refCat3);


    }

}
