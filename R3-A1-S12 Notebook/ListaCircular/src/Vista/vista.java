package Vista;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class vista {
    
    //muestra un menú de opciones al usuario y devuelve la opción seleccionada
    public int MostrarMenu(){

        String input = JOptionPane.showInputDialog(null,
            "Menú de opciones:"                                                       
            +"\n1. Insertar cliente"
            +"\n2. Listar clientes"
            + "\n3. Salir",
            "Menú", JOptionPane.INFORMATION_MESSAGE);
    
       if (input == null) return 3; // Si el usuario cierra el diálogo, se considera como opción 3 (Salir)

        //intenta convertir la entrada a un número entero
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1; //si no se puede convertir, retorna -1 (opción inválida)
        }
    }

    //solicita al usuario que ingrese la cedula del cliente
    public String pedirCedula() {
        return JOptionPane.showInputDialog(null, "Ingrese la cédula:", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
    }

    //solicita al usuario que ingrese el nombre del cliente
    public String pedirNombre() {
        return JOptionPane.showInputDialog(null, "Ingrese el nombre:", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
    }

    //muestra un mensaje al usuario
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    //muestra una tabla con los datos de los clientes
    public void mostrarTabla(String[][] datos, String[] columnas) {
        JTable tabla = new JTable(new DefaultTableModel(datos, columnas));
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setPreferredSize(new java.awt.Dimension(400, 200));
        JOptionPane.showMessageDialog(null, scroll, "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);
    }
}
