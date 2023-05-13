package com.dividebyzero;

public class DivideByZero {

    public static void main(String[] args) {
        try{
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse.");
        }
        System.out.println("Demo de código.");

    }

    public static void DividePorCero() throws ArithmeticException {
        throw new ArithmeticException();
    }
}
