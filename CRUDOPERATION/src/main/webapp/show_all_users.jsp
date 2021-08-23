<%@page import="com.crud.dao.UserDaoImpl"%>
<%@page import="com.crud.dao.UserDao"%>
<%@page import="com.crud.entity.User"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Users</title>
</head>
<body>

	<h1 style="text-align: center;">Show All Users</h1>

	<table border="1" align="center">


		<tr>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>

		<%
			UserDao userDao = new UserDaoImpl();
			List<User> allUser = userDao.getAllUser();

			for (User user : allUser) {
		%>

		<tr>

			<td><%=user.getName()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getMobile()%></td>
			<td><a href="edit.jsp?id=<%= user.getId()%>">update</a></td>
			<td><a href="DeleteServlet?id=<%= user.getId()%>">delete</a></td>

		</tr>

		<%
			}
		%>


	</table>
	
	<h2 style="text-align: center"><a href="register.jsp">Register here....</a></h2>

</body>
</html>