import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, exit;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.white);

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Src\\quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(10, 30, 600, 500);
        add(image);


        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));

        heading.setForeground(new Color(30, 144, 254));
        add(heading);


        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);


        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);



        exit = new JButton("Exit");
        exit.setBounds(730, 270, 120, 25);
        exit.setBackground(new Color(30, 144, 254));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        rules = new JButton("Rules");
        rules.setBounds(915, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);


        setSize(1200, 600);
        setLocation(200, 120);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
        } else if (ae.getSource() == exit) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Login();
    }

}