package com.company.dzien26.overiding;

public class SubClass extends SuperClass {

    private String privateMethod() {
        return "SubClass privateMethod";

    }

    protected String protectedMethod() {
        return "SubClass protectedMethod";

    }

    String defaultMethod() {
        return "SubClass defaultMethod";

    }


    @Override
    public String publicMethod() {
        return "SubClass publicMethod";

    }


}
