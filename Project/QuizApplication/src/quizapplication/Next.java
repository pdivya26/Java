package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Next extends JFrame implements ActionListener 
{
    String name;
    JButton st, bk;
    
    Next(String name)
    {
        this.name = name;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel hd = new JLabel("Welcome "+name+" to Quiz Mania");
        hd.setBounds(100, 310, 1000, 100);
        hd.setFont(new Font("Edwardian Script ITC", Font.BOLD, 70));
        hd.setForeground(new Color(255, 255, 255));
        add(hd);
        
        JLabel rs = new JLabel();
        rs.setBounds(150, 300, 1000, 500);
        rs.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        rs.setForeground(new Color(255, 255, 255));
        rs.setText(
                "<html>"+
                "1. Each question has only one correct answer."+"<br><br>"+
                "2. Do not use external resources or assistance."+"<br><br>"+
                "3. You have one attempt per question."+"<br><br>"+
                "4. Participant will earn 10 points for each correct answer."+"<br><br>"+
                "5. Have fun and enjoy the quiz experience, Good Luck!"+"<br><br>"+
                "<html"
        );      
        add(rs);
        
        bk = new JButton("Back");
        bk.setBounds(150, 700, 100, 40);
        bk.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        bk.addActionListener(this);
        add(bk);
        
        st = new JButton("Start");
        st.setBounds(590, 700, 110, 40);
        st.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        st.addActionListener(this);
        add(st);
        
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
        if(ae.getSource() == st)
        {
            setVisible(false);
            new Quiz(name);
        }
        else
        {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args)
    {
        new Next("User");
    }
}
