package org.FactoryMethod.util;

public class Color {
    public static final String RESET   = "\u001B[0m";
    public static final String NEGRITA = "\u001B[1m";
    public static final String VERDE   = "\u001B[92m";
    public static final String AMARILLO= "\u001B[93m";
    public static final String AZUL    = "\u001B[94m";
    public static final String MORADO  = "\u001B[95m";
    public static final String ROJO    = "\u001B[91m";

    public static void separador(String color) {
        System.out.println(color + "=".repeat(45) + RESET);
    }
    public static void titulo(String texto, String color) {
        System.out.println(color + NEGRITA + "  " + texto + RESET);
    }
}
