package Modelo;

public class nodo {
    int dato;
    nodo izquierdo;
    nodo derecho;

    public nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}
