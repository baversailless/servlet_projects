<%--
  Created by IntelliJ IDEA.
  User: Сабина
  Date: 25.10.2021
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<form action="FirstServlet" method="get">
    <label for="fname">Username:</label>
    <input type="text" id="fname" name="username"><br><br>
    <label for="lname">Password:</label>
    <input type="text" id="lname" name="password"><br><br>
    <button type="submit" formmethod="get">OK</button>
    <button type="submit" ><a href="index.jsp">Login</a> </button>
</form>
</body>
</html>
