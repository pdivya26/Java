<html>
    <body>
        <%@page import="java.sql.*" %>
        <%
            String s1 = request.getParameter("u");
            String s2 = request.getParameter("p");
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/JSP", "root","root");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select Username, Password from JSP where Username='"+s1+"' and Password='"+s2+"'");
            if(rs.next())
            {
                out.println("Valid User!");
            }
            else
            {
                out.println("Invalid User!");
            }
        %>
    </body>
</html>
