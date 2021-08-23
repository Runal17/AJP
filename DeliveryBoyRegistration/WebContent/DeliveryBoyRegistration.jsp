
<!doctype html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Delivery Boy Registration</title>
</head>
<body>

	<form>


		<div class="container-fluid ml-4 mt-5 " style="border: 1px">

			<div class="row">

				<div class="col-md-4">
					<h1 class="content">Personal Information</h1>
					<div class="form-group">
						<label name="firstname">First name :</label> <input type="text"
							class="form-control" id="fname" placeholder="Enter first name"
							name="firstname">
					</div>
					<div class="form-group">
						<label name="middlename">Middle name :</label> <input type="text"
							class="form-control" id="mname" placeholder="Enter Middle name"
							name="middlename">
					</div>
					<div class="form-group">
						<label name="lastname">Last name :</label> <input type="text"
							class="form-control" id="lname" placeholder="Enter last name"
							name="lastname">
					</div>
					<div class="form-group">
						<label for="inputAddress">D.o.B</label> <input type="date"
							class="form-control" id="inputAddress" placeholder="1234 Main St">
					</div>
					<div class="form-group">
						<label for="inputAddress2">Address :</label> <br>
						<textarea id="w3review" class="form-control" name="address"
							rows="4" cols="50"></textarea>
					</div>

					<div class="form-group">
						<label for="exampleFormControlFile1">Upload Address Proof
							:</label> <input type="file" class="form-control-file"
							id="exampleFormControlFile1">
					</div>


				</div>
				<div class="col-md-4">
					<h1 class="content">Registration Information</h1>


					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Email</label> <input type="email"
								class="form-control" id="inputEmail4" placeholder="Email">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Password</label> <input
								type="password" class="form-control" id="inputPassword4"
								placeholder="Password">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputCity">City</label> <input type="text"
								class="form-control" id="inputCity">
						</div>
						<div class="form-group col-md-4">
							<label for="inputState">State</label> <select id="inputState"
								class="form-control">
								<option selected>Choose...</option>
								<option></option>
								<option>...</option>
								<option>...</option>
								<option>...</option>
							</select>
						</div>

						<div class="form-group col-md-2">
							<label for="inputZip">Zip</label> <input type="text"
								class="form-control" id="inputZip">
						</div>
					</div>

					<button type="submit" class="btn btn-primary">Sign in</button>

				</div>
				<div class="col-md-4">col3</div>

			</div>

		</div>

	</form>




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