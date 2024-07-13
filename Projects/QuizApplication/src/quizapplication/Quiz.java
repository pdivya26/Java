package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener 
{
    String que[][] = new String[10][5];
    String ans[][] = new String[10][2];
    String usans[][] = new String[10][1];
    JRadioButton opt1, opt2, opt3, opt4;
    JLabel qno, q ;
    JButton nx, sb, ll;
    ButtonGroup gopt;
    int c = 0;
    
    int timer = 15;
    public static int answered = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    public Quiz(String name)
    {
        this.name = name;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Questions and options
        qno = new JLabel();
        qno.setBounds(70, 400, 50, 30);
        qno.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        add(qno);
        
        q = new JLabel();
        q.setBounds(100, 400, 900, 30);
        q.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        add(q);
        
        que[0][0] = "What is the time complexity of binary search in a sorted array of size n?";
        que[0][1] = "O(n)";
        que[0][2] = "O(log n)";
        que[0][3] = "O(n log n)";
        que[0][4] = "O(1)";

        que[1][0] = "Which data structure uses Last In, First Out (LIFO) order?";
        que[1][1] = "Queue";
        que[1][2] = "Stack";
        que[1][3] = "Linked List";
        que[1][4] = "Trees";

        que[2][0] = "What is the best-case complexity of Merge Sort?";
        que[2][1] = "O(n)";
        que[2][2] = "O(log n)";
        que[2][3] = "O(n log n)";
        que[2][4] = "O(1)";

        que[3][0] = "What does DFS stand for in the context of graph traversal?";
        que[3][1] = "Directed First Search";
        que[3][2] = "Dijkstra's Fast Search";
        que[3][3] = "Depthful Search";
        que[3][4] = "Depth-First Search";

        que[4][0] = "In a doubly linked list, how many pointers does each node have?";
        que[4][1] = "0";
        que[4][2] = "1";
        que[4][3] = "2";
        que[4][4] = "3";

        que[5][0] = "What is the purpose of dynamic programming?";
        que[5][1] = "To minimize the use of dynamic memory";
        que[5][2] = "To divide a problem into subproblems and solve them";
        que[5][3] = "To handle exceptions in programming";
        que[5][4] = "To dynamically allocate memory during runtime";

        que[6][0] = "Which of the following is NOT a searching algorithm?";
        que[6][1] = "Linear Search";
        que[6][2] = "Binary Search";
        que[6][3] = "Merge Sort";
        que[6][4] = "Interpolation Search";

        que[7][0] = "What is the purpose of a priority queue?";
        que[7][1] = "To arrange elements in ascending order";
        que[7][2] = "To assign priority to different elements";
        que[7][3] = "To implement a stack";
        que[7][4] = "To perform a linear search";

        que[8][0] = "How many null pointers are there if BST contains n nodes?";
        que[8][1] = "n";
        que[8][2] = "n-1";
        que[8][3] = "n+1";
        que[8][4] = "n*n";

        que[9][0] = "What is the minimum number of stacks needed to implement a queue?";
        que[9][1] = "1";
        que[9][2] = "2";
        que[9][3] = "3";
        que[9][4] = "4";
        
        //Correct Answers
        ans[0][1] = "O(log n)";
        ans[1][1] = "Stack";
        ans[2][1] = "O(n log n)";
        ans[3][1] = "Depth-First Search";
        ans[4][1] = "2";
        ans[5][1] = "To divide a problem into subproblems and solve them";
        ans[6][1] = "Merge Sort";
        ans[7][1] = "To assign priority to different elements";
        ans[8][1] = "n+1";
        ans[9][1] = "2";
        
        //Radio Buttons for Answers
        opt1 = new JRadioButton();
        opt1.setBounds(170, 440, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 500, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 560, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 620, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        add(opt4);
        
        //Disable selections of multiple buttons
        gopt = new ButtonGroup();
        gopt.add(opt1);
        gopt.add(opt2);
        gopt.add(opt3);
        gopt.add(opt4);
        
        nx = new JButton("Next");
        nx.setBounds(150, 700, 100, 40);
        nx.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        nx.addActionListener(this);
        add(nx);
        
        sb = new JButton("Submit");
        sb.setBounds(590, 700, 150, 40);
        sb.setFont(new Font("Cooper Black",Font.PLAIN, 25));
        sb.addActionListener(this);
        sb.setEnabled(false);
        add(sb);
        
        start(count);
        
        setVisible (true);
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz Mania.png"));
        JLabel i1 = new JLabel(img1);
        i1.setBounds(0, 0, 1000, 300);
        add(i1);
        
        setSize(1000, 800);
        setLocation(500, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
         if (ae.getSource() == nx) 
         {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            answered = 1;
            if (gopt.getSelection() == null) 
            {
               usans[count][0] = "";
            } 
            else 
            {
                usans[count][0] = gopt.getSelection().getActionCommand();
            }
            
            if (count == 8) 
            {
                nx.setEnabled(false);
                sb.setEnabled(true);
            }
            count++;
            start(count);
        }
        else if (ae.getSource() == ll) 
        {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            ll.setEnabled(false);
        }
        else if (ae.getSource() == sb) 
        {
            answered = 1;
            if (gopt.getSelection() == null) 
            {
                usans[count][0] = "";
            }
            else 
            {
                usans[count][0] = gopt.getSelection().getActionCommand();
            }
            for (int i = 0; i < usans.length; i++) 
            {
                if (usans[i][0].equals(ans[i][1])) 
                {
                    score += 10;
                    c++;
                }
                else
                {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
            //new Database(name, score, c);
        }
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        String time = "Time Left = "+timer+" seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        
        if(timer > 0)
        {
            g.drawString(time, 600, 400);
        }
        else
        {
            g.drawString("Time Up!!", 600, 400);
        }
        timer--;
        try
        {
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        if(answered == 1)
        {
            answered = 0;
            timer = 15;
        }
        else if(timer < 0)
        {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8)
            {
                nx.setEnabled(false);
                sb.setEnabled(true);
            }
            //Auto Submit
            if (count == 9) 
            { 
                if (gopt.getSelection() == null) 
                {
                   usans[count][0] = "";
                }
                else
                {
                    usans[count][0] = gopt.getSelection().getActionCommand();
                }
                for (int i = 0; i < usans.length; i++) 
                {
                    if (usans[i][0].equals(ans[i][1])) 
                    {
                        score += 10;
                        c++;
                    }
                    else 
                    {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
                //new Database(name, score, c);
            }   
            
            if(gopt.getSelection() == null)
            {
                usans[count][0] = "";
            }
            else
            {
                usans[count][0] = "";
                gopt.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ".");
        q.setText(que[count][0]);
        
        opt1.setText(que[count][1]);
        opt1.setActionCommand(que[count][1]);
        
        opt2.setText(que[count][2]);
        opt2.setActionCommand(que[count][2]);
        
        opt3.setText(que[count][3]);
        opt3.setActionCommand(que[count][3]);
        
        opt4.setText(que[count][4]);
        opt4.setActionCommand(que[count][4]);
        
        gopt.clearSelection();
    }
    
    public static void main(String[] args)
    {
        new Quiz("User");
    }
}
