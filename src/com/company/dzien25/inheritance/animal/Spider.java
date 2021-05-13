package com.company.dzien25.inheritance.animal;

public class Spider extends Object {

    private String name;
    private String type;
    private String alias;

    public Spider(String name) {
        this.name = name;
    }

    public Spider(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Spider(String name, String type, String alias) {
        this.name = name;
        this.type = type;
        this.alias = alias;


    }
}



