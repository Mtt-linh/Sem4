<%@ page import="com.exemple.model.LoginDA" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/10/2021
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login </title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    LoginDA loginDA = new LoginDA();
    loginDA.setUsername(username);
    loginDA.setPassword(password);
    try {
        loginDA.createConnection();
        //UserStatement
        boolean status = loginDA.checkLoginStatement(username,password);
        //user pararedStatment
        //  boolean status = LoginDA.checkLoginPreparedStatement(username,password);
        //HttpSession session =request.getSession();
        if (status){
            session.setAttribute("bean",loginDA);
            response.sendRedirect("admin.jsp");

        }else {
            response.sendRedirect("index.jsp");
        }

    }catch (SQLException |ClassNotFoundException e){
        e.printStackTrace();
    }
%>
</body>
</html>
