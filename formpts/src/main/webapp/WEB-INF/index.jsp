<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
    <%--<link rel="stylesheet" type="text/css" href="/css/stylesheet.css">--%>


</head>
<body>
    <h3>Welcome, Enter the Employee Details</h3>

    <form:form method="POST" action="/spring-mvc-xml/addEmployee"
    modelAttribute="employee">
        <table>
            <tr>
                <td><form:label path="name">Name </form:label></td>
                <td><form:input path="name"/> </td>
            </tr>
            <tr>
                <td><form:label path="id">ID</form:label></td>
                <td><form:input path="id"/> </td>
            </tr>
            <tr>
                <td><form:label path="contactNumber">Contact Number</form:label></td>
                <td><form:input path="contactNumber" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>

</p>
</body>
</html>