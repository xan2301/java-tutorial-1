package com.company.dzien16;

public class LoopFor {

    public static void main(String[] args) {

        LoopFor loopFor = new LoopFor();
        loopFor.forLoopExample3();

    }

//      for (part 1; part 2; part 3){
//      what to run
//      }

//      part 1 is run one before the execution of the code block inside for loop
//      part 2 is the condition to stop executing the loop
//      part 3 is run each time after running the for loop code


    private void forLoopExample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
//        System.out.println("i = " + i);

    }

    private void forLoopExample2() {
        int j = 0;
        for (; j > -5; j--) {
            System.out.println("j = " + j);

        }

    }

        private void forLoopExample3() {
            int k = 0;
            for (; k < 5; ) {
                System.out.println("k = " + k);
                k++;
            }


    }

}


