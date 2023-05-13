package com.arrays;

public class ArrayStrings {
    public static void main(String[] args) {
        String[] strArray = {"hola", "como", "estas"};
        getArrays(strArray);

        System.out.println(" ");

        int[][] intArray2D = {{1,2},{3,4},{5,6}};
        getInt(intArray2D);
    }
    public static void getArrays (String[] strArray) {

        for (String str : strArray) {
            System.out.println(str);
        }
    }

    public static void getInt (int[][] intArray2D) {

        for (int[] array : intArray2D) {
            for (int element : array) {
                System.out.println(element);
            }
        }
    }

}
