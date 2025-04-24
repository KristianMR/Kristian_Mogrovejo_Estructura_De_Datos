/*import java.util.Scanner;

public class AppClientes {
    public static void main(String[] args) throws Exception {
        ListaDoble lista = new ListaDoble();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n__________Menú__________");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Listar clientes de izquierda a derecha");
            System.out.println("3. Listar clientes de derecha a izquierda");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese la cédula del cliente: ");
                    int cedula = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    Cliente cliente = new Cliente(cedula, nombre);
                    lista.InsertarOrdenado(cliente);
                    break;
                case 2:
                System.out.println("\nClientes de izquierda a derecha:");
                    lista.ListarIzquierdaDerecha();
                    break;
                case 3:
                System.out.println("\nClientes de derecha a izquierda:");
                    lista.ListarDerechaIzquierda();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
} */
