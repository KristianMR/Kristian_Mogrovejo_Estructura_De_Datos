package Controller;

import Model.SimpleDeque;
import View.DequeView;

import javax.swing.*;

/**
 * Enlaza la vista con el modelo y maneja la lógica de eventos.
 */
public class DequeController {

    private final SimpleDeque<String> deque = new SimpleDeque<>();
    private final DequeView view = new DequeView();

    public DequeController() {
        // Asignar listeners
        view.btnAddLeft.addActionListener(e -> addLeft());
        view.btnAddRight.addActionListener(e -> addRight());
        view.btnPollLeft.addActionListener(e -> pollLeft());
        view.btnPollRight.addActionListener(e -> pollRight());
        view.btnList.addActionListener(e -> list());
        view.btnExit.addActionListener(e -> System.exit(0));
    }

    private void addLeft() {
        String val = view.input.getText().trim();
        if (val.isEmpty()) show("Ingrese un valor.");
        else { deque.addLeft(val); clearAndShow("Insertado a la izquierda."); }
    }

    private void addRight() {
        String val = view.input.getText().trim();
        if (val.isEmpty()) show("Ingrese un valor.");
        else { deque.addRight(val); clearAndShow("Insertado a la derecha."); }
    }

    private void pollLeft() {
        String val = deque.pollLeft();
        show(val == null ? "Bicola vacía." : "Atendido (izq): " + val);
    }

    private void pollRight() {
        String val = deque.pollRight();
        show(val == null ? "Bicola vacía." : "Atendido (der): " + val);
    }

    private void list() { show("Estado: " + deque); }

    /* utilidades */
    private void show(String msg) { view.output.append(msg + "\n"); }
    private void clearAndShow(String msg) {
        view.input.setText("");
        show(msg);
    }
}
