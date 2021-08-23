<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Sign Up</title>
</head>
<body>

	<div class="container">

		<div class="row">

			<div class="col-md-7 mt-5 ">

				<form action="./signup" method="post" >

					<div class="form-group">
						<input type="text" name="name" class="form-control" id="name"
							aria-describedby="emailHelp" placeholder="Enter Name">
					</div>

					<div class="form-group">
						<input type="email" name="email" class="form-control" id="email"
							aria-describedby="emailHelp" placeholder="Enter email"> <small
							id="emailHelp" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>

					<div class="form-group">
						<input type="number" name="mobile" class="form-control"
							id="mobile" aria-describedby="emailHelp"
							placeholder="Enter Mobile "> <small id="emailHelp"
							class="form-text text-muted">We'll never share your email
							with anyone else.</small>
					</div>

					<div class="form-group">
						<select class="form-control" name="question" id="quetions">
							<option value="What was your first car?">What was your
								first car?</option>
							<option value="What is the name of your first pet?">What
								is the name of your first pet?</option>
							<option value="What elementary school did you attend?">What
								elementary school did you attend?</option>
							<option value="What is name of your town where you were born?">What
								is name of your town where you were born?</option>
						</select>
					</div>

					<div class="form-group">
						<textarea class="form-control" name="answer"
							placeholder="Enter your answer" id="answer" rows="3"></textarea>
					</div>

					<div class="form-group">
						<input type="password" name="password" class="form-control"
							id="exampleInputPassword1" placeholder="Password">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				
				<a href="sign-in.jsp">Login here...</a>

			</div>
			<div class="col-md-5 mt-4 ">
			
			<%
			
			String msg=request.getParameter("msg");
			if("valid".equals(msg)){
			%>
			<h4 style="color:green">Successfully Register....</h4>
			<%
			}
			%>
			
			<%
			if("invalid".equals(msg)){
			%>
			<h4 style="color:red">Something went wrong! Try Again</h4>
			<%
			}
			%>
			
			
	
			
			<h5>
					<b>Online Shopping</b>
				</h5>

				<p>The online shopping system is the application that allows the
					users to shop online without going to the shops to buy them.

			
			</div>

		</div>

	</div>



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