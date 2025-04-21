import java.util.Scanner;

public class ClientesApp {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú principal
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Listar clientes hacia la derecha");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Insertar cliente
                    System.out.print("\nIngrese la cédula del cliente: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    Cliente nuevo = new Cliente(cedula, nombre);
                    lista.insertarOrdenado(nuevo);
                    System.out.println("Cliente insertado correctamente.");
                    break;
                case 2:
                    // Listar clientes
                    System.out.println("\n--- LISTA DE CLIENTES ---");
                    lista.listarClientes();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
