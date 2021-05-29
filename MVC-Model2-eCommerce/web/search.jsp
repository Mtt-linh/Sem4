<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/12/2021
  Time: 9:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search product</title>
</head>
<body>
<form action="result.jsp" method="get">
    <span style="color: red">
        <c:out value="${param.msg}"/>
    </span>
    <input type="text" name="name "/>
    <input type="submit"/>
</form>


</body>
</html>
