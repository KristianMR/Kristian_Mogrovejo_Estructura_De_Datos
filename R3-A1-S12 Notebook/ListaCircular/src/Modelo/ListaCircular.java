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
}
