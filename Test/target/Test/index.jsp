<html>
<head>
    <title>login form</title>
</head>
<body>
<!--<form action="index.jsp" method="post">
    Username:<input type=" text" name="email" /><br/>
    <br>
    Password:<input type=" text" name="pass" /><br/>
    <br>
    <span> <input type="submit" value="ok" /></span>
    <input type="submit" value="register" />
</form>
-->

<form action="FirstServlet" method="post">
<label for="fname">Username:</label>
<input type="text" id="fname" name="username"><br><br>
<label for="lname">Password:</label>
<input type="text" id="lname" name="password"><br><br>
<button type="submit" formmethod="post">OK</button>
    <button type="submit" ><a href="registration.jsp">Registration</a></button>
</form>
</body>
</html>