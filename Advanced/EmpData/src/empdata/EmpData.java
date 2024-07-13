package empdata;

import java.sql.*;

public class EmpData 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Office","root","root");
            Statement s = c.createStatement();
            s.execute("insert into empdata values(22101001, 'AAA', '2004-10-26', 2)");
            s.execute("insert into empdata values(22101002, 'BBB', '2004-03-05', 4)");
            s.execute("insert into empdata values(22101003, 'CCC', '2005-12-21', 1)");
            s.execute("insert into empdata values(22101004, 'DDD', '2003-08-08', 5)");
            s.execute("insert into empdata values(22101005, 'EEE', '2004-11-09', 3)");
            
            System.out.println("Data Inserted");
            
            ResultSet rs = s.executeQuery("select * from empdata");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3)+" "+rs.getInt(4));
            }
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
