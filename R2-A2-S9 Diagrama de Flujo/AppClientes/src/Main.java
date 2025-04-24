import Modelo.Nodo;
import Modelo.ListaDoble;
import Controlador.Controlador;
import Vista.Vista;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ListaDoble lista = new ListaDoble();
        new Controlador(vista, lista);
        vista.setVisible(true);
    }
}
