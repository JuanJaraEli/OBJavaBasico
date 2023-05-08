package com.smart;

public abstract class SmartDevice {

    protected String manufacturer;
    protected String model;
    protected int releaseYear;
    protected String operatingSystem;

    public SmartDevice(){

    }

    public SmartDevice(String manufacturer, String model, int releaseYear, String operatingSystem) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.releaseYear = releaseYear;
        this.operatingSystem = operatingSystem;
    }
}
