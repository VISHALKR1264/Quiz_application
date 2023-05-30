import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");

        heading.setBounds(50, 20, 700, 30);

        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));

        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel("Welcome " + name + " to Simple Minds");
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahola", Font.PLAIN, 16));
        rules.setText("<html>" +
                "1.  Only Single participation is allowed" + "<br><br>" +
                "2.  The medium of the questions will be Multiple Choice" + "<br><br>" +
                "3.  All the questions are compulsory" + "<br><br>" +
                "4.  There will be no screening round. " + "<br><br>" +
                "5.  All the participants can play all the rounds" + "<br><br>" +
                "6. On the average score derives from all the rounds, winners will be declared" + "<br><br>" +
                "7. There will be certain time span for each round." + "<br><br>" +
                "8.  Good Luck" + "<br><br>" +
                "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new rules("User");
    }
}
