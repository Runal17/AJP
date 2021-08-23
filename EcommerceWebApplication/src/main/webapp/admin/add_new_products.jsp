<%@page import="Com.ecommerce.dbconnection.ConnectionProvider"%>
<%@ include file="admin-header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<div class="row">


			<div class="col-md-8 offset-md-2">

				<%
				String msg = request.getParameter("msg");

				if ("done".equals(msg)) {
				%>
				<h4 style="text-align: center; color: green">Product Added
					Successfully</h4>
				<%
				}
				%>
				<%
				if ("invalid".equals(msg)) {
				%>
				<h4 style="text-align: center; color: red">Something went
					wrong! Try Again</h4>
				<%
				}
				%>





				<%
				int id = 1;

				try {

					Connection con = ConnectionProvider.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select max(id) from products");
					while (rs.next()) {
						id = rs.getInt(1);
						id = id + 1;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				%>



			</div>


		</div>


	</div>
	<!-- ----------------------------------------------------------- -->
	<div class="container">

		<div class="row">
			<div class="col-md-6 offset-md-3">

				<form action="../AddNewProductServlet" method="post">
					<h3 style="color: orange; text-align: center;">
						PRODUCT ID
						<%
					out.println(id);
					%>
					</h3>
					<input type="hidden" name="id" value="<%out.println(id);%>">

					<div class="form-group">
						<input type="text" name="product_name" class="form-control"
							id="product_name" aria-describedby="emailHelp"
							placeholder="Enter Product name">
					</div>

					<div class="form-group">
						<input type="text" name="category" class="form-control"
							id="category" aria-describedby="emailHelp"
							placeholder="Enter Category">
					</div>

					<div class="form-group">
						<input type="number" name="price" class="form-control" id="price"
							aria-describedby="emailHelp" placeholder="Enter Price">
					</div>

					<div class="form-group">
						<label for="active">Active</label> <select class="form-control"
							name="active" id="active">
							<option>Yes</option>
							<option>No</option>

						</select>
					</div>

					<button type="submit" class="btn btn-primary">ADD</button>

				</form>
			</div>
		</div>

	</div>



</body>
</html>