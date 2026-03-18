package org.FactoryMethod.factory;

import org.FactoryMethod.bebida.*;

public class FabricasConcretas {

    public static class CafeFactory extends BebidaFactory {
        @Override
        public Bebida crearBebida() {
            return new Cafe();   // <-- Factory Method en acción
        }
    }

    public static class JugoFactory extends BebidaFactory {
        @Override
        public Bebida crearBebida() {
            return new Jugo();   // <-- Factory Method en acción
        }
    }

    public static class BatidoFactory extends BebidaFactory {
        @Override
        public Bebida crearBebida() {
            return new Batido(); // <-- Factory Method en acción
        }
    }
}
