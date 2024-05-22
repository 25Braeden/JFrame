package problem8;

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

            int[] randomXPoints = {random.nextInt(800), random.nextInt(800), random.nextInt(800)};
            int[] randomYPoints = {random.nextInt(800), random.nextInt(800), random.nextInt(800)};
            int nPoints = 3;
            g.fillPolygon(randomXPoints, randomYPoints, nPoints);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Purple Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new Main());
        frame.setVisible(true);
    }
}
