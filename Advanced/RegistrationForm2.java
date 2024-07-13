import javax.swing.*;

class RegistrationForm2
{
    static JProgressBar b;
    public static void main(String args[])
    {
        JFrame f = new JFrame();
        f.setTitle("Registration Form");
        f.setSize(800,1000);
        f.setLayout(null);
        f.setVisible(true);

        JLabel n = new JLabel("Name");
        n.setBounds(50, 50, 150, 50);
        f.add(n);
        JTextField nm = new JTextField();
        nm.setBounds(125, 65, 300, 25);
        f.add(nm);

        JLabel e = new JLabel("Email");
        e.setBounds(50, 100, 150, 50);
        f.add(e);
        JTextField em = new JTextField(100);
        em.setBounds(125, 115, 300, 25);
        f.add(em);

        JLabel ct = new JLabel("Contact");
        ct.setBounds(50, 150, 150, 50);
        f.add(ct);
        JTextField cont = new JTextField(10);
        cont.setBounds(125, 165, 300, 25);
        f.add(cont);

        JLabel g = new JLabel("Gender");
        g.setBounds(50, 200, 150, 50);
        f.add(g);

            JRadioButton rgm = new JRadioButton();
            rgm.setBounds(125, 215, 25, 25);
            f.add(rgm);
            JLabel gm = new JLabel("Male");
            gm.setBounds(150, 215, 90, 25);
            f.add(gm);

            JRadioButton rgf = new JRadioButton();
            rgf.setBounds(300, 215, 25, 25);
            f.add(rgf);
            JLabel gf = new JLabel("Female");
            gf.setBounds(325, 215, 90, 25);
            f.add(gf);
        
        JLabel l = new JLabel("Course");
        l.setBounds(50, 250, 150, 50);
        f.add(l);

            JCheckBox cb = new JCheckBox();
            cb.setBounds(125, 265, 25, 25);
            f.add(cb);
            JLabel c = new JLabel("C");
            c.setBounds(150, 265, 100, 25);
            f.add(c);

            JCheckBox cpb = new JCheckBox();
            cpb.setBounds(225, 265, 25, 25);
            f.add(cpb);
            JLabel cpp = new JLabel("C++");
            cpp.setBounds(250, 265, 100, 25);
            f.add(cpp);

            JCheckBox jb = new JCheckBox();
            jb.setBounds(325, 265, 25, 25);
            f.add(jb);
            JLabel j = new JLabel("Java");
            j.setBounds(350, 265, 100, 25);
            f.add(j);

            JCheckBox pb = new JCheckBox();
            pb.setBounds(425, 265, 25, 25);
            f.add(pb);
            JLabel p = new JLabel("Python");
            p.setBounds(450, 265, 100, 25);
            f.add(p);

            JButton st = new JButton("Submit");
            st.setBounds(200, 400, 100, 35);
            f.add(st);

           


            b = new JProgressBar();
            b.setValue(0);
            b.setStringPainted(true);
            b.setBounds(50, 0, 500, 30);
            f.add(b);
		    f.setVisible(true);
        
		try 
        {
            int i = 0, k;
            int ch[]=new int[9];
            for(k=0; k<5; k++)
            {
                ch[k]=0;
            }
			while (i <= 101) 
            {
                String s1 = nm.getText();
                String s2 = em.getText();
                String s3 = cont.getText();
				// fill the menu bar
                if(s1.isEmpty() != true && ch[0] == 0)
                {
                    i += 20;
                    b.setValue(i);
                    ch[0] = 1;
                }
                if(s1.isEmpty() && ch[0] == 1)
                {
                    i -= 20;
                    b.setValue(i);
                    ch[0] = 0;
                }
                if(s2.isEmpty() != true && ch[1] == 0)
                {
                    i += 20;
                    b.setValue(i);
                    ch[1] = 1;
                }	
                if(s2.isEmpty() && ch[1] == 1)
                {
                    i -= 20;
                    b.setValue(i);
                    ch[1] = 0;
                }
                if(s3.isEmpty() != true && ch[2] == 0)
                {
                    i += 20;
                    b.setValue(i);
                    ch[2] = 1;
                }	
                else if(s3.isEmpty() && ch[2] == 1)
                {
                    i -= 20;
                    b.setValue(i);
                    ch[2] = 0;
                }
                if((rgm.isSelected() || rgf.isSelected()) && (ch[3] == 0))
                {
                    i += 20;
                    b.setValue(i);
                    ch[3] = 1;
                }
                if((rgm.isSelected() || rgf.isSelected()) == false && (ch[3] == 1))
                {
                    i -= 20;
                    b.setValue(i);
                    ch[3] = 0;
                }
                if((cb.isSelected() || cpb.isSelected() || jb.isSelected() || pb.isSelected()) && (ch[4] == 0))
                {
                    i += 20;
                    b.setValue(i);
                    ch[4] = 1;
                }
                if((cb.isSelected() || cpb.isSelected() || jb.isSelected() || pb.isSelected()) == false && ch[4] == 1)
                {
                    i -= 20;
                    b.setValue(i);
                    ch[4] = 0;
                }
				Thread.sleep(100);
			}
		}
		catch (Exception err) 
        {
            System.out.println(err);
		}
    }
}
