<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Registration</title>
</head>
<body>
	<div class="mainContainer">
	<div class="header">
	<h1>Welcome to Book Registration!</h1>
	</div>
	<div class="bodyConatiner">
		<h1>Please register your book!</h1>
			<c:out value="${bookName}"> BookName</c:out>
			
			<form:form action="/books" method="POST" modelAttribute="book">
				
				
				<form:label path="id">Book ID: </form:label>
				<form:errors path="id"></form:errors>
				<form:input path="id"></form:input>
				
				
				<form:label path="bookName">Book Name: </form:label>
				<form:errors path="bookName"></form:errors>
				<form:input path="bookName"></form:input>
				
				<form:label path="bookAuthor">Book Author: </form:label>
				<form:errors path="bookAuthor"></form:errors>
				<form:input path="bookAuthor"></form:input>
				
				<form:label path="published">Published By: </form:label>
				<form:errors path="published"></form:errors>
				<form:input path="published"></form:input>
				
				
				

				<br /><br/>
				<input type="submit" value="registerBook">
			</form:form>
	</div>
	
	</div>

</body>
</html>