package problem9.rightTriangles;

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
            // Generate a random color
            int randInt = random.nextInt(0xFFFFFF);
            String hexColor = String.format("#%06X", randInt);
            Color randColor = Color.decode(hexColor);
            g.setColor(randColor);

            // Randomly position the triangle within the panel
            int x1 = random.nextInt(700);
            int y1 = random.nextInt(700);

            // Generate random lengths for the triangle sides
            int leg1 = random.nextInt(100) + 10; // length of one leg (10 to 110 pixels)
            int leg2 = random.nextInt(100) + 10; // length of the other leg (10 to 110 pixels)

            // The vertices of the right triangle
            int[] xPoints = {x1, x1 + leg1, x1};
            int[] yPoints = {y1, y1, y1 + leg2};

            int nPoints = 3;
            g.fillPolygon(xPoints, yPoints, nPoints);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Right Triangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800); // Increased the size to see more triangles
        frame.add(new Main());
        frame.setVisible(true);
    }
}

