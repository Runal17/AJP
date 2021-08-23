<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD NOTES</title>

<%@ include file="all_js_css.jsp"%>

</head>
<body>

	<%@ include file="navbar.jsp"%>



	<div class="container">

		<div class="row">

			<div class="col-md-8 offset-md-2">

				<h2 class="text-center">Add Entry</h2>

				<%
				
				String msg=request.getParameter("msg");
				if("add".equals(msg)){
				%>
				<h4 style="color:green;text-align: center;">Successfully Added!!!</h4>
				<%
				}
				%>
				<%
				if("invalid".equals(msg)){
				%>
				<h4 style="color:red;text-align: center;">Something went wrong! Try Again</h4>
				<%
				}
				%>

				<form action="./SaveServlet" method="post">
					<div class="form-group">
						<label for="note_title">Note Title</label> <input type="text"
							class="form-control" name="note_title" id="note_title"
							aria-describedby="emailHelp" placeholder="Enter here">
					</div>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Note Content</label>
						<textarea placeholder="Enter your content here"
							name="note_content" class="form-control"
							id="exampleFormControlTextarea1" rows="10"></textarea>
					</div>
					<center>
						<div class="container">
							<button type="submit" class="btn btn-primary">ADD</button>
						</div>
					</center>
				</form>

			</div>

		</div>

	</div>



</body>
</html>