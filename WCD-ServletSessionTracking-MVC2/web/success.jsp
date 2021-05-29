<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/3/2021
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin zone</title>
    <c:if test="${sessionScope.bean==null}">
        <jsp:forward page="index.jsp"></jsp:forward>
    </c:if>
</head>
<body>
//step 4
<jsp:useBean id="bean" class="com.exemple.model.LoginBean" scope="session"/>
<h2>
    //step 5
   Welcome: <jsp:getProperty name="bean" property="username"/>
</h2>
<h2>
    welcome: ${bean.username}
</h2>

</body>
</html>
