<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index HAi ye</title>
</head>
<body>
   <h2>Index page 2</h2>
   <h3><a href="FirstServlet">Send Request to server</a></h3>
   
   <%
   
 String records=  request.getParameter("recordInserted");
   out.print("<h3>"+records+"</h3>");
   
   %>
   
</body>
</html>