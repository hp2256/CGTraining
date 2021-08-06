<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Q3</title>

</head>
<body>
<div class="head row">
    <ul class="pagination pagination-sm">
      <li class="page-item"><a class="page-link" href="/login?language=en">Login(English)</a></li>
      <li class="page-item"><a class="page-link" href="/login?language=fr">Login(French)</a></li>
      <li class="page-item"><a class="page-link" href="/login?language=vi">Login(Viatnamese)</a></li>
    </ul>
</div>
<div style="padding: 12px;">
	<form action="/login" method="post">
	<spring:message code="userName" /> : <input id="username" type="text" name="username"><br><br>
	<spring:message code="password" /> : <input id="password" type="text" name="password"><br><br>
	<button type="submit" class="btn btn-primary"><spring:message code="login" /></button>
	</form>
</div>

</body>
</html>