package Modelo;

import java.util.ArrayList;
import java.util.Collections;

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
            actual.setSiguiente(nuevo);
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
        Collections.sort(Lista);
        return Lista;
    }

    public ArrayList<String> listarReversa() {
        ArrayList<String> lista = new ArrayList<>();
        Nodo actual = inicio;
    
        // Navegar hasta el final
        while (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
    
        // Ahora vamos hacia atrás
        while (actual != null) {
            lista.add(actual.getDatos().toString());
            actual = actual.getAnterior();
        }
    
        Collections.sort(lista, Collections.reverseOrder());
        return lista;
    }
}
