<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>        
        <title>Success</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     
	
    </head>
    <body>
        <div class="container">
            <h2 align="left" class="text-primary">Employee List</h2><hr />
            <div> </div>
                      
            <table class="table" align="center">
                <thead>
                  <tr>
                    <th>Id</th><th>Name</th><th>Salary</th>
                  </tr>
                </thead>
                <tbody>
                    <c:forEach var="emp" items="${list}">
                      <tr>
                        <td>${emp.id}</td><td>${emp.name}</td><td>${emp.salary}</td> 
                      </tr>
                    </c:forEach>
                </tbody>
              </table>          
              <ul class="pagination pagination-sm">
                <li class="page-item"><a class="page-link" href="/resgister/1">1</a></li>
                <li class="page-item"><a class="page-link" href="/resgister/2">2</a></li>
                <li class="page-item"><a class="page-link" href="/resgister/3">3</a></li>
              </ul>
        </div>        
    </body>
</html>