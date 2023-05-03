package org.example;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    public Border() {
        super("Border");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setLayout(new BorderLayout());
        JButton nButton = new JButton("North");
        JButton sButton = new JButton("South");
        JButton eButton = new JButton("East");
        JButton wButton = new JButton("West");
        JButton center = new JButton("Center");
        add(nButton, BorderLayout.NORTH);
        add(sButton, BorderLayout.SOUTH);
        add(eButton, BorderLayout.EAST);
        add(wButton, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.err.println(exc);
        }
    }

    public static void main(String[] args) {
        Border.setLookAndFeel();
        Border frame = new Border();
    }
}
