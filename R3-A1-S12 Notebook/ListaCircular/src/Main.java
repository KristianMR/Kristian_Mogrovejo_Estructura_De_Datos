import Controlador.controlador;
import Modelo.ListaCircular;
import Vista.vista;

public class Main {
    public static void main(String[] args) throws Exception {
         ListaCircular modelo = new ListaCircular();
        vista vista = new vista();
        controlador controlador = new controlador(modelo, vista);
        controlador.Iniciar();
    }
}
