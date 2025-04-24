package Vista;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Vista extends JFrame {
    private JTextField campoTexto;
    private JButton botonAgregar;
    private DefaultListModel<String> modeloLista;
    private JList<String> lista;

    public Vista() {
        setTitle("Lista Doble Enlazada - MVC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        campoTexto = new JTextField(20);
        botonAgregar = new JButton("Agregar");

        modeloLista = new DefaultListModel<>();
        lista = new JList<>(modeloLista);

        JPanel panel = new JPanel();
        panel.add(campoTexto);
        panel.add(botonAgregar);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(lista), BorderLayout.CENTER);
    }

    public String getTexto() {
        return campoTexto.getText();
    }

    public void limpiarCampo() {
        campoTexto.setText("");
    }

    public void actualizarLista(List<String> elementos) {
        modeloLista.clear();
        for (String e : elementos) {
            modeloLista.addElement(e);
        }
    }

    public JButton getBotonAgregar() {
        return botonAgregar;
    }
}
