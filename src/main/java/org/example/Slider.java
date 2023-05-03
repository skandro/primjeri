package org.example;

import javax.swing.*;

public class Slider extends JFrame {
    public Slider() {
        super("Slider");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JSlider pick = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        pick.setMajorTickSpacing(10);
        pick.setMinorTickSpacing(5);
        pick.setPaintTicks(true);
        pick.setPaintLabels(true);
        add(pick);
        //pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + exc);
        }
    }

    public static void main(String[] args) {
        Slider frame = new Slider();
    }
}
