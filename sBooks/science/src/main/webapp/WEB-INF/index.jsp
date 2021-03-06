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
    <h1>Books List</h1>
    <table>
    <thead>
        <tr>
            <td>Title</td>
            <td>Author</td>
            <td>Description</td>
            <td>Language</td>
            <td>NumberOfPages</td>
            <td>Published</td>
            <td>RePrinted</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${bookList}" var = "book">
        <tr>
            <td> <c:out value="${book.title}" /> </td>
            <td> <c:out value="${book.author}" /> </td>
            <td> <c:out value="${book.description}"/> </td>
            <td> <c:out value="${book.language}"/> </td>
            <td> <c:out value="${book.numberOfPages}"/> </td>
            <td> <c:out value="${book.published}"/> </td>
            <td> <c:out value="${book.rePrinted}"/> </td>
        </tr>
        </c:forEach>
    </tbody>
</table>
        





<%-- <form:form action="/books" method="post" modelAttribute="book">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
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
    <input type="submit" value="Submit"/>
</form:form>  --%>
</body>
</html>







