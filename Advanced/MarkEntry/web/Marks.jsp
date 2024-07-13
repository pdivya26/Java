<html>
    <body>
        <%@page import ="ejb.Marks"%>
        <%
            String s1 = request.getParameter("rn");
            int s2 = Integer.parseInt(request.getParameter("s1"));
            int s3 = Integer.parseInt(request.getParameter("s2"));
            int s4 = Integer.parseInt(request.getParameter("s3"));
            
            int total = s2 + s3 + s4;
            int avg = (total)/3;
            
            Marks m = new Marks();
            m.entry(s1, s2, s3, s4, total, avg);
            out.println("Records Inserted Successfully");
        %>
    </body>
</html>
