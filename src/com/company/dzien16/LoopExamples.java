package com.company.dzien16;

public class LoopExamples {

    public static void main(String[] args) {
        LoopExamples loopExamples = new LoopExamples();
        loopExamples.doWhileLoopExample2();
    }

    private void whileLoopExample1() {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

    }

    private void whileLoopExample2() {
        int i = 0;
        int j = 0;
        while (i < 10 && j < 10) {
            System.out.println("i = " + i + "j = " + j);
            i++;
            j++;
        }

    }

    private void doWhileLoopExample1() {
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

    }


    private void doWhileLoopExample2() {

        System.out.println("Case 1");
        int i = 10;
        while (i < 0){

            System.out.println("i =" +i);

            i++;

        }
        System.out.println("Case 2");
        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 0);

    }


}
