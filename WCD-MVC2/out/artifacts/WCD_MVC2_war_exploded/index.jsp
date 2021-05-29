<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/28/2021
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<head>
    <title>JST jstl application</title>
</head>
<body>
<sql:setDataSource var="myDataSoure"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://127.0.0.1:3306/t1907m_sem4"
                   user="root"
                   password="root"
/>
<sql:update var="result" dataSource="${myDataSoure}">
    INSERT INTO student VALUES(1,'Mai', 'Linh','Nam Dinh');

</sql:update>
<c:set var="studentid" value="1"/>
<sql:update dataSource="${myDataSoure}">
    DELETE FROM student WHERE id=?
    <sql:param value="${studentid}"/>
</sql:update>
<%--  <sql:query var="result" dataSource="${myDataSoure}">--%>
<%--      SELECT * FROM student WHERE id=?--%>
<%--      <sql:param value="${studentid}"/>--%>
<%--  </sql:query>--%>
<sql:query var="result" dataSource="${myDataSoure}">
    SELECT * FROM student;
</sql:query>
<table border="1" width="50%">
    <tr>
        <th> Student id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
    </tr>
    <c:forEach var="row" items="${result.rows}">
        <td><c:out value=" ${row.id}"/></td>
        <td><c:out value="${row.firstname}"/>
        </td>
        <td><c:out value="${row.lastname}"/>
        </td>
        <td><c:out value="${row.address}"/></td>

    </c:forEach>

</table>


</body>
</html>
