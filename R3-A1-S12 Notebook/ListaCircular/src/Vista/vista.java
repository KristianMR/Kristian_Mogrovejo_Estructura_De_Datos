package Vista;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class vista {
    
    public int MostrarMenu(){

        String input = JOptionPane.showInputDialog(null,
            "Menú de opciones:"                                                       
            +"\n1. Insertar cliente"
            +"\n2. Listar clientes"
            + "\n3. Salir",
            "Menú", JOptionPane.INFORMATION_MESSAGE);
    
       if (input == null) return 3; // si el usuario cierra la ventana

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String pedirCedula() {
        return JOptionPane.showInputDialog(null, "Ingrese la cédula:", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
    }

    public String pedirNombre() {
        return JOptionPane.showInputDialog(null, "Ingrese el nombre:", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarTabla(String[][] datos, String[] columnas) {
        JTable tabla = new JTable(new DefaultTableModel(datos, columnas));
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setPreferredSize(new java.awt.Dimension(400, 200));
        JOptionPane.showMessageDialog(null, scroll, "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);
    }
}
