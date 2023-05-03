package org.example;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    String[] formats = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5", "option 6", "Option 7"};
    JComboBox<String> formatBOx = new JComboBox<>(formats);

    public Test(){
        super("Choose a format: ");
        setSize(220,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel formatLabel = new JLabel("Odaberi neku opciju: ");
        panel.add(formatLabel);
        panel.add(formatBOx);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Test frame = new Test();
    }
}
