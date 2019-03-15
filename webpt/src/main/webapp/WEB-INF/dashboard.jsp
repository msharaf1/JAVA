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

<h1>Welcome to JSP view</h1>


<c:out value="${username}"></c:out>
<c:out value="${password}"></c:out>

</body>
</html>