package com.company.dzien29;

public class Car {

    private String company;

    private String model;

    private int productionYear;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if ("brak".equals(company)){
            System.out.println("No way mate!!!");
            return;
        }
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;




    }
}
