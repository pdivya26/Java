package employeemanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame implements ActionListener
{
    JButton add, rmv, upd, vw;
    HomePage()
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
        
        add = new JButton("Add Employee");
        add.setBounds(180, 250, 200, 70);
        add.setFont(new Font("Arial Black", Font.PLAIN, 15));
        add.setBackground(new Color(255, 255, 255));
        add.setFocusable(false);
        add.addActionListener(this);
        img.add(add);
        
        upd = new JButton("Update Employee");
        upd.setBounds(180, 450, 200, 70);
        upd.setFont(new Font("Arial Black", Font.PLAIN, 15));
        upd.setBackground(new Color(255, 255, 255));
        upd.setFocusable(false);
        upd.addActionListener(this);
        img.add(upd);
        
        rmv = new JButton("Remove Employee");
        rmv.setBounds(600, 250, 200, 70);
        rmv.setFont(new Font("Arial Black", Font.PLAIN, 15));
        rmv.setBackground(new Color(255, 255, 255));
        rmv.setFocusable(false);
        rmv.addActionListener(this);
        img.add(rmv);
        
        vw = new JButton("View Employees");
        vw.setBounds(600, 450, 200, 70);
        vw.setFont(new Font("Arial Black", Font.PLAIN, 15));
        vw.setBackground(new Color(255, 255, 255));
        vw.setFocusable(false);
        vw.addActionListener(this);
        img.add(vw);
        
        setSize(1000, 800);
        setLocation(500, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == add)
        {
            setVisible(false);
            new AddEmployee();
        }
        else if(ae.getSource() == rmv)
        {
            setVisible(false);
            new RemoveEmployee();
        }
        else if(ae.getSource() == upd)
        {
            setVisible(false);
            new ViewEmployees();
        }
        else if(ae.getSource() == vw)
        {
            setVisible(false);
            new ViewEmployees();
        }
    }    
    public static void main(String args[])
    {
        new HomePage();
    }
}
