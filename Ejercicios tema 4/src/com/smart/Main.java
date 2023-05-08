package com.smart;

public class Main {
    public static void main(String[] args) {

        SmartPhone iphone13 = new SmartPhone("iPhone", "iPhone 13", 2021, "iOS", "TIGO", true);
        SmartWatch GtsMini2 = new SmartWatch("AmazFit", "GTS Mini 2", 2019, "Android", 25, false);

        System.out.println(iphone13);
        System.out.println(GtsMini2);
        
    }
}
