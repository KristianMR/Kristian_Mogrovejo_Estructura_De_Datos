package Modelo;

public class cliente {

    private String nombre;
    private String cedula;
    cliente siguiente;

    public cliente(String nombre, String cedula){

        this.nombre = nombre;
        this.cedula = cedula;
        this.siguiente = null;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getCedula(){
        return cedula;
    }
}


