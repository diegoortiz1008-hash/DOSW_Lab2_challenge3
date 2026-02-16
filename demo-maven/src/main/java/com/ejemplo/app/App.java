package com.ejemplo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> carrito = new ArrayList<>();

        System.out.println("Bienvenido al Reino de los Vehículos!");

        boolean continuar = true;
        while (continuar) {

            int tipo = elegirTipo(sc);
            AbstractFactory factory = factoryPorTipo(tipo);

            String categoria = elegirCategoria(sc);

            int modelo = elegirModeloPorTipo(sc, tipo);

            Vehiculo v = factory.createVehiculo(categoria, modelo);
            carrito.add(v);

            System.out.print("\n¿Desea agregar otro vehículo? (si/no): ");
            continuar = sc.nextLine().trim().equalsIgnoreCase("si");
        }

        imprimirResumen(carrito);
        sc.close();
    }

    private static int elegirTipo(Scanner sc) {
        while (true) {
            System.out.println("\nSeleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Ingrese opción: ");

            String op = sc.nextLine().trim();
            if (op.equals("1") || op.equals("2") || op.equals("3")) {
                return Integer.parseInt(op);
            }
            System.out.println("Opción inválida.");
        }
    }

    private static AbstractFactory factoryPorTipo(int tipo) {
        switch (tipo) {
            case 1: return new TierraFactory();
            case 2: return new AcuaticoFactory();
            case 3: return new AereoFactory();
            default: throw new IllegalArgumentException("Tipo inválido");
        }
    }

    private static String elegirCategoria(Scanner sc) {
        while (true) {
            System.out.println("\nSeleccione la categoría del vehículo:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese opción: ");

            String op = sc.nextLine().trim();
            switch (op) {
                case "1": return Categoria.ECONOMICO;
                case "2": return Categoria.LUJO;
                case "3": return Categoria.USADO;
                default: System.out.println("Opción inválida.");
            }
        }
    }

    private static int elegirModeloPorTipo(Scanner sc, int tipo) {
        while (true) {
            System.out.println("\nSeleccione el modelo de vehículo:");

            if (tipo == 1) { // Tierra
                System.out.println("1. Auto");
                System.out.println("2. Bicicleta");
                System.out.println("3. Moto");
            } else if (tipo == 2) { // Acuático
                System.out.println("1. Lancha");
                System.out.println("2. Velero");
                System.out.println("3. Jet Skis");
            } else { // Aéreo
                System.out.println("1. Avión");
                System.out.println("2. Avioneta");
                System.out.println("3. Helicóptero");
            }

            System.out.print("Ingrese opción: ");
            String op = sc.nextLine().trim();

            if (op.equals("1") || op.equals("2") || op.equals("3")) {
                return Integer.parseInt(op);
            }
            System.out.println("Opción inválida.");
        }
    }

    private static void imprimirResumen(List<Vehiculo> carrito) {
        System.out.println("\n=== RESUMEN DE COMPRA ===\n");

        for (int i = 0; i < carrito.size(); i++) {
            Vehiculo v = carrito.get(i);
            System.out.println("Vehículo " + (i + 1) + ":");
            System.out.println("Tipo: " + v.getModelo());
            System.out.println("Categoría: " + v.getCategoria());
            System.out.println("Velocidad máxima: " + v.getVelocidadMax() + " km/h");
            System.out.println("Precio: $" + String.format("%,.0f", v.getPrecio()));
            System.out.println("Equipamiento: " + v.getEquipamiento());
            System.out.println();
        }

        double subtotal = carrito.stream().mapToDouble(Vehiculo::getPrecio).sum();
        double descuento = 0; // si luego quieres aplicar reglas, aquí

        System.out.println("Subtotal: $" + String.format("%,.0f", subtotal));
        System.out.println("Descuento aplicado: $" + String.format("%,.0f", descuento));
        System.out.println("Total a pagar: $" + String.format("%,.0f", (subtotal - descuento)));

        System.out.println("\n¡Gracias por su compra en el Reino de los Vehículos!");
    }
}
