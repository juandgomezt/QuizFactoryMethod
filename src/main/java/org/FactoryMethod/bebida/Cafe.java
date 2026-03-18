package org.FactoryMethod.bebida;
import org.FactoryMethod.util.Color;

// PRODUCTO CONCRETO
public class Cafe extends Bebida {
    @Override public String getNombre() { return "Cafe"; }
    @Override public String getColor()  { return Color.MORADO; }

    @Override
    public void preparar() {
        System.out.println(Color.MORADO + "  >> Moliendo granos frescos..." + Color.RESET);
        System.out.println(Color.MORADO + "  >> Extrayendo espresso a 90C..." + Color.RESET);
        System.out.println(Color.MORADO + "  >> Cafe listo! " + Color.RESET);
    }
}
