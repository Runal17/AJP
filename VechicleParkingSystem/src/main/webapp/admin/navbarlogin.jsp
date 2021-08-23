<%@ page import="com.vehicleparkingsystem.entity.User" %>
<%

HttpSession s=request.getSession();
String email=(String)s.getAttribute("email");

%>


<nav class="navbar navbar-expand-lg navbar-light bg-primary">
      <a class="navbar-brand" href="#"><h1>Vehicle Parking System</h1></a>
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarNavAltMarkup"
        aria-controls="navbarNavAltMarkup"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav ml-auto">
          <a class="nav-item nav-link active" href="admin/addcardetails.jsp"
            >Add Car Entry <span class="sr-only">(current)</span></a
          >
          <a class="nav-item nav-link active" href="../show_all_cardetails.jsp">All Vehicle List</a>
           <a class="nav-item nav-link active" href="#"><span><%= email.toUpperCase()%></span></a>
          <a class="nav-item nav-link active" href="logout.jsp">Logout</a>
        </div>
      </div>
    </nav>