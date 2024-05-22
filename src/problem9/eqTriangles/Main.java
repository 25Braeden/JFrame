package problem9.eqTriangles;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        Random random = new Random();
        super.paintComponent(g);

        for (int i = 0; i < 500; i++) {
            int randInt = random.nextInt(0xFFFFFF);
            String hexColor = String.format("#%06X", randInt);
            Color randColor = Color.decode(hexColor);
            g.setColor(randColor);

            int xmodifier = (int) (Math.random() * 700);
            int ymodifier = (int) (Math.random() * 700);
            int[] xPoints = {100 + xmodifier, 150 + xmodifier, 50 + xmodifier};
            int[] yPoints = {100 + ymodifier, 200 + ymodifier, 200 + ymodifier};
            int nPoints = 3;
            g.fillPolygon(xPoints, yPoints, nPoints);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Equilateral triangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(new Main());
        frame.setVisible(true);
    }
}
