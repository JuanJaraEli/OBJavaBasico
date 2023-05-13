package com.arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> listEnteros = new ArrayList<>();


        for(int i = 1; i <= 10; i++) {
            listEnteros.add(i);
        }

        System.out.println("Lista original:");

        for(int i = 0; i <= 9; i++) {
            System.out.println(listEnteros.get(i));
        }

        System.out.println("");

        System.out.println("Lista sin pares: ");

        Iterator<Integer> iterator = listEnteros.iterator();

        while(iterator.hasNext()) {

            Integer number = iterator.next();

            if(number % 2 == 0) {
                iterator.remove();
            } else {
                System.out.println(number);
            }


        }
    }
}
