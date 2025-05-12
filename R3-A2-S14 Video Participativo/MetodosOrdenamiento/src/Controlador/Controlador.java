package Controlador;

import modelo.Ordenamientos;
import vista.VistaJOptionPane;

public class Controlador {
    
    private VistaJOptionPane vista;

    // Constructor que recibe una vista
    public Controlador(VistaJOptionPane vista) {
        this.vista = vista;
    }

    // Lógica principal del programa, ciclo de menú
    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();

            if (opcion >= 1 && opcion <= 3) {
                int[] arreglo = vista.leerArreglo();
                if (arreglo == null) continue; // si hubo error en la entrada

                switch (opcion) {
                    case 1 -> {
                        Ordenamientos.burbuja(arreglo);
                        vista.mostrarArreglo(arreglo, "Método Burbuja");
                    }
                    case 2 -> {
                        Ordenamientos.seleccion(arreglo);
                        vista.mostrarArreglo(arreglo, "Método Selección");
                    }
                    case 3 -> {
                        Ordenamientos.quicksort(arreglo, 0, arreglo.length - 1);
                        vista.mostrarArreglo(arreglo, "Método Quicksort");
                    }
                }
            } else if (opcion != 4) {
                vista.mostrarMensaje("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        vista.mostrarMensaje("Aplicación finalizada.");
    }
}
📄 Main.java (inicio del programa)
java
Copiar
Editar
import controlador.Controlador;
import vista.VistaJOptionPane;

public class Main {
    public static void main(String[] args) {
        // Se inicializa la vista y se pasa al controlador
        VistaJOptionPane vista = new VistaJOptionPane();
        Controlador controlador = new Controlador(vista);
        controlador.iniciar(); // Ejecutar la lógica del programa
    }
}
