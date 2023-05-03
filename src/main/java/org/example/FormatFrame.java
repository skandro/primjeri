package org.example;

import javax.swing.*;

public class FormatFrame extends JFrame {
    JRadioButton[] teams = new JRadioButton[4];

    public FormatFrame() {
        super("Choose an Output Format");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teams[0] = new JRadioButton("Option 1");
        teams[1] = new JRadioButton("Option 2");
        teams[2] = new JRadioButton("Option 3");
        teams[3] = new JRadioButton("Option 4");
        // create panel
        JPanel panel = new JPanel();
        JLabel chooseLabel = new JLabel("Choose an output format: ");
        // dodavanje u panel
        panel.add(chooseLabel);
        ButtonGroup group = new ButtonGroup();
        for (JRadioButton team : teams) {
            group.add(team);
            panel.add(team);
        }
        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args) {
        FormatFrame.setLookAndFeel();
        FormatFrame ff = new FormatFrame();
    }
}
