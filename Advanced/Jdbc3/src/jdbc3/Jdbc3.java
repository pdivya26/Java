package jdbc3;

import java.sql.*;

public class Jdbc3 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Office","root","root");
            PreparedStatement ps = c.prepareStatement("insert into Employee2 values(?, ?)");
            ps.setInt(1, 10);
            ps.setString(2, "AAA");
            ps.execute();
            ps.setInt(1, 20);
            ps.setString(2, "BBB");
            ps.execute();
            System.out.println("Records Inserted");
            ps.close();
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
