package com.alreves;

public class Main {
    public static void main(String[] args) {
        reverse("buenas");
    }
    //
    public static void reverse (String text) {

        char[] textArray = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            textArray[i] = text.charAt(text.length() - 1 - i);
        }

        System.out.print(textArray);
    }
}
