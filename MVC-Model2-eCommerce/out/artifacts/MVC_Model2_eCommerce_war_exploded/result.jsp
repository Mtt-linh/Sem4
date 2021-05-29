<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.exemple.model.ProductFinderBean" %>
<%@ page import="java.util.List" %>
<%@ page import="com.exemple.entity.Product" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/12/2021
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List product</title>
</head>
<body>

<h2>List product</h2>
<%
    //step 1
    String keywordData = request.getParameter("name");
    if (keywordData == null|| keywordData.trim().isEmpty()){
        //url rewriting
        response.sendRedirect("search.jsp?msg=Enter your keyword");
        return;
    }
%>
<%
    //step 2
    //su dung java thuan tuy
    ProductFinderBean finderBean = new ProductFinderBean();
    finderBean.setKeyword(keywordData);
    List<Product> productList = finderBean.getAllProduct();

%>
<!--dung jsp:+tag -->
<jsp:useBean id="finder" class="com.exemple.model.ProductFinderBean"/>
<jsp:setProperty name="finder" property="keyword" value="<%=keywordData%>"/>
<table>
   <tr>
       <th>ID</th>
       <th>Name</th>
       <th>Description</th>
   </tr>
    <c:forEach var="product" items="${finder.allProduct}">
        <tr>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.desc}"/></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
