<%--
  Created by IntelliJ IDEA.
  User: Sazails
  Date: 16/02/2020
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="index.jsp"%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form action="login.jsp" method="post">
        Username: <input type="text" name="username"><br>
        Email: <input type="email" name="email"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="login"/>
    </form>
</body>
</html>
