public class Cliente {

    private int cedula;
    private String nombre;

    public Cliente(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + ", Nombre: " + nombre;
    }
}