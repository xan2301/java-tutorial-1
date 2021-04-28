package com.company.dzien18;

public class MatrixExamples {

    public static void main(String[] args) {
        MatrixExamples examples = new MatrixExamples();
        System.out.println("Matrix example");
        examples.matrixExample();
    }
// [1,3,5,1,3,5,1]
//  [
//  [1, 3, 4]
//  [3, 5, 6]
//  [4, 7, 8]

//  ]


    private void matrixExample() {
        String[][] array = {{"g1s1", "g1s2"}, {"g2s1"}, {"g3s1", "g3s2", "g3s3"}};

        int[][] array2 = new int[3][];
        array2[0] = new int[5];
        array2[1] = new int[5];
        array2[2] = new int[5];
//        array2[3] = new int[5];

        int[][] array3 = new int[3][5];

        System.out.println("Accessing element: " + array[2][1]);
        System.out.println("Accessing element: " + array[2]);

        System.out.println("Reassigning wlwmwnt");
        array[2][1] = "new g3g1";
        System.out.println("Accesing element: " + array[2][1]);

        System.out.println("Too complicated!");
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[1][0]);
//        System.out.println(array[0][0]);
        System.out.println(array[2][0]);
        System.out.println(array[2][1]);
        System.out.println(array[2][2]);

        int[][] explicitMatrix = {
                {0, 8, 2},
                {2, 5, 1},
                {3, 9, 7}


        };


//        looping through

        System.out.println("Looping");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("Element: " + array[row][column] + " ");
            }
            System.out.println();
        }


    }


}
