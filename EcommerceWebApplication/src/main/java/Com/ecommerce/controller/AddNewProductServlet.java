package Com.ecommerce.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.ecommerce.dbconnection.ConnectionProvider;

/**
 * Servlet implementation class AddNewProductServlet
 */
@WebServlet("/AddNewProductServlet")
public class AddNewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id= request.getParameter("id");
		String product_name=request.getParameter("product_name");
		String category=request.getParameter("category");
		String price=request.getParameter("price");
		String active=request.getParameter("active");
		
		
		
		try {
			
			Connection con=ConnectionProvider.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into products values(?,?,?,?,?)");
			ps.setString(1, id);
			ps.setString(2, product_name);
			ps.setString(3, category);
			ps.setString(4, price);
			ps.setString(5, active);
			
			ps.executeUpdate();
			
			response.sendRedirect("admin/add_new_products.jsp?msg=done");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("admin/add_new_products.jsp?msg=invalid");
		}

		
		
	}

}
