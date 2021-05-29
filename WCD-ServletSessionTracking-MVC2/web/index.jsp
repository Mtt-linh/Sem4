<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/3/2021
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Login form </title>
  
  </head>
  <body>
  <form action="LoginController" method="post">
    Username<input type="text" name="username"/> <br/>
    password <input type="password" name="password"/><br/>
    <input type="submit">
  </form>
  </body>
</html>
