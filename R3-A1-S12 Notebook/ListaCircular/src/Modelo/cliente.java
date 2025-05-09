package Modelo;

public class cliente {

    private String nombre;
    private String cedula;
    
    //referencia al siguiente cliente en la lista circular
    cliente siguiente;

    //constructor de la clase cliente que inicializa el nombre y la cedula del cliente
    public cliente(String nombre, String cedula){

        this.nombre = nombre;
        this.cedula = cedula;
        this.siguiente = null;
    }

    //metodo para obtener el nombre del cliente
    public String getNombre(){
        return nombre;
    }
    
    //metodo para obtener la cedula del cliente
    public String getCedula(){
        return cedula;
    }
}