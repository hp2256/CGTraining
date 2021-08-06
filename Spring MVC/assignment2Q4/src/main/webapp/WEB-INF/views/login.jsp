<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body>
<form action="/login" method="post">
Enter your name <input type="text" name="name"/><br>
Password: <input type="password" name="password"/><br>
Email: <input type="text" name="email"/>

<input type="submit"/>

</form>
</body>
</html>