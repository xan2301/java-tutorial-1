package com.company.dzien12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Var1 {

    public static void main(String[] args) {
//        var variable = 3;

//     Map<String, List<String>> variable = new HashMap<>();
        var variable= getsomething();
        System.out.println(variable);


    }

    private static Map<String, List<String>> getsomething(){
        return new HashMap<>();

    }
}
