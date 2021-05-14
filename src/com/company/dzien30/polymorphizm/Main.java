package com.company.dzien30.polymorphizm;

public class Main {

    public static void main(String[] args) {



//        Cabriolet cabriolet1 = new Cabriolet("red",true);
        Car cabriolet2 = new Cabriolet("blue",false);
//        Object cabriolet3 = new Cabriolet("white",false);

//        SUV suv1 = new SUV("yellow",1.89);
        SUV suv2 = new SUV("brown",1.92);
//        SUV suv3 = new SUV("black",1.90);


        cabriolet2.describe();
        suv2.describe();


    }


}
