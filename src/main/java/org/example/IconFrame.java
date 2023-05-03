package org.example;

import javax.swing.*;

public class IconFrame extends JFrame {
    JButton load, save, subscribe, unsubscribe;

    public IconFrame() {
        super("Icon Frame");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create panel
        JPanel panel = new JPanel();
        // create Icons
        ImageIcon loadIcon = new ImageIcon("src/main/resources/load.gif");
        ImageIcon saveIcon = new ImageIcon("src/main/resources/save.gif");
        ImageIcon subscribeIcon = new ImageIcon("src/main/resources/subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("src/main/resources/unsubscribe.gif");
        // create buttons
        load = new JButton("Load", loadIcon);
        save = new JButton("Save", saveIcon);
        subscribe = new JButton("Subscribe", subscribeIcon);
        unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
        // add buttons to panel
        panel.add(load);
        panel.add(save);
        panel.add(subscribe);
        panel.add(unsubscribe);
        // add the panel to a frame
        add(panel);
        //pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        IconFrame ike = new IconFrame();
    }
}
