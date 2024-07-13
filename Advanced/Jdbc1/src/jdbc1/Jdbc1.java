package jdbc1;

import java.sql.*;

public class Jdbc1 
{
    public static void main(String[] args) 
    { 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Class","root","root");
            Statement s = c.createStatement();
            s.execute("insert into student values(1, 'AAA', 1234, 65)");
            s.execute("insert into student values(2, 'BBB', 2345, 72)");
            s.execute("insert into student values(3, 'CCC', 3456, 78)");
            s.execute("insert into student values(4, 'DDD', 4567, 83)");
            s.execute("insert into student values(5, 'EEE', 8912, 90)");
            //s.execute("delete from student where rollno = 5");
            System.out.println("Records Inserted ");
            s.close();
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    } 
}

