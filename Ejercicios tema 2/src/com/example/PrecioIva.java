package com.example;

public class PrecioIva {
    public static void main(String[] args) {
        float precio = 100;
        float precioConIva = getPrecioIva(precio);
        System.out.println("El precio del producto IVA incluido es: " + precioConIva + "$.");
    }

    public static float getPrecioIva(float precio){
        float iva = 0.1000F;
        return precio * (1 + iva);
    }

}
