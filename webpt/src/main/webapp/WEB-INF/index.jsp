<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to Spring Fundamentals</title>
</head>
<body>
<c:out value="${name}"></c:out>
<h1>Welcome to JSP view</h1>

    <form method="POST" action="/login">
        <label>User Name: <input type="text" name="username"></label>
        <label>Password: <input type="password" name="password"></label>
     <button>Login</button>
</form>

<c:out value="${username}">User Name: </c:out>
<c:out value="${password}">Password: </c:out>

</body>
</html>