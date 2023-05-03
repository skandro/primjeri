package org.example;

import javax.swing.*;

public class Subscriptions extends JFrame {
    String[] subs = {"Option 1 for choose", "Option 2 for choose", "Option 3 for choose",
            "Option 4 for choose", "Option 5 for choose", "Option 6 for choose", "Option 7 for choose"};
    JList<String> subList = new JList<>(subs);

    public Subscriptions() {
        super("Subscription");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create panel
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("Choose an one options: ");
        // add to panel
        panel.add(subLabel);
        subList.setVisibleRowCount(5);
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);
        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args) {
        Subscriptions.setLookAndFeel();
        Subscriptions app = new Subscriptions();
    }
}
