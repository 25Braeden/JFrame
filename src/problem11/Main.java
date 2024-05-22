package problem11;

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;

public class Main extends Canvas {
    private BufferedImage clockImage;

    public Main() {
        try {
            clockImage = ImageIO.read(new File("src/problem11/meme-example.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        if (clockImage != null) {
            g.drawImage(clockImage, 200, 200, this);
        } else {
            g.drawString("Image not found", 200, 200);
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(1000, 1000);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main canvas = new Main();
        win.add(canvas);
        win.setVisible(true);
    }
}
