<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome to Homework 5</h1>
<h3>Please log in.</h3>

<form action="Login" method="post">
    <p>Username: <input type="text" name="username" title="title"/>
    <p>Password: <input type="password" name="password" title="title"/>
        <input type="submit" value = "login"/></p>
</form>
<a href="${pageContext.request.contextPath}/create.jsp">Create New Account</a>
</body>
</html>
