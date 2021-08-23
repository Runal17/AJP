<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>

	<h2>Register Form</h2>

	<form action="./register" method="post">

		<table>

			<tr>
				<td>NAME</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>MOBILE</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>


		</table>

	</form>

</body>
</html>