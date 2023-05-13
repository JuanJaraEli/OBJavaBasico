package com.diccionario;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
El programa es un diccionario de palabras reservadas de Java. Permite al usuario ingresar la palabra cuya definición
desea saber.
 */

public class Diccionario {

    public static void main(String[] args) {

        File palabras = new File("src/com/diccionario/palabras.txt");
        Map<String, String> diccionario = new HashMap<>(); //Se empleará un HashMap para almacenar los pares palabra-definición

        updateDictionary(diccionario, palabras);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Bienvenido al diccionario de palabras reservadas de Java.\n");

        while(true) {
            System.out.println("Ingresa una palabra para buscar en el diccionario, o escribe 'salir' para abandonar el programa: ");
            String entrada = userInput.nextLine();

            if (entrada.equals("salir")) {
                break;
            }

            System.out.println(diccionario.getOrDefault(entrada, "Dicha palabra no se encuentra en el diccionario :("));
            System.out.println("Presiona enter para continuar...");
            userInput.nextLine();
        }
        userInput.close();
    }

    public static void updateDictionary(Map<String, String> diccionario, File palabras) {

        //Este método lee el archivo y puebla el hashmap con los pares existentes.

        try(Scanner scanner = new Scanner(palabras)) {

            //Para delimitar cada par palabra-definición, se usa la línea de abajo, que busca una línea blanca entre pares.
            //Entonces, el scanner irá recorriendo por cada par.
            scanner.useDelimiter("\r\n\r\n");

            /*
            El bucle while puebla el HashMap. Teniendo un par seleccionado divide, por un lado, la palabra y por el otro
            la definición, para luego guardarlos en un array de Strings de dos elementos.
             */
            while(scanner.hasNext()){
                String[] partes = scanner.next().split("\r\n",2);
                if (partes.length >= 2) {
                    String palabra = partes[0];
                    String definicion = partes[1];
                    diccionario.put(palabra, definicion);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //Se encierra la excepción, en caso de no encontrarse el archivo.
        }
    }



}
