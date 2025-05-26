package Modelo;

public class nodo {
    int dato; // Dato del nodo
    nodo izquierdo; // Nodo izquierdo
    nodo derecho; // Nodo derecho

    // Constructor para inicializar el nodo con un dato
    public nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}
