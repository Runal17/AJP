<%@page import="org.hibernate.Session"%>
<%@page import="com.crud.entity.User"%>
<%@page import="com.crud.utility.HibernateUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>

<%

int id=Integer.parseInt(request.getParameter("id").trim());
Session s=HibernateUtil.getSessionFactory().openSession();
User user=(User)s.get(User.class, id);


%>

	<h2>Update Form</h2>

	<form action="./update" method="post">

		<input type="hidden" name="id" value="<%=user.getId()%>">
		<table>

			<tr>
				<td>NAME</td>
				<td><input type="text" name="name" value="<%=user.getName() %>"></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email"  value="<%=user.getEmail() %>"></td>
			</tr>
			<tr>
				<td>MOBILE</td>
				<td><input type="text" name="mobile"  value="<%=user.getMobile() %>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>


		</table>

	</form>

</body>
</html>