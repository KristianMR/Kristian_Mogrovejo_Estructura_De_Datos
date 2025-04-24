package Modelo;

import java.util.ArrayList;

public class ListaDoble {
    private Nodo inicio;

    public void Insertar(Cliente cliente){
        Nodo nuevo = new Nodo(cliente);
        if(inicio == null){
            inicio = nuevo;
        }else{
            Nodo actual = inicio;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(actual);
            nuevo.setAnterior(actual);
        }
    }

    public ArrayList<String> Listar(){
        ArrayList<String> Lista = new ArrayList<>();
        Nodo actual = inicio;
        while(actual != null){
            Lista.add(actual.getDatos().toString());
            actual = actual.getSiguiente();
        }
        return Lista;
    }
}
