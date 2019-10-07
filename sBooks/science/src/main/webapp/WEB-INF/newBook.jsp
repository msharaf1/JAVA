

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Book Library</title>
</head>
<body>
    <h1> <c:out value="${bookObj.title}"/> </h1>



<form:form action="/home/new" method="POST" modelAttribute="bookObj">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
        <p>
        <form:label path="author">Author</form:label>
        <form:errors path="author"/>
        <form:input path="author"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="language">Language</form:label>
        <form:errors path="language"/>
        <form:input path="language"/>
    </p>
    <p>
        <form:label path="numberOfPages">Pages</form:label>
        <form:errors path="numberOfPages"/>     
        <form:input type="number" path="numberOfPages"/>
    </p>
        <p>
        <form:label path="published">Date</form:label>
        <form:errors path="published"/>     
        <form:input path="published" />
    </p>  
    <p>
    <form:label path="rePrinted">Pages</form:label>
    <form:errors path="rePrinted"/>     
    <form:input  path="rePrinted"/>
</p>      
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>







