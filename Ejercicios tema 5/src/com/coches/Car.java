package com.coches;

public class Car {

    //1. Attributes
    String manufacturer;
    String model;
    int year;
    double mileage;

    //2. Constructors
    public Car(){};

    public Car(String manufacturer, String model, int year, double mileage) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
