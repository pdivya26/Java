package quizapplication;

import java.io.*;
import java.sql.*;

public class Database
{
    Database(String name, int score, int c)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Quiz","root","root");
            PreparedStatement ppst = con.prepareStatement("insert into UserData values(?, ?, ?)");
            ppst.setString(1, name);
            ppst.setInt(2, score);
            ppst.setInt(3, c);
            ppst.execute();
            /*Statement s = con.createStatement();
            s.execute("delete from UserData where CorrectAns = 0");
            System.out.println("Record Deleted");
            //System.out.println("Records Inserted Successfully");*/
            ppst.close();
            //s.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) 
    {
        new Database("User", 0, 0);
    }

}
