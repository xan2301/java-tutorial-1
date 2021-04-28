package com.company.dzien17;

public class Arrays {

    public static void main(String[] args) {
        //what arrays are for?





        int[] array1;//more preferable
        int array2[];//also possible but not preferableĄ

        int[] array11 = new int[10];
        int[] array3 = new int[]{1, 2, 13, 27};
        int[] array4 = {1, 2, 3, 4};
//        array 2 = {1, 2, 3, 4};

//        elements accessed through the index, indices are 0-based -> lastIndex = size - 1
//        array 3[0] value -> 1
//        array 3[1] value -> 2
//        array 3[2] value -> 13
//        array 3[3] value -> 17

        System.out.println(java.util.Arrays.toString(array3));
        System.out.println(array3[0]);
        System.out.println(array3[1]);
        System.out.println(array3[2]);
        System.out.println(array3[3]);
        //System.out.println(array3[4]);

        System.out.println();
        array3[1]=101012;
        System.out.println(array3[1]);




    }
}
