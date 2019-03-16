	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Home Page</title>
</head>
<body>
<div class="mainContainer">
	<h1>Welcome to my Page</h1>
	
	<div class="addEmpForm">
	<form method="POST" action="/addEmployee">
      <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id"/></td>
        </tr>
        <tr>
            <td>First Name:</td>
            <td><input type="text" name="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lastName" /></td>
        </tr>
         <tr>
            <td>Age:</td>
            <td><input type=text name="age" /></td>
        </tr>
        <tr>
            <td colspan="2">
              <input type="submit" value="Sumbbit" />
            </td>
        </tr>
      </table>
  </form>
	</div>
</div>

</body>
</html>