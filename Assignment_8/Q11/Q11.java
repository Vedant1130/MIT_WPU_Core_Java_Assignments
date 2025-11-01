package Assignment_8.Q11;

import javax.swing.*;
import java.awt.*;

public class Q11 extends JPanel implements Runnable {
    int x = 50, y = 50;       
    int dx = 3, dy = 3;       
    int radius = 30;          
    Thread t;

    Q11() {
        t = new Thread(this);
        t.start(); 
    }

    public void run() {
        try {
            while (true) {
                moveBall();
                repaint();
                Thread.sleep(10); 
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void moveBall() {
        x += dx;
        y += dy;

        // Bounce from edges
        if (x <= 0 || x + radius >= getWidth()) {
            dx = -dx;
        }
        if (y <= 0 || y + radius >= getHeight()) {
            dy = -dy;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setColor(Color.CYAN);
        g.fillOval(x, y, radius, radius);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multithreaded Bouncing Ball");
        Q11 panel = new Q11();

        frame.add(panel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}