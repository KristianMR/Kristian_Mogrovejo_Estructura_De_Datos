package Vista;

import java.util.Scanner;

public class VistaConsola {
    private Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

    // Método para mostrar el menú de opciones al usuario
    public void MostrarMenu() {
        System.out.println("\n--------Menú de Árboles Binarios--------");
        System.out.println("1. Insertar un nuevo dato en el árbol");
        System.out.println("2. Recorrer el árbol en orden (in-order)");
        System.out.println("3. Recorrer el árbol en preorden (pre-order)");
        System.out.println("4. Recorrer el árbol en postorden (post-order)");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para leer la opción seleccionada por el usuario
    public int LeerOpcion() {
        return scanner.nextInt();
    }

    // Método para leer un dato entero ingresado por el usuario
    public int LeerDato() {
        System.out.println("Ingrese el dato a insertar: ");
        return scanner.nextInt();
    }

    // Método para mostrar un mensaje al usuario
    public void MostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}