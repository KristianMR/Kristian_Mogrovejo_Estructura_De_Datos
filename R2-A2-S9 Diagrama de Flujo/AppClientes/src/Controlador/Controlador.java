package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.*;

import javax.swing.JOptionPane;

public class Controlador {
    private Vista vista;
    private ListaDoble lista;

    public Controlador(Vista vista, ListaDoble lista) {
        this.vista = vista;
        this.lista = lista;

        this.vista.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarElemento();
            }
        });
        this.vista.btnListarIzqDer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarNormal();
            }
        });
        
        this.vista.btnListarDerIzq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarReverso();
            }
        });
    }

    public void listarNormal() {
        vista.areaClientes.setText("");
        for (String s : lista.Listar()) {
            vista.areaClientes.append(s + "\n");
        }
    }
    
    public void listarReverso() {
        vista.areaClientes.setText("");
        for (String s : lista.listarReversa()) {
            vista.areaClientes.append(s + "\n");
        }
    }

    public void agregarElemento() {
        try {
            if (vista.txtCedula.getText().isEmpty() || vista.txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Todos los campos deben estar llenos.");
                return;
            }

            int cedula = Integer.parseInt(vista.txtCedula.getText());
            String nombre = vista.txtNombre.getText();

            Cliente cliente = new Cliente(cedula, nombre);
            lista.Insertar(cliente);

            System.out.println("Cliente agregado: " + cliente);

            vista.txtCedula.setText("");
            vista.txtNombre.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "La cédula debe ser un número.");
        }
    }
}
