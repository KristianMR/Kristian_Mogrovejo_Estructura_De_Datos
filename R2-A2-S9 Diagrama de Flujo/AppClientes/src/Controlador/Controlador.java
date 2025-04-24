package Controlador;

import Modelo.ListaDoble;
import Vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private Vista vista;
    private ListaDoble lista;

    public Controlador(Vista vista, ListaDoble lista) {
        this.vista = vista;
        this.lista = lista;

        this.vista.getBotonAgregar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarElemento();
            }
        });
    }

    private void agregarElemento() {
        String dato = vista.getTexto();
        if (!dato.isEmpty()) {
            lista.Insertar(dato);
            vista.limpiarCampo();
            vista.actualizarLista(lista.Listar());
        }
    }
}
