


<%@page import="java.sql.*"%>
<%@page import="Com.ecommerce.dbconnection.ConnectionProvider"%>
<% 



try{
	
	Connection conn=  ConnectionProvider.getConnection();
	Statement stmt =conn.createStatement();
	//stmt.execute("create table user123(id int primary key auto_increment,name varchar(255),email varchar(255) unique key,password varchar(255), mobile bigint unique key, question varchar(255), answer varchar(255), address varchar(255),city varchar(255),state varchar(255),country varchar(255))");
	String create_products="create table products(id int, product_name varchar(255), category varchar(255), price int, active varchar(10))";
	//stmt.execute(create_query);
	stmt.execute(create_products);


	System.out.println("Table inserted"); 
	
}catch(Exception e){
	
	e.printStackTrace();
}



%>