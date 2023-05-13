package com.arraylists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(4);

        arrayList.add("Juan");
        arrayList.add("Martin");
        arrayList.add("Victoria");
        arrayList.add("Carolina");

        LinkedList<String> linkedList = new LinkedList<>();

        for ( String str : arrayList) {
            linkedList.add(str);
        }

        for ( String elemento : arrayList) {
            System.out.println(elemento);
        }

        System.out.println("");

        for ( String elemento : linkedList) {
            System.out.println(elemento);
        }
    }



}
