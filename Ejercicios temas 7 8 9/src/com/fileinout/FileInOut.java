package com.fileinout;

import java.io.*;

public class FileInOut {

    public static void main(String[] args) {

        File fileIn = new File("src/com/fileinout/origen");
        File fileOut = new File("src/com/fileinout/destino");

        copyFile(fileIn, fileOut);
    }

    public static void copyFile(File fileIn, File fileOut) {

        try (InputStream origen = new FileInputStream(fileIn);
             PrintStream destino = new PrintStream(fileOut)) {
            int data = origen.read();
            while (data != -1) {
                destino.write(data);
                data = origen.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
