<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registered Books!</title>
</head>
<body>
	<div class="container">
		<div class="viewForm">
		<h1>Successfully Registered the following Book:</h1>
			<p>Book Name: <c:out value="${bookName}" /> </p>
			<p>Book Author <c:out value="${bookAuthor}" /> </p>
			<p>Published By:  <c:out value="${published}" /> </p>
			
		
		</div>
	
	</div>

</body>
</html>