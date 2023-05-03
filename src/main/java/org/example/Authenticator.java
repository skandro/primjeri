package org.example;

import javax.swing.*;

public class Authenticator extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Authenticator() {
        super("Authenticator");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create panel
        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments: ");
        // definiše se hoće li tekst preći u sljedeći red kad dođe do ivice
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        // dodavanje u panel
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(commentsLabel);
        panel.add(comments);
        panel.add(ok);
        panel.add(cancel);
        // dodavanje u frame
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
        Authenticator.setLookAndFeel();
        Authenticator aut = new Authenticator();
    }
}
