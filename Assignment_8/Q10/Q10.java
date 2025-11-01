package Assignment_8.Q10;

import javax.swing.*;
import java.awt.*;

public class Q10 extends JPanel implements Runnable {
    Color[] colors = {Color.RED, Color.YELLOW, Color.GREEN};
    int current = 0;
    int radius;
    Thread t;

    Q10(int radius) {
        this.radius = radius;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(1000); // 1 second delay
                current = (current + 1) % colors.length;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(colors[current]);
        g.fillOval(getWidth() / 2 - radius, getHeight() / 2 - radius, radius * 2, radius * 2);
    }

    public static void main(String[] args) {
        int radius = 80; // default
        try {
            String input = JOptionPane.showInputDialog("Enter radius of the circle:");
            if (input != null && !input.isEmpty()) {
                radius = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, using default radius 80.");
        }

        JFrame frame = new JFrame("Traffic Signal - Color Changing Circle");
       Q10 panel = new Q10(radius);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

    