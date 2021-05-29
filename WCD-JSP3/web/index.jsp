<%@ page import="com.exemple.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/2/2021
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<c:if test="${sessionScope.username==null}">--%>
<%--  <jsp:forward page="login.jsp"></jsp:forward>--%>
<%--</c:if>--%>
<html>
<head>
    <title>Include page in jsp</title>
</head>
<body>
<!-- Call Bean (aka model )-->
<jsp:useBean id="userbean" class="com.exemple.bean.User" scope="session"/>
<h2>Hello : </h2>
<jsp:getProperty name="userbean" property="name"/>
<jsp:setProperty name="userbean" property="name" value="Mr Van"/>

<h2>Hello after set name</h2>
<jsp:getProperty name="userbean" property="name"/>
<jsp:include page="printdate.jsp"/>
<%
    User userBean1 = new User();
    userBean1.getName();
    userBean1.setName("Mr Hoang");

%>
<%=userBean1.getName()%>
</body>
</html>
