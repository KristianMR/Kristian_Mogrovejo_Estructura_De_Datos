package Controlador;

import Modelo.*;
import Vista.*;

public class Controlador {
    private ArbolBinario arbol; // Instancia del árbol binario
    private VistaConsola vista; // Instancia de la vista de consola

    // Constructor para inicializar el controlador con el árbol y la vista
    public Controlador(ArbolBinario arbol, VistaConsola vista) {
        this.arbol = arbol;
        this.vista = vista;
    }

    // Método para iniciar el controlador y manejar la interacción con el usuario
    public void Iniciar() {
        int opcion;
        do {
            vista.MostrarMenu(); // Muestra el menú de opciones al usuario
            opcion = vista.LeerOpcion(); // Lee la opción seleccionada por el usuario
            switch(opcion) {
                case 1:
                int dato = vista.LeerDato();
                arbol.insertar(dato);
                vista.MostrarMensaje("Dato " + dato + " insertado correctamente.");
                break;
                case 2:
                vista.MostrarMensaje("Recorrido en orden (in-order):");
                arbol.inOrden();
                break;
                case 3:
                vista.MostrarMensaje("Recorrido en preorden (pre-order):");
                arbol.preOrden();
                break;
                case 4:
                vista.MostrarMensaje("Recorrido en postorden (post-order):");
                arbol.postOrden();
                break;
                case 5:
                vista.MostrarMensaje("Saliendo del programa...");
                break;
                default:
                vista.MostrarMensaje("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
            }
        }while(opcion != 5); // Repite hasta que el usuario seleccione la opción de salir
    }
}
