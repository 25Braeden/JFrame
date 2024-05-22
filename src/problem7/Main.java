package problem7;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color purple = Color.decode("#800080");
        g.setColor(purple);

        int[] xPoints = {100, 150, 50};
        int[] yPoints = {100, 200, 200};
        int nPoints = 3;

        g.fillPolygon(xPoints, yPoints, nPoints);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Purple Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new Main());
        frame.setVisible(true);
    }
}
