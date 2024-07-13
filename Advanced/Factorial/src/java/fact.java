import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class fact extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        int n = Integer.parseInt(req.getParameter("nm"));
        int i, f=1;
        for(i = 1; i <= n; i++)
        {
            f = f*i;
        }
        pw.println("Factorial = " +f);
        pw.close();
    }
}
