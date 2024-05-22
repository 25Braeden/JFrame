package problem10;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class ForestAndTrees extends Canvas {
    public void paint(Graphics g) {
        // Draws a few single trees for testing
        drawTree(g, 30, 550);
        drawTree(g, 100, 580);
        drawTree(g, 640, 300);
        drawTree(g, 730, 370);

        // Draws the first forest
        g.drawRect(10, 10, 500, 500);
        drawForest(g, 10, 10, 500, 500);

        // Draws the second forest
        g.drawRect(550, 20, 400, 250);
        drawForest(g, 550, 20, 400, 250);

        // Draws the third forest
        g.drawRect(200, 530, 710, 160);
        drawForest(g, 200, 530, 710, 160);
    }

    public void drawTree(Graphics g, int x, int y) {
        g.setColor(new Color(134, 83, 0)); // Defines a brownish color

        // Draw the trunk
        g.fillRect(x + 20, y + 50, 10, 50); // Adjust trunk size and position

        // Draw the branches as a triangle
        g.setColor(Color.green);
        Polygon p = new Polygon();
        p.addPoint(x + 25, y);
        p.addPoint(x, y + 60);
        p.addPoint(x + 50, y + 60);
        g.fillPolygon(p);
    }

    public void drawForest(Graphics g, int x, int y, int w, int h) {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int a = rand.nextInt(w - 50); // Random value from [0, w-50]
            int b = rand.nextInt(h - 100); // Random value from [0, h-100]
            drawTree(g, x + a, y + b);
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("ForestAndTrees");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new ForestAndTrees());
        win.setVisible(true);
    }
}
