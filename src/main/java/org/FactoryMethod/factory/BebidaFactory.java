package org.FactoryMethod.factory;

import org.FactoryMethod.bebida.Bebida;
import org.FactoryMethod.util.Color;

public abstract class BebidaFactory {

    // FACTORY METHOD — cada subclase lo implementa
    public abstract Bebida crearBebida();

    // Usa el factory method y opera sobre la interfaz Bebida (DIP)
    public void servirBebida() {
        Bebida bebida = crearBebida();
        String c = bebida.getColor();
        Color.separador(c);
        Color.titulo("Preparando: " + bebida.getNombre(), c);
        bebida.preparar();
        Color.separador(c);
        System.out.println();
    }
}
