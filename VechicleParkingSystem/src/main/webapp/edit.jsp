<%@page import="com.vehicleparkingsystem.entity.CarEntry"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.vehicleparkingsystem.utility.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />

<title>Vehical Parking System</title>
</head>
<body>

	<%@ include file="admin/navbarlogin.jsp"%>
	<%
		int id = Integer.parseInt(request.getParameter("id").trim());
	Session s1 = FactoryProvider.getFactory().openSession();
	CarEntry entry = (CarEntry) s1.get(CarEntry.class, id);
	%>

	<div class="container mt-5">
		<h1>Enter Vehicle Information</h1>
		<br>
		<div class="row">
			<div class="col-md-12">
				<form action="CarEntryUpdateServlet" method="post">
				<input type="hidden" name="id" value="<%=entry.getId()%>">
					<div class="form-group">
						<label for="ownername">Vehicle Owner Name :</label> <input
							type="text" class="form-control" id="ownername"
							placeholder="Enter name" value="<%=entry.getOwnername() %>" name="ownername" />
					</div>
					<div class="form-group">
						<label for="exampleFormControlSelect1">Select Vehicle type
							:</label> <select name="vehicletype" value="<%=entry.getVehicletype() %>" class="form-control"
							id="vehicletype">
							<option>Select</option>

							<option value="bike">Bike</option>
							<option value="car">Car</option>
							<option value="auto">Auto</option>
						</select>
					</div>
					<div class="form-group">
						<label for="vehiclecolor">Vehicle Color :</label> <input
							type="text" class="form-control" id="vehiclecolor"
							placeholder="Enter color" value="<%=entry.getVehiclecolor() %>" name="vehiclecolor" />
					</div>
					<div class="form-group">
						<label for="vehiclename">Vehicle Name :</label> <input type="text"
							class="form-control" id="vehiclecolor" value="<%=entry.getVehiclename() %>" placeholder="Enter color"
							name="vehiclename" />
					</div>
					<div class="form-group">
						<label for="vehiclenumber">Vehicle number:</label> <input
							type="text" class="form-control" id="vehiclenumber"
							placeholder="eg.MH04CH2942" value="<%=entry.getVehiclenumber() %>" name="vehiclenumber" />
					</div>
					<div class="form-group">
						<label for="exampleFormControlSelect1">Select Parking Lot
							:</label> <select name="parkingarea" class="form-control" value="<%=entry.getParkingarea() %>"
							id="parkingarea">
							<option>Select</option>
							<option value="a1">A1</option>
							<option value="a2">A2</option>
							<option value="b1">B1</option>
							<option value="b2">B2</option>
						</select>
					</div>
					<button type="submit" class="form-control btn btn-primary">
						Submit</button>
				</form>
			</div>
		</div>
		<br />

	</div>
	<hr>
	<%@ include file="../footer.jsp"%>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
