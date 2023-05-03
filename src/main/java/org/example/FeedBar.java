package org.example;

import javax.swing.*;
import java.awt.*;

public class FeedBar extends JFrame {
    public FeedBar() {
        super("Feed Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();

        // create icons
        ImageIcon loadIcon = new ImageIcon("src/main/resources/load.gif");
        ImageIcon saveIcon = new ImageIcon("src/main/resources/save.gif");
        ImageIcon subscribeIcon = new ImageIcon("src/main/resources/subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("src/main/resources/unsubscribe.gif");

        // create buttons
        JButton load = new JButton("Load", loadIcon);
        JButton save = new JButton("Save", saveIcon);
        JButton subscribe = new JButton("Subscribe", subscribeIcon);
        JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);

        //add buttons to toolbar
        JToolBar bar = new JToolBar();
        bar.add(load);
        bar.add(save);
        bar.add(subscribe);
        bar.add(unsubscribe);

        //prepare users interface
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("North", bar);
        add("Center", scroll);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                    + "look and Feel: " + exc);
        }
    }

    public static void main(String[] args) {
        FeedBar frame = new FeedBar();
    }
}
