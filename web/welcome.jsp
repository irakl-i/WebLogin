<%--
  Created by IntelliJ IDEA.
  User: Luka
  Date: 22/5/17
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Welcome <%= request.getParameter("username")%>
    </title>
</head>
<body>
<h1>
    Welcome <%= request.getParameter("username")%>
</h1>
</body>
</html>
