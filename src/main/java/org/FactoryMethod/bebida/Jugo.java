package org.FactoryMethod.bebida;
import org.FactoryMethod.util.Color;

// PRODUCTO CONCRETO
public class Jugo extends Bebida {
    @Override public String getNombre() { return "Jugo Natural"; }
    @Override public String getColor()  { return Color.AMARILLO; }

    @Override
    public void preparar() {
        System.out.println(Color.AMARILLO + "  >> Lavando frutas frescas..." + Color.RESET);
        System.out.println(Color.AMARILLO + "  >> Exprimiendo y colando..." + Color.RESET);
        System.out.println(Color.AMARILLO + "  >> Jugo listo!" + Color.RESET);
    }
}
