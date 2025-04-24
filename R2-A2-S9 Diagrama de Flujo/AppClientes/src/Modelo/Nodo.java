package Modelo;

public class Nodo {
    private Cliente Datos;
    private Nodo Siguiente;
    private Nodo Anterior;

    public Nodo(Cliente Datos){
        this.Datos = Datos;
    }

    public Cliente getDatos(){
        return Datos;
    }

    public Nodo getSiguiente(){
        return Siguiente;
    }
    public void setSiguiente(Nodo Siguiente){
        this.Siguiente = Siguiente;
    }

    public Nodo getAnterior(){
        return Anterior;
    }
    public void setAnterior(Nodo Anterior){
        this.Anterior = Anterior;
    }
}
