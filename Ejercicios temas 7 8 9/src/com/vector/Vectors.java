package com.vector;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {

        int n = 4;
        Vector<Integer> integerVector = new Vector<>();

        for (int i = 0; i <= n; i++) {
            integerVector.add(i);
        }

        System.out.println(integerVector);

        integerVector.remove(2);
        integerVector.remove(3);

        System.out.println(integerVector);

        /*
        Pregunta 4:
        El problema de utilizar la capacidad por defecto para un vector que contendrá esa cantidad de elementos
        (1000), es que cada vez que el vector se desborde, copiará el vector generado hasta ese momento
        y creará uno nuevo con el doble de capacidad, para seguir almacenando los datos. Al tener tantos elementos
        que guardar, se crearán muchos vectores de manera innecesaria, por lo que el programa no será eficiente.
         */

    }
}
