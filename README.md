# Patrón Creacional: Factory Method
## Cafetería de Bebidas

---

## ¿Qué es?
FACTORY METHOD define una interfaz para crear objetos,
pero deja que las **subclases decidan qué clase concreta instanciar**.
El cliente nunca usa `new` directamente sobre los productos.

---

## ¿Para qué sirve?
- Cuando no sabes de antemano qué tipo de objeto necesitas crear.
- Cuando quieres que las subclases controlen qué objeto se instancia.
- Para evitar código lleno de `if/else` o `switch` para crear objetos.
- Para que agregar un nuevo tipo de objeto **no rompa el código existente**.

**Ejemplo real:** una cafetería que puede preparar Café, Jugo o Batido.
Cada bebida se crea diferente, pero el cliente solo dice "quiero una bebida"
y la fábrica correcta se encarga del resto.

---

## ¿Cómo funciona?

**1. Defines el producto como clase abstracta**
```java
public abstract class Bebida {
    public abstract void preparar();
}
```

**2. Creas los productos concretos**
```java
public class Cafe extends Bebida {
    public void preparar() { /* pasos para hacer café */ }
}
```

**3. Defines la fábrica abstracta con el Factory Method**
```java
public abstract class BebidaFactory {
    public abstract Bebida crearBebida(); // <- FACTORY METHOD
}
```

**4. Cada fábrica concreta decide qué objeto crear**
```java
public class CafeFactory extends BebidaFactory {
    public Bebida crearBebida() {
        return new Cafe(); // <- decide aquí
    }
}
```

**5. El cliente usa la fábrica sin saber qué objeto se crea**
```java
BebidaFactory fabrica = new CafeFactory();
fabrica.crearBebida().preparar(); // no sabe que es un Cafe
```

---

## Componentes

| Rol | Clase |
|---|---|
| Producto (abstracto) | `Bebida` |
| Productos concretos | `Cafe`, `Jugo`, `Batido` |
| Creador abstracto | `BebidaFactory` — declara `crearBebida()` |
| Creadores concretos | `CafeFactory`, `JugoFactory`, `BatidoFactory` |
| Cliente | `Main` |
| Utilidad | `Color` — colores ANSI para la consola |

---

## SOLID

| Principio | Dónde |
|---|---|
| **SRP** | Cada fábrica tiene una sola responsabilidad: crear su bebida |
| **OCP** | Agregar bebida = nueva subclase, sin modificar código existente |
| **LSP** | Cualquier fábrica sustituye a `BebidaFactory` sin romper nada |
| **ISP** | `Bebida` es una interfaz mínima y cohesiva |
| **DIP** | `Main` depende de abstracciones, no de clases concretas |

---

## Estructura de paquetes
```
src/main/java/org/factoryMethod/
├── Main.java                        <- cliente, demuestra el patrón
├── util/
│   └── Color.java                   <- colores ANSI para la consola
├── bebida/
│   ├── Bebida.java                  <- producto abstracto
│   ├── Cafe.java                    <- producto concreto
│   ├── Jugo.java                    <- producto concreto
│   └── Batido.java                  <- producto concreto
└── factory/
    ├── BebidaFactory.java           <- creador abstracto (Factory Method)
    └── FabricasConcretas.java       <- creadores concretos
```

---

## Cómo ejecutar
1. Descomprime el ZIP
2. `File → Open` → selecciona la carpeta del proyecto
3. Clic derecho en `Main.java` → `Run 'Main.main()'`

---

## Referencia
https://refactoring.guru/es/design-patterns/factory-method
