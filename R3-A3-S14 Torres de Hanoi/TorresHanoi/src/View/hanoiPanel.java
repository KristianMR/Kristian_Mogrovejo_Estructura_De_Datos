package View;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Stack;

/**
 * Panel personalizado que dibuja las torres y los discos.
 */
public class hanoiPanel extends JPanel {

    private final Stack<Integer>[] towers;

    public hanoiPanel(Stack<Integer>[] towers) {
        this.towers = towers;
        setPreferredSize(new Dimension(600, 300));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int baseY = getHeight() - 50;
        int towerWidth = 10;
        int diskHeight = 20;

        int towerX[] = {100, 300, 500};

        // Dibujar torres (barras verticales)
        g.setColor(Color.DARK_GRAY);
        for (int x : towerX) {
            g.fillRect(x - towerWidth / 2, 100, towerWidth, baseY - 100);
        }

        // Dibujar discos
        for (int t = 0; t < 3; t++) {
            Stack<Integer> tower = towers[t];
            int size = tower.size();
            for (int i = 0; i < size; i++) {
                int disk = tower.get(i);
                int diskWidth = 20 + disk * 20;
                int x = towerX[t] - diskWidth / 2;
                int y = baseY - (i + 1) * diskHeight;

                g.setColor(Color.getHSBColor(disk * 0.15f, 0.7f, 0.9f));
                g.fillRect(x, y, diskWidth, diskHeight);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, diskWidth, diskHeight);
            }
        }
    }
}

