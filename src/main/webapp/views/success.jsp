<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/3/8
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page pageEncoding="utf-8" isELIgnored="false"%>
<html>
<head>
    <title>success</title>
</head>
<body>


<table border="1">
    <tr>
        <td>部门编号</td>
        <td>部门名</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${all}" var="dept">
        <tr>
            <td>${dept.dno}</td>
            <td>${dept.dname}</td>
            <td>${dept.loc}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
