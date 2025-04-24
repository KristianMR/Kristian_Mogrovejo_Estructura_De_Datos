package Vista;

import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    public JTextField txtCedula, txtNombre;
    public JButton btnAgregar;
    public JTextArea areaClientes;

    public Vista() {
        setTitle("Gestión de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Cédula:"));
        txtCedula = new JTextField(10);
        add(txtCedula);

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField(10);
        add(txtNombre);

        btnAgregar = new JButton("Agregar");
        add(btnAgregar);

        areaClientes = new JTextArea(10, 30);
        areaClientes.setEditable(false);
        add(new JScrollPane(areaClientes));

        setVisible(true);
    }
}
