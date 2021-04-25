package com.company.dzien15;

public class Operators2 {
    public static void main(String[] args) {
        Operators2 operators2 = new Operators2();
        operators2.assignmentOperators();
    }

    private void increment() {
        int a = 1;
        a++;//a =a + 1 operator przyrostu
        System.out.println("a =" + a);
        System.out.println("a =" + a++);
        System.out.println("a =" + a);


        int b = 1;
        ++b;//b =b +1
        System.out.println("b =" + b);
        System.out.println("b =" + ++b);
        System.out.println("b =" + b);


    }

    private void decrement() {
        int a = 1;
        a--;//a =a - 1 operator
        System.out.println("a =" + a);
        System.out.println("a =" + a--);
        System.out.println("a =" + a);


        int b = 1;
        --b;//b =b -1
        System.out.println("b =" + b);
        System.out.println("b =" + --b);
        System.out.println("b =" + b);


    }

    private void assignmentOperators() {
        int a = 1;
        int b = 2;
        a += 2; //a = a + 2
        b += 3; //b = b + 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 1;
        int d = 2;
        c -= 2; //c = c - 2
        d -= 3; //d = d - 3
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int e = 1;
        int f = 2;
        e *= 2; //e = e * 2
        f *= 3; //f = f * 3
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = 1;
        int h = 2;
        g /= 2; //g = g / 2
        h /= 3; //h = h / 3
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        int i = 17;
        int j = 11;
        i %= 3; //i = i % 2
        //j %= 3; //j = j % 3
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }


}
