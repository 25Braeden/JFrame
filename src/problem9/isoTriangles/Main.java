package problem9.isoTriangles;

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

            int x1 = random.nextInt(700);
            int y1 = random.nextInt(700);

            int sideLength = random.nextInt(100) + 10;
            int baseLength = random.nextInt(100) + 10; // base (10 to 110 pixels)

            // The vertices of the isosceles triangle
            int[] xPoints = {x1, x1 + baseLength / 2, x1 - baseLength / 2};
            int[] yPoints = {y1, y1 - sideLength, y1 - sideLength};

            int nPoints = 3;
            g.fillPolygon(xPoints, yPoints, nPoints);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Isosceles Triangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800); // Increased the size to see more triangles
        frame.add(new Main());
        frame.setVisible(true);
    }
}

