package com.company.dzien19;

import java.util.Arrays;

public class ArraysSorting {

    public static void main(String[] args) {
        int[] array = {24, 11, 1, 54, 1, 2, 2, 4, 8, 3, 7};
        Arrays.sort(array);
        System.out.println("sorted: " + Arrays.toString(array));

        System.out.println("BS 1: " + Arrays.binarySearch(array, 54));


         /* System.out.println(array.length);

        System.out.println("Before sorting");

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(array));*/
    }
}
