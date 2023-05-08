package com.smart;

public class SmartPhone extends SmartDevice {

    String provider;
    boolean fastCharge;

    public SmartPhone(){

    }

    public SmartPhone(String manufacturer, String model, int releaseYear, String operatingSystem, String provider, boolean fastCharge) {
        super(manufacturer, model, releaseYear, operatingSystem);
        this.provider = provider;
        this.fastCharge = fastCharge;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", operatingSystem='" + operatingSystem + '\'' +
                "provider='" + provider + '\'' +
                ", fastCharge=" + fastCharge +
                '}';
    }
}
