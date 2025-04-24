package Modelo;

public class Nodo {
    private String Datos;
    private Nodo Siguiente;
    private Nodo Anterior;

    public Nodo(String Datos){
        this.Datos = Datos;
    }

    public String getDatos(){
        return Datos;
    }
    public void setDatos(String Datos){
        this.Datos = Datos;
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
