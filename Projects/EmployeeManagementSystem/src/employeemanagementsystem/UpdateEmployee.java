package employeemanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener
{
    
    JTextField fnm, lnm, eml, mob, bdt, adr, qual, sal, dsgn;
    JLabel empid, ed;
    JButton upd, back;
    String emID;
    UpdateEmployee(String emID)
    {
        this.emID = emID;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel hd = new JLabel("Update Employee");
        hd.setBounds(250, 20, 1000, 80);
        hd.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 60));
        hd.setForeground(Color.WHITE);
        add(hd);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("pictures/ems.png"));
        JLabel img = new JLabel(i);
        img.setBounds(0, 0, 1000, 800);
        add(img);
        
        //name
        JLabel n = new JLabel("First Name");
        n.setBounds(80, 150, 100, 25);
        n.setFont(new Font("Arial Black", Font.PLAIN, 15));
        n.setForeground(Color.WHITE);
        img.add(n);
                
        fnm = new JTextField();
        fnm.setBounds(200, 150, 250, 30);
        fnm.setFont(new Font("Arial Black", Font.PLAIN, 15));
        fnm.setEditable(false);
        img.add(fnm);
        
        //surname
        JLabel ln = new JLabel("Last Name");
        ln.setBounds(520, 150, 100, 25);
        ln.setFont(new Font("Arial Black", Font.PLAIN, 15));
        ln.setForeground(Color.WHITE);
        img.add(ln);
                
        lnm = new JTextField();
        lnm.setBounds(640, 150, 250, 30);
        lnm.setFont(new Font("Arial Black", Font.PLAIN, 15));
        img.add(lnm);
        
        //email
        JLabel e = new JLabel("Email");
        e.setBounds(80, 250, 100, 25);
        e.setFont(new Font("Arial Black", Font.PLAIN, 15));
        e.setForeground(Color.WHITE);
        img.add(e);
                
        eml = new JTextField();
        eml.setBounds(200, 250, 250, 30);
        eml.setFont(new Font("Arial Black", Font.PLAIN, 15));
        img.add(eml);
        
        //mobile no.
        JLabel m = new JLabel("Mobile No.");
        m.setBounds(520, 250, 100, 25);
        m.setFont(new Font("Arial Black", Font.PLAIN, 15));
        m.setForeground(Color.WHITE);
        img.add(m);
                
        mob = new JTextField();
        mob.setBounds(640, 250, 250, 30);
        mob.setFont(new Font("Arial Black", Font.PLAIN, 15));
        img.add(mob);
        
        //dob
        JLabel bd = new JLabel("Birth Date");
        bd.setBounds(80, 350, 100, 30);
        bd.setFont(new Font("Arial Black", Font.PLAIN, 15));
        bd.setForeground(Color.WHITE);
        img.add(bd);
        
        bdt = new JTextField();
        bdt.setBounds(200, 350, 250, 30);
        bdt.setFont(new Font("Arial Black", Font.PLAIN, 15));
        bdt.setEditable(false);
        img.add(bdt);
        
        //address 
        JLabel a = new JLabel("Address");
        a.setBounds(520, 350, 100, 25);
        a.setFont(new Font("Arial Black", Font.PLAIN, 15));
        a.setForeground(Color.WHITE);
        img.add(a);
                
        adr = new JTextField();
        adr.setBounds(640, 350, 250, 30);
        adr.setFont(new Font("Arial Black", Font.PLAIN, 15));
        img.add(adr);
        
        //designation
        JLabel d = new JLabel("Designation");
        d.setBounds(80, 450, 100, 25);
        d.setFont(new Font("Arial Black", Font.PLAIN, 15));
        d.setForeground(Color.WHITE);
        img.add(d);
                
        dsgn = new JTextField();
        dsgn.setBounds(200, 450, 250, 30);
        dsgn.setFont(new Font("Arial Black", Font.PLAIN, 15));
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
        img.add(sal);
        
        //qualification
        JLabel q = new JLabel("Qualification");
        q.setBounds(80, 550, 150, 30);
        q.setFont(new Font("Arial Black", Font.PLAIN, 15));
        q.setForeground(Color.WHITE);
        img.add(q);
        
        qual = new JTextField();
        qual.setBackground(Color.WHITE);
        qual.setFont(new Font("Arial Black", Font.PLAIN, 15));
        qual.setBounds(200, 550, 250, 30);
        img.add(qual);
        
        //employee ID 
        JLabel id = new JLabel("Employee ID");
        id.setBounds(520, 550, 120, 25);
        id.setFont(new Font("Arial Black", Font.PLAIN, 15));
        id.setForeground(Color.WHITE);
        img.add(id);
        
        ed = new JLabel();
        ed.setBounds(640, 547, 150, 30);
        ed.setFont(new Font("Arial Black", Font.BOLD, 20));
        ed.setForeground(Color.WHITE);
        img.add(ed);
                
        try
        {
            Connect c = new Connect();
            String query = "select * from EmpData where EmpId = '"+emID+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next())
            {
                fnm.setText(rs.getString("FName"));
                lnm.setText(rs.getString("LName"));
                bdt.setText(rs.getString("DOB"));
                adr.setText(rs.getString("Address"));
                sal.setText(rs.getString("Salary"));
                mob.setText(rs.getString("Mobile"));
                eml.setText(rs.getString("Email"));
                qual.setText(rs.getString("Qualification"));
                ed.setText(rs.getString("EmpId"));
                dsgn.setText(rs.getString("Designation"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        //add button
        upd = new JButton("Update");
        upd.setBounds(300, 650, 100, 40);
        upd.addActionListener(this);
        upd.setFocusable(false);
        img.add(upd);
        
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
        if(ae.getSource() == upd)
        {
            String lname = lnm.getText();
            String em = eml.getText();
            String mno = mob.getText();
            String adrs = adr.getText();
            String dn = dsgn.getText();
            String slry = sal.getText();
            String ql = qual.getText();
            
            try 
            {
                Connect c = new Connect();
                String query = "update EmpData set LName = '"+lname+"',Email = '"+em+"', Mobile = '"+mno+"', Address = '"+adrs+"', Designation = '"+dn+"', Salary = '"+slry+"', Qualification = '"+ql+"' where EmpId = '"+emID+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Updated successfully");
                setVisible(false);
                new HomePage();
            }
            catch(Exception e) 
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
        new UpdateEmployee("");
    }
}
