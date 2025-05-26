import Controlador.*;

public class App {
    public static void main(String[] args) throws Exception {
        Controlador controlador = new Controlador(null, null); // Crea una instancia del controlador
        controlador.Iniciar(); // Inicia el controlador, que a su vez inicia la aplicación
    }
}
