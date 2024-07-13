package employeemanagementsystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Start extends JFrame implements ActionListener 
{
    Start()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel hd = new JLabel("Employee Management System");
        hd.setBounds(75, 20, 1000, 80);
        hd.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 60));
        hd.setForeground(Color.WHITE);
        add(hd);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("pictures/ems.png"));
        JLabel img = new JLabel(i);
        img.setBounds(0, 0, 1000, 800);
        add(img);
        
        JButton lg = new JButton("Admin Login");
        lg.setBounds(350, 350, 300, 70);
        lg.setFont(new Font("Arial Black", Font.BOLD, 20));
        lg.setBackground(new Color(255, 255, 255)); // Brown - 45, 0, 0
        //lg.setForeground(Color.WHITE);
        lg.setFocusable(false);
        lg.addActionListener(this);
        img.add(lg);
        
        
        
        setSize(1000, 800);
        setLocation(500, 100);
        setVisible(true);
        
        while(true)
        {
            hd.setVisible(false);
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e)
            { 
            }
            hd.setVisible(true);
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e)
            { 
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String args[])
    {
        new Start();
    }
}
