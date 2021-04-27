package com.company.dzien17;

public class LoopReturn {

    public static void main(String[] args) {
        LoopReturn example = new LoopReturn();
        System.out.println(example.LoopReturnExample1());;
    }

    private String LoopReturnExample1() {

        int i = 0;
        while (i < 10) {
            if (i == 5) {
                return "return i = 5";
            }
            System.out.println("i = " + i);
            i++;
        }
        return "after loop";
    }


}


