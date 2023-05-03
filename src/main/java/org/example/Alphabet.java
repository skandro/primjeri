package org.example;

import javax.swing.*;
import java.awt.*;

public class Alphabet extends JFrame {
    public Alphabet() {
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(500, 500);
        // FlowLayout fm = new FlowLayout(FlowLayout.LEFT);
        FlowLayout fm = new FlowLayout(FlowLayout.CENTER,30,10);
        setLayout(fm);
        JButton a = new JButton("Option 1");
        JButton b = new JButton("Option 2");
        JButton c = new JButton("Option 3");
        JButton d = new JButton("Option 4");
        JButton e = new JButton("Option 5");
        JButton f = new JButton("Option 6");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
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
        Alphabet.setLookAndFeel();
        Alphabet frame = new Alphabet();
    }
}
