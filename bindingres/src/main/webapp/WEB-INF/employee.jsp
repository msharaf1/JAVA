<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Employee Home Page</title>
   </head>

   <body>
      <h2>Submitted Student Information</h2>
      
      <table>
         <tr>
            <td>First Name: </td>
            <td> <c:out value="${firstName}" /> </td>
         </tr>
         <tr>
            <td>Last Name: </td>
            <td><c:out value="${lastName}" /></td>
         </tr>
         <tr>
            <td>Age: </td>
            <td><c:out value="${age}" /></td>
         </tr>
         <tr>
            <td>ID</td>
            <td><c:out value="${id}" /></td>
         </tr>
      </table>  
   </body>
   
</html>