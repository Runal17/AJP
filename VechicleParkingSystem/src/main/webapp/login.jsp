<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Admin</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="loginpage.css">
     <link rel="stylesheet" type="style.css">
</head>

<body>
<%@ include file="navbarblank.jsp"%>
    <section class="container-fluid">
        <section class="row justify-content-center mt-5">
            <section class="col-12 col-sm-6 col-md-3">
                <form class="form-container" action="./LoginServlet" method="post">
                   
                   <input type="hidden" name="name"> 
                   
                    <div class="form-group">
                       
                      <label for="email">Email address :</label>
                      <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                     
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Password</label>
                      <input type="password" name="password" class="form-control" id="password" placeholder="Enter Password">
                    </div>
                   
                    <button type="submit" class="btn btn-primary">Submit</button><br>
                  <a href="forgot-password.jsp">Forgot Password?</a>  
                  <br>
                <b>Create an account</b>
               <a href="register.jsp"><i>Register</i></a>

                  </form>
        </section>
      </section>
    </section>
    <%@ include file="footer.jsp"%>
   
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>    
                
</body>

</html>