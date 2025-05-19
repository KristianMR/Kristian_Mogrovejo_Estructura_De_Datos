package View;

import javax.swing.*;
import java.util.List;

public class hanoiView {
    
    public int getNumberOfDisks() {
        String input = JOptionPane.showInputDialog(null, "Ingrese el número de discos:", "Torres de Hanoi", JOptionPane.QUESTION_MESSAGE);

        if (input == null) System.exit(0); // Si el usuario cierra el cuadro de diálogo, sale de la aplicación
        try{
            return Integer.parseInt(input);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return getNumberOfDisks(); // Vuelve a pedir el número de discos
        }
    }

    public void showMoves(List<String> moves) {

        StringBuilder sb = new StringBuilder("Los movimientos son:\n");
        moves.forEach(move -> sb.append(move).append("\n"));

        JTextArea area = new JTextArea(sb.toString());
        area.setEditable(false);

        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new java.awt.Dimension(500, 400));

        JOptionPane.showMessageDialog(null, scroll, "Movimientos", JOptionPane.INFORMATION_MESSAGE);
    }
}
