package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FormatChooser extends JFrame implements ItemListener {
    String[] formats = {"Format 1", "Format 2", "Format 3", "Format 4", "Format 5"};
    String[] descriptions = {"Description 1", "Description 2", "Description 3", "Description 4", "Description 5"};

    JComboBox formatBox = new JComboBox<>();
    JLabel descriptionLabel = new JLabel(" ");

    public FormatChooser() {
        super("Syndication Format");
        setSize(420, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        for (String format : formats) {
            formatBox.addItem(format);
        }
        formatBox.addItemListener(this);
        add(BorderLayout.NORTH, formatBox);
        add(BorderLayout.CENTER, descriptionLabel);
        setVisible(true);
        setLocationRelativeTo(null);
    }


    @Override
    public void itemStateChanged(ItemEvent event) {
        int choice = formatBox.getSelectedIndex();
        if (choice > 0) {
            descriptionLabel.setText(descriptions[choice - 1]);
        }
    }

    @Override
    public Insets getInsets() {
        return new Insets(50, 30, 30, 30);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.err.println(exc);
        }
    }

    public static void main(String[] args) {
        FormatChooser.setLookAndFeel();
        FormatChooser frame = new FormatChooser();
    }
}
