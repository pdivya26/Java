package employeemanagementsystem;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    JTextField un, pw;
    Login()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel hd = new JLabel("Admin Login");
        hd.setBounds(175, 0, 200, 80);
        hd.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(hd);
        
        JLabel usrn = new JLabel("Username");
        usrn.setBounds(40, 75, 60, 25);
        add(usrn);
                
        un = new JTextField();
        un.setBounds(150, 75, 250, 25);
        add(un);
        
        JLabel pswd = new JLabel("Password");
        pswd.setBounds(40, 115, 100, 30);
        add(pswd);
        
        pw = new JPasswordField();
        pw.setBounds(150, 115, 250, 25);
        add(pw);
        
        JButton lg = new JButton("Login");
        lg.setBounds(215, 175, 110, 25);
        lg.setFocusable(false);
        lg.addActionListener(this);
        add(lg);
                
        setSize(500, 300);
        setLocation(700, 350);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String username = un.getText();
            String password = pw.getText();
            
            Connect c = new Connect();
            String query = "select * from AdminDetail where Username = '"+username+"' and Password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next())
            {
                setVisible(false);
                new HomePage();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        new Login();
    }
}
