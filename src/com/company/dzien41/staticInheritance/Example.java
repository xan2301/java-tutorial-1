package com.company.dzien41.staticInheritance;

public class Example {

    public static void main(String[] args) {

        B b = new B();
        b.print();

        A ab = new B();
        ab.print();

        C c = new C();
        c.print();

        A ac = new C();
        ac.print();

    }
}
