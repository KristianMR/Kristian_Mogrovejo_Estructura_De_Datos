package View;

import javax.swing.*;
import java.awt.*;

/**
 * Ventana única con controles y área de resultados.
 */
public class DequeView extends JFrame {

    public final JTextField input = new JTextField(10);
    public final JButton btnAddLeft = new JButton("Insertar Izq");
    public final JButton btnAddRight = new JButton("Insertar Der");
    public final JButton btnPollLeft = new JButton("Atender Izq");
    public final JButton btnPollRight = new JButton("Atender Der");
    public final JButton btnList = new JButton("Listar");
    public final JButton btnExit = new JButton("Salir");
    public final JTextArea output = new JTextArea(10, 30);

    public DequeView() {
        super("Bicola con lista simple");

        // Layout superior (input + botones)
        JPanel top = new JPanel(new FlowLayout());
        top.add(new JLabel("Valor:"));
        top.add(input);
        top.add(btnAddLeft);
        top.add(btnAddRight);
        top.add(btnPollLeft);
        top.add(btnPollRight);
        top.add(btnList);
        top.add(btnExit);

        output.setEditable(false);
        JScrollPane scroll = new JScrollPane(output);

        add(top, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
