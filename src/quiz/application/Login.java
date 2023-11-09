package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton instructions, back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(150, 150, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(1000, 60, 300, 45);
        heading.setFont(new Font("Lucida Calligraphy",Font.BOLD, 30));
        heading.setForeground(new Color(30, 144, 245));
        add(heading);
                
        JLabel name = new JLabel("Enter your name");
        name.setBounds(985, 300, 300, 20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(900, 350, 300, 25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD, 20));
        add(tfname);     
        
        instructions = new JButton("Instructions");
        instructions.setBounds(900, 450, 120, 25);
        instructions.setBackground(new Color(30, 144, 254));
        instructions.setForeground(Color.WHITE);
        instructions.addActionListener(this);
        add(instructions);
        
        back = new JButton("Back");
        back.setBounds(1075, 450, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1900, 900);
        setLocation(0, 0);
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == instructions) {
            String name = tfname.getText();
           setVisible(false);
           new Instructions(name);
    } else if (ae.getSource() == back) {
             setVisible(false); 
            }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
}
