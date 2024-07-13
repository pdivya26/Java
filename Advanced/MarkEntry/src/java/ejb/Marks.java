package ejb;

import java.sql.*;
import javax.ejb.Stateless;

@Stateless // Annotation
public class Marks 
{
    public void entry(String s1, int s2, int s3, int s4, int total, int avg)throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Exam","root","root");
        PreparedStatement ps = c.prepareStatement("insert into MarksEntry values(?, ?, ?, ?, ?, ?)");
        ps.setString(1, s1);
        ps.setInt(2, s2);
        ps.setInt(3, s3);
        ps.setInt(4, s4);
        ps.setInt(5, total);
        ps.setInt(6, avg);
        ps.execute();
        ps.close();
        c.close();
    }
}
