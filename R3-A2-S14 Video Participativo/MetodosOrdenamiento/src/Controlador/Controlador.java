package Controlador;

import Modelo.Orden;
import Vista.Vista;

public class Controlador {
    
    private static Vista vista;

    // Constructor que recibe una vista
    public Controlador(Vista vista) {
        this.vista = vista;
    }

    // Lógica principal del programa, ciclo de menú
    public static void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();

            if (opcion >= 1 && opcion <= 3) {
                int[] arreglo = vista.LeerArreglo();
                if (arreglo == null) continue; // si hubo error en la entrada

                switch (opcion) {
                    case 1 -> {
                        Orden.Burbuja(arreglo);
                        vista.mostrarArreglo(arreglo, "Método Burbuja");
                    }
                    case 2 -> {
                        Orden.Secuencial(arreglo);
                        vista.mostrarArreglo(arreglo, "Método Selección");
                    }
                    case 3 -> {
                        Orden.Quicksort(arreglo, 0, arreglo.length - 1);
                        vista.mostrarArreglo(arreglo, "Método Quicksort");
                    }
                }
            } else if (opcion != 4) {
                vista.Mensaje("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        vista.Mensaje("Aplicación finalizada.");
    }
}

