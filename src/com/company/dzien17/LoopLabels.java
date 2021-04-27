package com.company.dzien17;

public class LoopLabels {

    public static void main(String[] args) {
        first_loop_label:
        for (int i = 0; i < 10; i++) {
            second_loop_label:
            for (int j = 0; j < 10; j++) {
                third_loop_label:
                for (int k = 0; k < 10; k++) {
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}
