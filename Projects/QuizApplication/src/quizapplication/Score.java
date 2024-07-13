package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener
{
    JButton pa, ex;
    String name;
    Score(String name, int score)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel hd = new JLabel("Thank You! Your Score is");
        hd.setBounds(160, 300, 1000, 125);
        hd.setFont(new Font("Edwardian Script ITC", Font.BOLD, 70));
        hd.setForeground(new Color(255, 255, 255));
        add(hd);
        
        JLabel sc = new JLabel(""+score+"");
        sc.setBounds(400, 450, 500, 125);
        sc.setFont(new Font("Cooper Black", Font.BOLD, 100));
        sc.setForeground(new Color(255, 255, 255));
        add(sc);
        
        pa = new JButton("Play Again");
        pa.setBounds(160, 700, 250, 40);
        pa.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        pa.addActionListener(this);
        add(pa);
        
        ex = new JButton("Exit");
        ex.setBounds(590, 700, 250, 40);
        ex.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        ex.addActionListener(this);
        add(ex);
        
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
        if(ae.getSource() == pa)
        {
            setVisible(false);
            new Login();
        }
        else if(ae.getSource() == ex)
        {
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Score("User", 0);
    }
}
