import Modelo.*;
import Vista.*;
import Controlador.*;

public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        Vista vista = new Vista();
        new Controlador(vista, lista);
    }
}
