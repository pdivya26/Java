<html>
    <body>
        <%@page import ="ejb.marks"%>
        <%
            String s1 = request.getParameter("rn");
            int s2 = Integer.parseInt(request.getParameter("sub1"));
            int s3 = Integer.parseInt(request.getParameter("sub2"));
            int s4 = Integer.parseInt(request.getParameter("sub3"));
            
            int total = s2 + s3 + s4;
            int avg = (total)/3;
            
            marks m = new marks();
            m.entry(s1, s2, s3, s4, total, avg);
            out.println("Records Inserted Successfully");
        %>
    </body>
</html>
