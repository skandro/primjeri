package org.example;

import javax.swing.*;

public class SimpleFrame extends JFrame {
    public SimpleFrame() {
        super("Frame Tittle");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            // ignore error
        }
    }

    public static void main(String[] args) {
        setLookAndFeel();
        SimpleFrame sf = new SimpleFrame();
    }
}
