# Fundamentos Básicos de Java ☕

Repositorio de práctica para aprender y reforzar los **fundamentos de programación en Java** mediante ejemplos sencillos y progresivos.

Los ejercicios están orientados a una situación práctica de una tienda ficticia llamada **FiestaLicores**, lo que permite trabajar conceptos básicos de Java dentro de un mismo contexto.

## 📚 Contenido

| Archivo | Concepto principal |
|---|---|
| `TipoDatoVariable.java` | Tipos de datos y variables |
| `Constantes.java` | Constantes, entrada de datos y operaciones |
| `Condicionales.java` | Estructura `if / else` |
| `ControlMultiple.java` | Estructura `if / else if / else` |
| `IterativoWhile.java` | Ciclo `while` y `JOptionPane` |
| `IterativoDo.java` | Ciclo `do while` |
| `IterativoFor.java` | Ciclo `for` |
| `CodigoCompleto.java` | Integración de varios fundamentos |

## 🎯 Objetivos

Con estos ejercicios se practican conceptos esenciales de Java:

- Declaración y uso de variables.
- Tipos de datos como `String`, `int`, `double`, `boolean` y `char`.
- Constantes con `final`.
- Entrada de datos utilizando `Scanner`.
- Salida de información con `System.out.println()`.
- Estructuras condicionales.
- Ciclos repetitivos.
- Operaciones matemáticas básicas.
- Uso de `JOptionPane` para mostrar ventanas emergentes.
- Integración de diferentes conceptos en un programa completo.

## 🗂️ Estructura del proyecto

```text
fundamentos-basicos-java/
│
├── CodigoCompleto.java
├── Condicionales.java
├── Constantes.java
├── ControlMultiple.java
├── IterativaWhile.java
├── IterativoDo.java
├── IterativoFor.java
├── TipoDatoVariable.java
└── README.md
```

## 🚀 Cómo ejecutar los ejercicios

### Requisitos

- Tener instalado **Java JDK**.
- Se recomienda utilizar un IDE como IntelliJ IDEA, NetBeans o Visual Studio Code con soporte para Java.

### Desde la terminal

Ubícate dentro de la carpeta del proyecto y compila el archivo que quieras practicar:

```bash
javac NombreDelArchivo.java
```

Después ejecútalo:

```bash
java NombreDelArchivo
```

Por ejemplo:

```bash
javac Condicionales.java
java Condicionales
```

## 🧩 Orden recomendado de estudio

Para seguir una progresión sencilla, se recomienda revisar los archivos en este orden:

1. **TipoDatoVariable** → variables y tipos de datos.
2. **Constantes** → constantes y entrada de información.
3. **Condicionales** → toma de decisiones.
4. **ControlMultiple** → varias condiciones.
5. **IterativoWhile** → repetición con `while`.
6. **IterativoDo** → repetición con `do while`.
7. **IterativoFor** → repetición con `for`.
8. **CodigoCompleto** → integración de los conceptos anteriores.

## 💻 Conceptos destacados

### Variables

Se utilizan diferentes tipos de datos para representar información:

```java
String nombre = "Natalia";
int edad = 22;
double precio = 53500;
boolean mayorDeEdad = true;
```

### Constantes

Las constantes se declaran utilizando `final`:

```java
final int EDAD_MINIMA = 18;
```

### Condicionales

Permiten ejecutar diferentes instrucciones dependiendo de una condición:

```java
if (edad >= 18) {
    System.out.println("compra permitida");
} else {
    System.out.println("compra no permitida");
}
```

### Ciclos

El proyecto contiene ejemplos de:

- `while`
- `do while`
- `for`

Estos permiten repetir instrucciones bajo diferentes condiciones.

### Entrada de datos

Algunos ejercicios utilizan `Scanner`:

```java
Scanner keyboard = new Scanner(System.in);
```

### Ventanas emergentes

El proyecto también incluye ejemplos de `JOptionPane`:

```java
JOptionPane.showMessageDialog(null, "Compra permitida");
```

## 🛒 Proyecto integrador

`CodigoCompleto.java` reúne varios de los conceptos practicados en los ejercicios anteriores.

El programa simula parte del funcionamiento de una tienda de licores: solicita información del cliente, muestra productos, verifica la mayoría de edad, calcula el valor del domicilio y determina descuentos según el valor de la compra.

## 📌 Nota

Este repositorio corresponde a una **etapa inicial de aprendizaje de Java**. Los programas tienen un propósito principalmente educativo y están pensados para practicar la sintaxis y los fundamentos del lenguaje.

Los ejemplos utilizan la temática de **FiestaLicores** como contexto práctico para facilitar el aprendizaje.

## 👩‍💻 Aprendizaje

Repositorio personal de práctica en Java enfocado en construir una base sólida de programación antes de avanzar hacia conceptos más complejos como métodos, clases, objetos, arreglos, colecciones, excepciones y programación orientada a objetos.

---

⭐ **Fundamentos primero, código después.**
