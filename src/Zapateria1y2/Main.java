package Zapateria1y2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Instrucciones:

        EJERCICIO TIENDA ZAPATERÍA (primera parte)
        Tienes una zapatería con tres categorías de zapatos: Elegante, Casual, Deporte (una clase cada uno).

        Todos tienen las mismas características: marca, modelo, material, talla y precio. De momento, no hay propiedades
        distintas.

        En el programa principal, crear al menos dos instancias de cada categoría (zapatos en concreto).
        Se listan todos los zapatos con sus características.
        Primero se pregunta al usuario qué tipo de zapato quiere comprar, del tipo:
        "¿Qué tipo de zapatos quieres comprar?\n1-ELEGANTES\n2-CASUAL\n3-DEPORTIVOS"

        Luego se pregunta al usuario qué modelo quiere comprar. Lo que vale ese modelo, se va sumando al
        gastoTotal, y se sigue preguntando qué modelo quiere comprar hasta que escribe ‘salir’.

        Cuando sale, se le da el gasto total y un mensaje de ‘hasta la próxima’. El gasto total también se
        puede ir mostrando dentro del bucle mientras se va sumando.
         */

        Zapato zapato1 = new ZapatoElegante("Pikolinos","Bristol","Piel", 40, 119.95);
        Zapato zapato2 = new ZapatoElegante("Martinelli", "Empire", "Piel sintética", 39, 120);
        Zapato zapato3 = new ZapatoCasual("Tommy Hilfiger", "Signature", "Ante", 38, 129.90);
        Zapato zapato4 = new ZapatoCasual("Calvin Klein", "Alpargata", "Lona", 37, 79.90);
        Zapato zapato5 = new ZapatoDeporte("Nike", "P-6000", "Sintético", 42, 109.99);
        Zapato zapato6 = new ZapatoDeporte("Addidas", "SL 72 RS", "Sintético", 41, 65);

        System.out.println("-> Opción 1 <-" + "\n" + zapato1 + "€");
        System.out.println("\n-> Opción 2 <-" + "\n" + zapato2 + "€");
        System.out.println("\n-> Opción 3 <-" + "\n" + zapato3 + "€");
        System.out.println("\n-> Opción 4 <-" + "\n" + zapato4 + "€");
        System.out.println("\n-> Opción 5 <-" + "\n" + zapato5 + "€");
        System.out.println("\n-> Opción 6 <-" + "\n" + zapato6 + "€\n");

        Scanner scanner = new Scanner(System.in);

        String tipoZapato;
        int totalZapatos = 0;
        double gastoTotal = 0;

        do {
            System.out.println("Qué tipo de zapato quieres comprar?\nPresiona (1) -> Elegante\nPresiona (2) -> Casual\nPresiona (3) -> Deportivos\nEscribe 'Salir' para terminar");
            tipoZapato = scanner.nextLine();

            if (tipoZapato.equals("1")){
                System.out.println("Qué modelo quieres comprar? (escribe el modelo): \nOpción 1: " + zapato1.getModelo() + " -" + zapato1.getMarca() + "- (" + zapato1.getPrecio() + "€)" + "\nOpción 2: " + zapato2.getModelo() + " -" + zapato2.getMarca() + "- (" + zapato2.getPrecio() + "€)");
                String tipoModelo = scanner.nextLine();

                if (tipoModelo.equalsIgnoreCase(zapato1.getModelo())){
                    gastoTotal += zapato1.getPrecio();
                    totalZapatos ++;
                    System.out.println("---> Añadido: " + zapato1.getModelo() + " -" + zapato1.getMarca() + "- (" + zapato1.getPrecio() + "€)");
                    System.out.println("---> Total artículos: " + totalZapatos + "\n---> Llevas gastado: " + gastoTotal + "€");
                } else if (tipoModelo.equalsIgnoreCase(zapato2.getModelo())) {
                    gastoTotal += zapato2.getPrecio();
                    totalZapatos ++;
                    System.out.println("---> Añadido: " + zapato2.getModelo() + " -" + zapato2.getMarca() + "- (" + zapato2.getPrecio() + "€)");
                    System.out.println("---> Total artículos: " + totalZapatos + "\n---> Llevas gastado: " + gastoTotal + "€");
                } else {
                    System.err.println("Modelo incorrecto, vuelve a escribirlo");
                }
            }
            else if (tipoZapato.equals("2")){
                System.out.println("Qué modelo quieres comprar? (escribe el modelo): \nOpción 1: " + zapato3.getModelo() + " -" + zapato3.getMarca() + "- (" + zapato3.getPrecio() + "€)" + "\nOpción 2: " + zapato4.getModelo() + " -" + zapato4.getMarca() + "- (" + zapato4.getPrecio() + "€)");
                String tipoModelo = scanner.nextLine();

                if (tipoModelo.equalsIgnoreCase(zapato3.getModelo())){
                    gastoTotal += zapato3.getPrecio();
                    totalZapatos ++;
                    System.out.println("---> Añadido: " + zapato3.getModelo() + " -" + zapato3.getMarca() + "- (" + zapato3.getPrecio() + "€)");
                    System.out.println("---> Total artículos: " + totalZapatos + "\n---> Llevas gastado: " + gastoTotal + "€");
                } else if (tipoModelo.equalsIgnoreCase(zapato4.getModelo())) {
                    gastoTotal += zapato4.getPrecio();
                    totalZapatos ++;
                    System.out.println("---> Añadido: " + zapato4.getModelo() + " -" + zapato4.getMarca() + "- (" + zapato4.getPrecio() + "€)");
                    System.out.println("---> Total artículos: " + totalZapatos + "\n---> Llevas gastado: " + gastoTotal + "€");
                } else {
                    System.err.println("Modelo incorrecto, vuelve a escribirlo");
                }
            }
            else if (tipoZapato.equals("3")){
                System.out.println("Qué modelo quieres comprar? (escribe el modelo): \nOpción 1: " + zapato5.getModelo() + " -" + zapato5.getMarca() + "- (" + zapato5.getPrecio() + "€)" + "\nOpción 2: " + zapato6.getModelo() + " -" + zapato6.getMarca() + "- (" + zapato6.getPrecio() + "€)");
                String tipoModelo = scanner.nextLine();

                if (tipoModelo.equalsIgnoreCase(zapato5.getModelo())){
                    gastoTotal += zapato5.getPrecio();
                    totalZapatos ++;
                    System.out.println("---> Añadido: " + zapato5.getModelo() + " -" + zapato5.getMarca() + "- (" + zapato5.getPrecio() + "€)");
                    System.out.println("---> Total artículos: " + totalZapatos + "\n---> Llevas gastado: " + gastoTotal + "€");
                } else if (tipoModelo.equalsIgnoreCase(zapato6.getModelo())) {
                    gastoTotal += zapato6.getPrecio();
                    totalZapatos ++;
                    System.out.println("---> Añadido: " + zapato6.getModelo() + " -" + zapato6.getMarca() + "- (" + zapato6.getPrecio() + "€)");
                    System.out.println("---> Total artículos: " + totalZapatos + "\n---> Llevas gastado: " + gastoTotal + "€");
                } else {
                    System.err.println("Modelo incorrecto, vuelve a escribirlo");
                }
            }
            else if (!tipoZapato.equalsIgnoreCase("salir")){
                System.err.println("Opción no válida. Pulsa algún número entre el 1-3");
            }

        } while (!tipoZapato.equalsIgnoreCase("salir"));

        System.out.println("Total artículos: " + totalZapatos + "\nGasto total: " + gastoTotal + "€.\nHasta la próxima!");

        scanner.close();

        /*
        Instrucciones:

        EJERCICIO TIENDA ZAPATERÍA (segunda parte)
        Vamos a probar a usar la herencia para evitar repetir código y unir las clases de zapatos.:

        Crear una clase madre de las clases casual, elegante y deportes. Y ver cómo se usa en el main.
        Cómo creas un arraylist con todas las clases hijas para poder recorrer sus propiedades?
        Cómo sumarías todos los precios de todos los zapatos?

        +EXTRA: que alguna clase (o más de una) tenga algún atributo extra (o más de uno). Ejemplo: la
        categoría Elegante -> boolean tieneHebilla; En ese caso, no olvidar modificar el toString() y añadir
        los métodos pertinentes (getters y setters).
         */
    }
}