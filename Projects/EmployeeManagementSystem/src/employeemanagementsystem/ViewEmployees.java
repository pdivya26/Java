package employeemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewEmployees extends JFrame implements ActionListener
{
    JTable table;
    Choice empid;
    JButton search, print, update, back;
    ViewEmployees()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel hd = new JLabel("View Employees");
        hd.setBounds(310, 20, 1000, 80);
        hd.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 60));
        hd.setForeground(Color.WHITE);
        add(hd);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("pictures/ems.png"));
        JLabel img = new JLabel(i);
        img.setBounds(0, 0, 1000, 800);
        add(img);
        
        //search
        JLabel srch = new JLabel("Search by Employee ID");
        srch.setBounds(40, 150, 180, 25);
        srch.setFont(new Font("Tahoma", Font.BOLD, 15));
        srch.setForeground(Color.WHITE);
        img.add(srch);
        
        empid = new Choice();
        empid.setBounds(220, 153, 150, 30);
        empid.setForeground(Color.BLACK);
        empid.setFont(new Font("Tahoma", Font.PLAIN, 15));
        img.add(empid);
        
        try 
        {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from EmpData");
            while(rs.next())
            {
                empid.add(rs.getString("empId"));
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        table = new JTable();
        try
        {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from EmpData");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(40, 200, 900, 450);
        img.add(sp);
        
        search = new JButton("Search");
        search.setBounds(400, 150, 100, 30);
        search.addActionListener(this);
        search.setFocusable(false);
        search.setFont(new Font("Arial Black", Font.PLAIN, 13));
        img.add(search);
        
        print = new JButton("Print");
        print.setBounds(630, 150, 80, 30);
        print.addActionListener(this);
        print.setFocusable(false);
        print.setFont(new Font("Arial Black", Font.PLAIN, 13));
        img.add(print);
        
        update = new JButton("Update");
        update.setBounds(850, 150, 90, 30);
        update.addActionListener(this);
        update.setFocusable(false);
        update.setFont(new Font("Arial Black", Font.PLAIN, 13));
        img.add(update);
        
        back = new JButton("Back");
        back.setBounds(840, 680, 100, 40);
        back.addActionListener(this);
        back.setFont(new Font("Arial Black", Font.PLAIN, 15));
        back.setFocusable(false);
        img.add(back);
        
        setSize(1000, 800);
        setLocation(500, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == search) 
        {
            String query = "select * from EmpData where empId = '"+empid.getSelectedItem()+"'";
            try 
            {
                Connect c = new Connect();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == print) 
        {
            try 
            {
                table.print();
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == update)
        {
            setVisible(false);
            new UpdateEmployee(empid.getSelectedItem());
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
            new HomePage();
        }
    }
    public static void main(String args[])
    {
        new ViewEmployees();
    }
}
