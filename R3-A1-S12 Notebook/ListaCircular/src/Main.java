import Controlador.controlador;
import Modelo.ListaCircular;
import Vista.vista;

public class Main {
    //método principal que inicia la aplicación
    public static void main(String[] args) throws Exception {

        //crea una instancia del modelo que maneja la lista circular de clientes
        ListaCircular modelo = new ListaCircular();

        //crea una instancia de la vista que maneja la interfaz gráfica
        vista vista = new vista();

        //crea una instancia del controlador que maneja la lógica de la aplicación
        controlador controlador = new controlador(modelo, vista);
        
        //inicia la aplicación llamando al método Iniciar del controlador
        controlador.Iniciar();
    }
}
