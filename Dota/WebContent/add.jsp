<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add heros</title>
</head>
<body>

	<div>
		<form action="addhero" method="post">
			<table>

				<tr>
					<td>name</td>
					<td><input type="text" name="name" required /></td>

				</tr>
				<tr>
					<td>type</td>
					<td><input type="text" name="type" required /></td>

				</tr>
				<tr>
					<td>attr</td>
					<td><input type="text" name="attr" required /></td>

				</tr>
				<tr>
					<td>ulti</td>
					<td><input type="text" name="ulti" required /></td>

				</tr>
				<tr>
					<td>
						<button>Submmit</button>
					</td>
				</tr>


			</table>
		</form>
	</div>

</body>
</html>