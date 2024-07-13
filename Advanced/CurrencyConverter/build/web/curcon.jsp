<html>
    <body>
        <%@page import = "ejb.currency"%>
        <%
            int r = Integer.parseInt(request.getParameter("rs"));
            out.println("Amount in Rupees = "+r);
            currency c = new currency(); 
            int d = c.dollar(r);
            out.println("<br>");
            out.println("Amount in Dollars = "+d);
        %>
    </body>
</html>
