package com.example;

public class ConcatenaTextos {

    public static void main(String[] args) {

        String[] nombres = {"Juan", "Carlos", "Diana", "Martin" , "María"};
        String concatenado = "";

        for (int i = 0; i < nombres.length; i++){

            if (i == (nombres.length - 1)) {
                concatenado = concatenado + nombres[i] + ".";
            } else {
                concatenado = concatenado + nombres[i] + ", ";
            }
        }

        System.out.println(concatenado);
    }

}
