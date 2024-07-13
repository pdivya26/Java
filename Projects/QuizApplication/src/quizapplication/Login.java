package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    JButton nx, bk;
    JTextField nm;
    Login()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel hd = new JLabel("Welcome to Quiz Mania");
        hd.setBounds(180, 300, 1000, 125);
        hd.setFont(new Font("Edwardian Script ITC", Font.BOLD, 70));
        hd.setForeground(new Color(255, 255, 255));
        add(hd);
        
        JLabel n = new JLabel("Enter your Name here : ");
        n.setBounds(60, 480, 1000, 60);
        n.setFont(new Font("Cooper Black", Font.BOLD, 25));
        n.setForeground(new Color(255, 255, 255));
        add(n);
        
        nm = new JTextField();
        nm.setBounds(390, 495, 500, 35);
        nm.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        add(nm);
        
        nx = new JButton("Next");
        nx.setBounds(390, 600, 100, 40);
        nx.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        nx.addActionListener(this);
        add(nx);
        
        bk = new JButton("Back");
        bk.setBounds(790, 600, 100, 40);
        bk.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        bk.addActionListener(this);
        add(bk);
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/QMBg.png"));
        JLabel i1 = new JLabel(img1);
        i1.setBounds(0, 0, 1000, 800);
        add(i1);
        
        setSize(1000, 800);
        setLocation(500, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == nx)
        {
            String name = nm.getText();
            setVisible(false);
            new Next(name);
        }
        else if(ae.getSource() == bk)
        {
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
}
