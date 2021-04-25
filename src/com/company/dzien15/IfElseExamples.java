package com.company.dzien15;

public class IfElseExamples {

    public static void main(String[] args) {
        IfElseExamples examples = new IfElseExamples();

//        dzien 15 26.07 sekund dokonczyc

        System.out.println("a = 1; b = 2");
        examples.ifelseCase(1, 2);
        System.out.println();

        System.out.println("a = -1; b = -2");
        examples.ifelseCase(-1, -2);
        System.out.println();

        System.out.println("a = 10; b = 20");
        examples.ifelseCase(10, 20);
        System.out.println();

        System.out.println("a = 100; b = 200");
        examples.ifelseCase(100, 200);
        System.out.println();


    }

    private void ifelseCase(int a, int b) {

        System.out.println("CASE 1");
        if (a - b > 0) {
            System.out.println("a - b > 0");
        }

        System.out.println("CASE 2");
        if (a + b > 0) {
            System.out.println("a + b > 0");
        } else {
            System.out.println("a + b < 0");
        }

        System.out.println("Case 3");
        if (a + b < 0) {
            System.out.println("a + b < 0");
        } else if (a + b >= 0 && a + b < 10) {
            System.out.println("a + b >= 0 && a +b < 10");
        } else if (a + b >= 0 && a + b < 100) {
            System.out.println("a + b >= 0 && a +b < 100");
        } else {
            System.out.println("a + b >= 100");
        }


    }

}
