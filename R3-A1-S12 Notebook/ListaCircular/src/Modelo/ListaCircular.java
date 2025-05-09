package Modelo;

public class ListaCircular {

    private cliente inicio;

    //metodo para insrertar un cliente en la lista circular
    public void InsertarCliente(String nombre, String cedula){

        cliente nuevo = new cliente(nombre, cedula); //crea un nuevo nodo cliente con los datos ingresados

        if(inicio == null){
            //si la lista está vacia, el nuevo cliente es el primero y apunta a si mismo
            nuevo.siguiente = nuevo;
            inicio = nuevo;
        }else{
            //si la lista no está vacia, se inserta el nuevo cliente al inicio de la lista
            nuevo.siguiente = inicio.siguiente;
            inicio.siguiente = nuevo;
            inicio = nuevo;
        }
    }

    //metodo para listar los clientes de la lista circular
    public String ListarClientes(){

        //verifica si la lista está vacia y retorna un mensaje indicando que no hay clientes
        if(inicio == null) return "La lista está vacía.";

        StringBuilder sb = new StringBuilder();
        cliente actual = inicio.siguiente; //comienza desde el primer cliente

        //recorre la lista circular hasta llegar al cliente inicial
        do{
            //agrega los datos del cliente actual al StringBuilder
            sb.append("Nombre: ").append(actual.getNombre()).append(", Cedula: ").append(actual.getCedula()).append("\n");

            actual = actual.siguiente; //avanza al siguienite cliente

        }while(actual != inicio.siguiente); //se detiene cuando vuelve al cliente inicial

        return sb.toString(); //retorna la lista de clientes como un String
    }

    //metodo para obtener los datos de los clientes en un formato de matriz
    public String[][] obtenerClientes() {
        if (inicio == null) return new String[0][0]; // si la lista está vacía, retorna una matriz vacía

        int cantidad = ContarClientes();
        String[][] datos = new String[cantidad][2];
        cliente actual = inicio.siguiente;

        for (int i = 0; i < cantidad; i++) {
            datos[i][0] = actual.getNombre();
            datos[i][1] = actual.getCedula();
            actual = actual.siguiente;
        }

        return datos;
    }

    //metodo para contar la cantidad de clientes en la lista circular
    private int ContarClientes() {
        if (inicio == null) return 0;
        int count = 0;
        cliente actual = inicio.siguiente;
        do {
            count++;
            actual = actual.siguiente;
        } while (actual != inicio.siguiente);
        return count;
    }
}
