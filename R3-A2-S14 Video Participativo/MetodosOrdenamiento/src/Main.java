import Controlador.Controlador;
import Vista.Vista;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        Controlador.iniciar();
    }
}
