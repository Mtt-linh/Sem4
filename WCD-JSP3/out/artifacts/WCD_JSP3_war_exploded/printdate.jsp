<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/2/2021
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date,java.text.*" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>Print our Date</title>
</head>
<body>
<%
    //scrpitlet
    Date nowDate = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:SSS");

%>
<h2>
    Current Date is:
</h2>
<%=dateFormat.format(nowDate)%>
</body>
</html>
