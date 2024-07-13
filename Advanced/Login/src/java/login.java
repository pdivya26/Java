import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String s = req.getParameter("p");
        if(s.equals("servlet"))
        {
            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req, res);
        }
        else
        {
            pw.println("Sorry Username or Password Error!");
        }
        pw.close();
    }
}