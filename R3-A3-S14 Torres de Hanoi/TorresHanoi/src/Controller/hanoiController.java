package Controller;

import Model.hanoiModel;
import View.hanoiView;

public class hanoiController {
    
    private final hanoiModel model;
    private final hanoiView view;

    public hanoiController(hanoiModel model, hanoiView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        int numberOfDisks = view.getNumberOfDisks();
        model.solve(numberOfDisks, 'A', 'B', 'C');
        view.showMoves(model.getMoves());
    }
}
