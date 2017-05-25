<%--
  Created by IntelliJ IDEA.
  User: Luka
  Date: 22/5/17
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
<h1>The Name <%= request.getParameter("username")%> Is Already In Use</h1>
<h3>Please enter another username and password.</h3>

<form action="Create" method="post">
    <p>Username: <input type="text" name="username" title="title"/>
    <p>Password: <input type="password" name="password" title="title"/>
        <input type="submit" value="login"/></p>
</form>
</body>
</html>
