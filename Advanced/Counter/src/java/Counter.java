import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Counter extends HttpServlet 
{
    int count = 1;
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        HttpSession hs = req.getSession(true);
        if(hs.isNew())
        {
            pw.println("Welcome, You visited for the first time!");
        }
        else
        {
            pw.println("You already visited "+count+" times..");
            pw.println("<br>");
            pw.println("Session ID :- "+ hs.getId());
        }
        count++;
        pw.close();
    }
}
