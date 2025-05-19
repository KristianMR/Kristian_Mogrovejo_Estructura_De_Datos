import Controller.hanoiController;
import Model.hanoiModel;
import View.hanoiView;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        
        hanoiModel model = new hanoiModel();
        hanoiView view = new hanoiView();
        hanoiController controller = new hanoiController(model, view);

        SwingUtilities.invokeLater(controller::start);
    }
}
