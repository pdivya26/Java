package jdbc2;

import java.sql.*;

public class Jdbc2 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Office","root","root");
            Statement s = c.createStatement();
            s.execute("insert into employee values(4, 'GGG', 'HHH')");
            System.out.println("Records Inserted");
            s.execute("delete from employee where ID = 2");
            System.out.println("Record Deleted");
            s.executeUpdate("update employee set Name = 'SSS' where Address = 'FFF'");
            System.out.println("Record Updated");
            //s.execute("delete from employee where ID = 4");
            ResultSet rs = s.executeQuery("select * from employee");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            System.out.println("Record Displayed");
            rs.close();
            s.close();
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}
