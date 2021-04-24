package com.company.dzien8.animal;

public class Cat {

    public Cat(String name){
        this.name = name;

    }

    private String name;


//    public String leftLegFront = "LLF";
//
//    public String rightLegFront = "RLF";
//
//    public String leftLegBack = "LLB";
//
//    public String rightLegBack = "RLB";

    public String gimmeVoice() {
        return "meow";
    }

    public String getName (){
        return name;
    }

public void setName(String name){
    this.name = name;
}

}
