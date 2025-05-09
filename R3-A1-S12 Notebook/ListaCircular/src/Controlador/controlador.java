package Controlador;

import Modelo.ListaCircular;
import Vista.vista;

public class controlador {

    private ListaCircular lista;
    private vista vista;

    public controlador(ListaCircular lista, vista vista){
        this.lista = lista;
        this.vista = vista;
    }

    public void Iniciar() {
        int opcion;

        do {
            opcion = vista.MostrarMenu();

            switch (opcion) {
                case 1:
                    String nombre = vista.pedirNombre();
                    if (nombre == null || nombre.isBlank()) break;
                    String cedula = vista.pedirCedula();
                    if (cedula == null || cedula.isBlank()) break;
                    lista.InsertarCliente(nombre, cedula);
                    vista.mostrarMensaje("Cliente insertado correctamente.");
                    break;
                case 2:
                    String[][] datos = lista.obtenerClientes();
                    if (datos.length == 0) {
                        vista.mostrarMensaje("La lista está vacía.");
                    } else {
                        vista.mostrarTabla(datos, new String[] { "Nombre", "Cédula" });
                    }
                    break;
                case 3:
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }

        } while (opcion != 3);
    }
}
