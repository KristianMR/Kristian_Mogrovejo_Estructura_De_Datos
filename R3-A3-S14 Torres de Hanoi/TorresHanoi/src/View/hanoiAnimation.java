package View;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Ventana que muestra la animación paso a paso con un botón.
 */
public class hanoiAnimation extends JFrame {

    private final hanoiPanel panel;
    private final Stack<Integer>[] towers = new Stack[3];
    private final Map<Character, Integer> idx = Map.of('A', 0, 'B', 1, 'C', 2);

    private int stepIndex = 0;
    private final List<String> moves;

    public hanoiAnimation(int numDisks, List<String> moves) {
        super("Animación Torres de Hanoi");

        // Inicializar torres
        for (int i = 0; i < 3; i++) towers[i] = new Stack<>();
        for (int i = numDisks; i >= 1; i--) towers[0].push(i);  // torre A

        this.moves = moves;
        this.panel = new hanoiPanel(towers);

        // ---------- UI ----------
        JButton nextBtn = new JButton("Siguiente paso");
        nextBtn.addActionListener(e -> doNextStep());

        add(panel, BorderLayout.CENTER);
        add(nextBtn, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /** Avanza un movimiento y repinta. */
    private void doNextStep() {
        if (stepIndex >= moves.size()) {
            JOptionPane.showMessageDialog(this, "¡Animación completada!");
            return;
        }
        // Ejemplo: "Mover disco 3 de A a C"
        String[] parts = moves.get(stepIndex++).split(" ");
        int from = idx.get(parts[4].charAt(0));
        int to   = idx.get(parts[6].charAt(0));

        if (!towers[from].isEmpty()) {
            towers[to].push(towers[from].pop());
        }
        panel.repaint();
    }
}
