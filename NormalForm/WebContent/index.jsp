<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-dark text-light ">
	<h1 class="text-center mt-3 display-1 ">Register</h1>
	<div class="contianer mt-3 mb-5">
		<div class="col-lg-6 m-auto border">
			<form method="post" action="register.jsp">
				<h3 class="mt-5 mb-3 text-center">Personal Details</h3>
				<div class="mt-5 ms-5">
					<label>Enter your name:</label>
					<input type="text" name="name" id="name"  autocomplete="off"/>
				</div>
				<div class="mt-5 ms-5">
					<label>Enter student ID:</label>
					<input type="text" name="stdid" id="stdid"  autocomplete="off"/>
				</div>
				<div class="mt-5 ms-5">
					<label>Enter Email-ID:</label>
					<input type="email" name="emailid" id="emailid" autocomplete="off"/>
				</div>
				<div class="mt-5 ms-5">
					<label>Enter mobile number:</label>
					<input type="text" name="mobileno" id="mobileno" autocomplete="off"/>
				</div>
				<div class="mt-5 ms-5">
					<label>Select College:</label>
					<select name="college" id="college">
						<option value=""></option>
						<option value="Khargar">Khargar</option>
						<option value="Juhu">Juhu</option>
					</select>
				</div>
				<div class="mt-5 ms-5">
					<label>Gender:</label>
					<input type="radio" name="gender" id="genderm" value="Male" autocomplete="off" />
					<label>Male</label>
					<input type="radio" name="gender" id="genderf" value="Female" autocomplete="off" />
					<label>Female</label>
				</div>
					<h3 class="mt-5 mb-3 text-center">Login Details</h3>
				<div class="mt-5 ms-5">
					<label>Enter Username:</label>
					<input type="text" name="username" id="username"  autocomplete="off"/>
				</div>
				<div class="mt-5 ms-5">
					<label>Enter Password:</label>
					<input type="password" name="password" id="password" autocomplete="off"/>
				</div>
				
				
				
				
				<div class="mt-5 mb-3 text-center">
					<input type="submit" value="Register" class="btn btn-md btn-primary"/>	
				</div>
				
			</form>
		</div>
	</div>
	
</body>
</html>