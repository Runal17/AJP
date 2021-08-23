<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="main.MainController"%>
<jsp:useBean id="inp" class="pojo.Student"></jsp:useBean>
<jsp:setProperty property="*" name="inp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		MainController mcon = new MainController();
	    mcon.registerStudentData(inp);
	%>
<h1>Welcome </h1>
</body>
</html>