package org.FactoryMethod;

import org.FactoryMethod.factory.BebidaFactory;
import org.FactoryMethod.factory.FabricasConcretas;
import org.FactoryMethod.util.Color;

public class Main {

    public static void main(String[] args) {

        // ── Bienvenida ────────────────────────────────────
        System.out.println();
        Color.separador(Color.VERDE);
        Color.titulo("PATRON DE DISENO: FACTORY METHOD", Color.VERDE);
        Color.titulo("   Cafeteria de Bebidas", Color.VERDE);
        Color.separador(Color.VERDE);
        System.out.println();

        // ── Lista de fabricas a demostrar ─────────────────
        // El cliente trabaja solo con BebidaFactory (DIP)
        BebidaFactory[] fabricas = {
                new FabricasConcretas.CafeFactory(),
                new FabricasConcretas.JugoFactory(),
                new FabricasConcretas.BatidoFactory()
        };

        // ── Factory Method en acción ──────────────────────
        for (BebidaFactory fabrica : fabricas) {
            fabrica.servirBebida();  // crea y prepara sin que Main sepa cómo
        }

        // ── Despedida ─────────────────────────────────────
        Color.separador(Color.VERDE);
        Color.titulo("Todas las bebidas servidas. Buen provecho!", Color.VERDE);
        Color.separador(Color.VERDE);
        System.out.println();
    }
}
