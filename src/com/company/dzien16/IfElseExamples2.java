package com.company.dzien16;

public class IfElseExamples2 {
    public static void main(String[] args) {
        IfElseExamples2 examples = new IfElseExamples2();


        System.out.println("switch: " + examples.switchCase(1,2));
        System.out.println("switch: " + examples.switchCase(-1,-2));
        System.out.println("switch: " + examples.switchCase(1,3));
        System.out.println("switch: " + examples.switchCase(1,4));


//        examples.switchCase(1, 2);
//        System.out.println();
//
//        examples.switchCase(-1, -2);
//        System.out.println();
//
//        examples.switchCase(1, 3);
//        System.out.println();
//
//        examples.switchCase(1, 4);
//        System.out.println();


    }

//    private void switchCase(int a, int b) {
//
//        int sum = a + b;
//        switch (sum){
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("a + b = 1 || a + b = 2 || a + b = 3 ");
//                break;
//            case 4:
//                System.out.println("a + b = 4");
//                break;
//
//            default:
//                System.out.println("a + b is default");
//                break;
//        }
//
        private String switchCase(int a, int b){

            switch (a + b){

                case 1:
                case 2:
                case 3:
                    return "a + b = 1 || a + b = 2 || a + b = 3";
                case 4:
                    return "a + b = 4";
                default:
                    return "a + b is default";






            }



        }




    }


