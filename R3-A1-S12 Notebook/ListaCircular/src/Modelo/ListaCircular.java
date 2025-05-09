package Modelo;

public class ListaCircular {

    private cliente inicio;

    public void InsertarCliente(String nombre, String cedula){

        cliente nuevo = new cliente(nombre, cedula);

        if(inicio == null){
            nuevo.siguiente = nuevo;
            inicio = nuevo;
        }else{
            nuevo.siguiente = inicio.siguiente;
            inicio.siguiente = nuevo;
            inicio = nuevo;
        }
    }

    public String ListarClientes(){

        if(inicio == null) return "La lista está vacía.";

        StringBuilder sb = new StringBuilder();
        cliente actual = inicio.siguiente;

        do{
            sb.append("Nombre: ").append(actual.getNombre()).append(", Cedula: ").append(actual.getCedula()).append("\n");
            actual = actual.siguiente;
        }while(actual != inicio.siguiente);

        return sb.toString();
    }

    public String[][] obtenerClientes() {
        if (inicio == null) return new String[0][0];

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
