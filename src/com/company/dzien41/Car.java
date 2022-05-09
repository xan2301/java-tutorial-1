package com.company.dzien41;

public class Car {

    private String company;

    private String model;

    private int productionYear;

    private SteeringWheel steeringWheel;

    static long staticNumberOfCarsCreated;

   long numberOfCarsCreated;


    public Car() {
        this.company = "BMW";
        this.model = "X5";
        this.productionYear = 2020;
        this.steeringWheel = new SteeringWheel(0.35);
        horn();
        numberOfCarsCreated++;
        staticNumberOfCarsCreated++;





    }


    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }



    public void horn() {
        int i = 5;
        System.out.println("Car horn!!");

    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", steeringWheel=" + steeringWheel +
                ", numberOfCarsCreated='" + numberOfCarsCreated + '\'' +
                '}';
    }
}
