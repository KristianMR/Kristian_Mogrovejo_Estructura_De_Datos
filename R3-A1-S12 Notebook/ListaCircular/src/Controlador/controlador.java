package Controlador;

import Modelo.ListaCircular;
import Vista.vista;

//clase controlador que maneja la lógica de la aplicación entre el modelo y la vista
public class controlador {

    private ListaCircular lista;
    private vista vista;

    //constructor de la clase controlador que inicializa la lista y la vista
    public controlador(ListaCircular lista, vista vista){
        this.lista = lista;
        this.vista = vista;
    }

    //método que inicia la aplicación y muestra el menú al usuario
    public void Iniciar() {
        int opcion;

        do {
            opcion = vista.MostrarMenu(); //muestra el menú y obtiene la opción seleccionada por el usuario

            //verifica la opción seleccionada y ejecuta la acción correspondiente
            switch (opcion) {
                case 1:
                    //solicita al usuario que ingrese el nombre y la cédula del cliente
                    String nombre = vista.pedirNombre();
                    if (nombre == null || nombre.isBlank()) break;
                    String cedula = vista.pedirCedula();
                    if (cedula == null || cedula.isBlank()) break;
                    lista.InsertarCliente(nombre, cedula);
                    vista.mostrarMensaje("Cliente insertado correctamente.");
                    break;
                case 2:
                    //listar clientes
                    String[][] datos = lista.obtenerClientes();
                    if (datos.length == 0) {
                        //si la lista está vacía, muestra un mensaje indicando que no hay clientes
                        vista.mostrarMensaje("La lista está vacía.");
                    } else {
                        //si la lista no está vacía, muestra los datos de los clientes en una tabla
                        vista.mostrarTabla(datos, new String[] { "Nombre", "Cédula" });
                    }
                    break;
                case 3:
                    vista.mostrarMensaje("Saliendo..."); //mensaje de salida
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida."); //mensaje de opción inválida
            }

        } while (opcion != 3);
    }
}
