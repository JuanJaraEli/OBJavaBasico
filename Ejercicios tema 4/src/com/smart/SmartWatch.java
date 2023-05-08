package com.smart;

public class SmartWatch extends SmartDevice{

    double size;
    boolean answerCalls;

    public SmartWatch(){

    }

    public SmartWatch(String manufacturer, String model, int releaseYear, String operatingSystem, double size, boolean answerCalls) {
        super(manufacturer, model, releaseYear, operatingSystem);
        this.size = size;
        this.answerCalls = answerCalls;


    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", operatingSystem='" + operatingSystem + '\'' +
                "size=" + size +
                ", answerCalls=" + answerCalls +
                '}';
    }
}
