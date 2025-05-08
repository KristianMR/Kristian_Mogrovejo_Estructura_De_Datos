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

    public void Iniciar(){

        int opcion;

        do{

            opcion = vista.MostrarMenu();

            switch(opcion){
                case 1:
                    String nombre = vista.PedirNombre();
                    String cedula = vista.PedirCedula();
                    lista.InsertarCliente(nombre, cedula);
                    break;
                case 2:
                    String clientes = lista.ListarClientes();
                    vista.MostrarClientes(clientes);
                    break;
                case 3:
                    vista.MostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.MostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }while(opcion != 3);
    }
}
