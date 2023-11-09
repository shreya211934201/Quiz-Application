package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Instructions extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Instructions(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome "+name+" to Simple Minds");
        heading.setBounds(650, 60, 300, 45);
        heading.setFont(new Font("Lucida Calligraphy",Font.PLAIN, 20));
        heading.setForeground(new Color(30, 144, 245));
        add(heading);
        
        JLabel instructions = new JLabel();
        instructions.setBounds(250, 150, 700, 350);
        instructions.setFont(new Font("Times New Romans",Font.PLAIN, 20));
        instructions.setText(
                "<html>"+
                        "1.Each question will carry 10 mark."+"<br><br>"+
                        "2.Each question will have time limit of 15 seconds. If not answered within time, marks won't get added. "+"<br><br>"+
                        "3.Lifeline (50/50) can be only used once."+"<br><br>"
        );
        add(instructions);
        
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
        
        
        setSize(1900, 900);
        setLocation(0, 0);
        setVisible(true);
    }
         public void actionPerformed(ActionEvent ae){
             if (ae.getSource()== start){
                 setVisible(false);
                 new Quiz(name);
             }else{
                 setVisible(false);
                 new Login();
             }
         }
         public static void main(String[] args){
         new Instructions("User");
    }

}
