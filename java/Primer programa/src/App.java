import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tipos = {"Americana", "Hawaiana", "Suprema"};
        int[] unidadesVendidas = new int[tipos.length];
        int[] recaudacion = new int[tipos.length];
        int numeroPedido = 1;
        int totalVentas = 0;

        System.out.println("=== Pizzería ===");
        while (true) {
            System.out.println("\n1. Pizza Americana ($25)");
            System.out.println("2. Pizza Hawaiana ($30)");
            System.out.println("3. Pizza Suprema ($35)");
            System.out.println("0. Finalizar y ver resumen");
            System.out.print("Elija una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número válido.");
                scanner.nextLine();
                continue;
            }
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }
            if (opcion < 1 || opcion > tipos.length) {
                System.out.println("Opción no válida.");
                continue;
            }

            System.out.print("¿Cuántas pizzas " + tipos[opcion - 1] + " desea? ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese una cantidad válida.");
                scanner.nextLine();
                continue;
            }
            int cantidad = scanner.nextInt();
            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
                continue;
            }

            Pizza pizza;
            switch (opcion) {
                case 1 -> pizza = new PizzaAmericana(String.format("%03d", numeroPedido), "Cliente", cantidad);
                case 2 -> pizza = new PizzaHawaiana(String.format("%03d", numeroPedido), "Cliente", cantidad);
                default -> pizza = new PizzaSuprema(String.format("%03d", numeroPedido), "Cliente", cantidad);
            }

                int precioPedido = pizza.calcularPrecio();
            unidadesVendidas[opcion - 1] += cantidad;
                recaudacion[opcion - 1] += precioPedido;
                totalVentas += precioPedido;
            numeroPedido++;
            System.out.println("Pedido registrado: " + cantidad + " pizza(s) " + tipos[opcion - 1]
                    + ". Total: $" + precioPedido);
        }

        System.out.println("\n=== Resumen de ventas ===");
        int mayorRecaudacion = 0;
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(tipos[i] + ": " + unidadesVendidas[i] + " vendida(s), $" + recaudacion[i]);
            mayorRecaudacion = Math.max(mayorRecaudacion, recaudacion[i]);
        }
        System.out.println("Total recaudado: $" + totalVentas);
        System.out.println("Mayor recaudación:");
        for (int i = 0; i < tipos.length; i++) {
            if (recaudacion[i] == mayorRecaudacion && mayorRecaudacion > 0) {
                System.out.println(tipos[i] + ": " + unidadesVendidas[i] + " vendida(s), $" + recaudacion[i]);
            }
        }
        if (mayorRecaudacion == 0) {
            System.out.println("No se registraron ventas.");
        }
        scanner.close();
    }
}
