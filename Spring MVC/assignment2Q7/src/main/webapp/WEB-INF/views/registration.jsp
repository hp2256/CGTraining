<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body>
<form:form action="/registration" modelAttribute="customer" method="post">
Enter your name <form:input type="text" path="name"/> <form:errors path = "name" cssClass="text-danger"/><br>
Password: <form:input type="password" path="password"/> <form:errors path = "password" cssClass="text-danger"/><br>
Email: <form:input type="text" path="email"/> <form:errors path = "email" cssClass="text-danger"/><br>
Contact: <form:input type="text" path="contact"/> <form:errors path = "contact" cssClass="text-danger"/><br>
City: <form:select type="select" path="city">
	  <form:option value="mumbai">Mumbai</form:option>
                <form:option value="bangalore">Bangalore</form:option>
                <form:option selected="delhi" value="delhi">Delhi</form:option>
</form:select><br>
<form:errors path = "city" cssClass="text-danger"/><br>
Zipcode : <form:input type="text" path="zipcode"/> 
<form:errors path = "zipcode" cssClass="text-danger"/>${zipError}<br>
<input type="submit"/>

</form:form>
</body>
</html>