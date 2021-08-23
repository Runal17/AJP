
<%@page import="com.vehicleparkingsystem.dao.CarDetailsDao"%>
<%@page import="com.vehicleparkingsystem.dao.CarDetailsImpl"%>
<%@page import="com.vehicleparkingsystem.entity.CarEntry"%>
<%@page import="com.vehicleparkingsystem.entity.CarEntry"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<title>Vehicle Parking System</title>
</head>
<body>
	<%@ include file="admin/navbarlogin.jsp"%>
	<h1 style="text-align: center;">All Car Details</h1>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">VEHICLE OWENER NAME :</th>
				<th scope="col">VEHICLE TYPE :</th>
				<th scope="col">VEHICLE COLOR :</th>
				<th scope="col">VEHICLE NUMBER :</th>
				<th scope="col">VEHICLE NAME :</th>
				<th scope="col">VEHICAL PARKING LOT :</th>
				<th scope="col">UPDATE :</th>
				<th scope="col">DELETE :</th>
			</tr>

			<%
				CarDetailsDao cardao = new CarDetailsImpl();
			List<CarEntry> AllCars = cardao.getAllCarDetails();
			for (CarEntry alldetails : AllCars) {
			%>
		</thead>
		<tbody>
			<tr>
				<td><%=alldetails.getId()%></td>
				<td><%=alldetails.getOwnername().toUpperCase()%></td>
				<td><%=alldetails.getVehicletype().toUpperCase()%></td>
				<td><%=alldetails.getVehiclecolor().toUpperCase()%></td>
				<td><%=alldetails.getVehiclenumber()%></td>
				<td><%=alldetails.getVehiclename().toUpperCase()%></td>
				<td><%=alldetails.getParkingarea().toUpperCase()%></td>


				<td><a href="edit.jsp?id=<%=alldetails.getId()%>"
					class="btn btn-success btn-lg active" role="button"
					aria-pressed="true">Update</a></td>
				<td><a href="CarEntryDeleteServlet?id=<%=alldetails.getId()%>"
					class="btn btn-danger btn-lg active" role="button"
					aria-pressed="true">Delete</a></td>


				<%
					}
				%>
			
		</tbody>
	</table>

<%@ include file="../footer.jsp"%>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>