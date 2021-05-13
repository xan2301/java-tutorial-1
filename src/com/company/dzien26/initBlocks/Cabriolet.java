package com.company.dzien26.initBlocks;

public class Cabriolet extends Car {

    private String company = "Mercedes";

    private String model;

    public Cabriolet(String productionYear, String company, String model) {
        super(productionYear);

        System.out.println("Constructor called");
        this.company = company;
        this.model = model;
    }

    public Cabriolet(String productionYear, String model) {
        super(productionYear);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
