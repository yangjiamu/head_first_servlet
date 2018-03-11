<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2018/3/11
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Selection Advice</title>
</head>
<body>
    <h1 align="center">Beer Recommendation JSP</h1>
    <p>
    <%
        List styles = (List) request.getAttribute("styles");
        PrintWriter writer = response.getWriter();
        Iterator it = styles.iterator();
        while (it.hasNext()){
            //out.print("");
            writer.print("<br>try: " + it.next());
        }
    %>
</body>
</html>
