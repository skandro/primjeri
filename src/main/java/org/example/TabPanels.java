package org.example;

import javax.swing.*;

public class TabPanels extends JFrame {

    public TabPanels() {
        super("Tabbed Panes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(500, 500);
        JPanel mainSettings = new JPanel();
        JPanel advancedSettings = new JPanel();
        JPanel privacySettings = new JPanel();
        JPanel emailSettings = new JPanel();
        JPanel securitySettings = new JPanel();
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Main", mainSettings);
        tabs.addTab("Advanced", advancedSettings);
        tabs.addTab("Privacy", privacySettings);
        tabs.addTab("E-mail", emailSettings);
        tabs.addTab("Security", securitySettings);
        add(tabs);
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
        TabPanels frame = new TabPanels();
    }
}
