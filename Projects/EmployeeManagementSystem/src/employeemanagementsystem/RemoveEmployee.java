package employeemanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class RemoveEmployee extends JFrame implements ActionListener
{
    JTextField fnm, lnm, dsgn, sal;
    JButton rmv, back;
    Choice empid;
    RemoveEmployee()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel hd = new JLabel("Remove Employee");
        hd.setBounds(310, 20, 1000, 80);
        hd.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 60));
        hd.setForeground(Color.WHITE);
        add(hd);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("pictures/ems.png"));
        JLabel img = new JLabel(i);
        img.setBounds(0, 0, 1000, 800);
        add(img);
        
        JLabel id = new JLabel("Employee ID");
        id.setBounds(100, 200, 200, 30);
        id.setFont(new Font("Arial Black", Font.BOLD, 25));
        id.setForeground(Color.WHITE);
        img.add(id);
        
        empid = new Choice();
        empid.setBounds(320, 200, 400, 500);
        empid.setForeground(Color.BLACK);
        empid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        img.add(empid);
        
        try 
        {
            Connect c = new Connect();
            String query = "select * from EmpData";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) 
            {
                empid.add(rs.getString("EmpId"));
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        //name
        JLabel n = new JLabel("First Name");
        n.setBounds(80, 350, 100, 25);
        n.setFont(new Font("Arial Black", Font.PLAIN, 15));
        n.setForeground(Color.WHITE);
        img.add(n);
                
        fnm = new JTextField();
        fnm.setBounds(200, 350, 250, 30);
        fnm.setFont(new Font("Arial Black", Font.PLAIN, 15));
        fnm.setEditable(false);
        img.add(fnm);
        
        //surname
        JLabel ln = new JLabel("Last Name");
        ln.setBounds(520, 350, 100, 25);
        ln.setFont(new Font("Arial Black", Font.PLAIN, 15));
        ln.setForeground(Color.WHITE);
        img.add(ln);
                
        lnm = new JTextField();
        lnm.setBounds(640, 350, 250, 30);
        lnm.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lnm.setEditable(false);
        img.add(lnm);
        
        //designation
        JLabel d = new JLabel("Designation");
        d.setBounds(80, 450, 100, 25);
        d.setFont(new Font("Arial Black", Font.PLAIN, 15));
        d.setForeground(Color.WHITE);
        img.add(d);
                
        dsgn = new JTextField();
        dsgn.setBounds(200, 450, 250, 30);
        dsgn.setFont(new Font("Arial Black", Font.PLAIN, 15));
        dsgn.setEditable(false);
        img.add(dsgn);

        //salary
        JLabel s = new JLabel("Salary");
        s.setBounds(520, 450, 100, 30);
        s.setFont(new Font("Arial Black", Font.PLAIN, 15));
        s.setForeground(Color.WHITE);
        img.add(s);
                
        sal = new JTextField();
        sal.setBounds(640, 450, 250, 30);
        sal.setFont(new Font("Arial Black", Font.PLAIN, 15));
        sal.setEditable(false);
        img.add(sal);
        
        try
        {
            Connect c = new Connect();
            String query = "select * from EmpData where EmpId = '"+empid.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) 
            {
                fnm.setText(rs.getString("FName"));
                lnm.setText(rs.getString("LName"));
                dsgn.setText(rs.getString("Designation"));
                sal.setText(rs.getString("Salary"));
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        empid.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try 
                {
                    Connect c = new Connect();
                    String query = "select * from EmpData where EmpId = '"+empid.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()) 
                    {
                        fnm.setText(rs.getString("FName"));
                        lnm.setText(rs.getString("LName"));
                        dsgn.setText(rs.getString("Designation"));
                        sal.setText(rs.getString("Salary"));
                    }
                }
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        });
        
        //remove button
        rmv = new JButton("Remove");
        rmv.setBounds(300, 650, 150, 40);
        rmv.addActionListener(this);
        rmv.setFocusable(false);
        img.add(rmv);
        
        //back button
        back = new JButton("Back");
        back.setBounds(600, 650, 100, 40);
        back.addActionListener(this);
        back.setFocusable(false);
        img.add(back);
        
        setSize(1000, 800);
        setLocation(500, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
         if (ae.getSource() == rmv) 
         {
            try 
            {
                Connect c = new Connect();
                String query = "delete from EmpData where EmpId = '"+empid.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                fnm.setText("");
                lnm.setText("");
                dsgn.setText("");
                sal.setText("");
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Sucessfully");
                setVisible(false);
                new HomePage();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
         else if(ae.getSource() == back)
        {
            setVisible(false);
            new HomePage();
        }
    }
    public static void main(String args[])
    {
        new RemoveEmployee();
    }
}
