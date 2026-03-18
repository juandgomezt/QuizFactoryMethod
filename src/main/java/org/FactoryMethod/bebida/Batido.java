package org.FactoryMethod.bebida;
import org.FactoryMethod.util.Color;

public class Batido extends Bebida {
    @Override public String getNombre() { return "Batido"; }
    @Override public String getColor()  { return Color.ROJO; }

    @Override
    public void preparar() {
        System.out.println(Color.ROJO + "  >> Agregando frutas y leche..." + Color.RESET);
        System.out.println(Color.ROJO + "  >> Licuando hasta consistencia cremosa..." + Color.RESET);
        System.out.println(Color.ROJO + "  >> Batido listo!" + Color.RESET);
    }
}
