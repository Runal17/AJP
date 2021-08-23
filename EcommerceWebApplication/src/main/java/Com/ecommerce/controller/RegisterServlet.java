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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/signup")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String question=req.getParameter("question");
			String answer=req.getParameter("answer");
			
			String password=req.getParameter("password");
			Long mobile= Long.parseLong(req.getParameter("mobile"));
		
			 String address=null;
			 String city=null;
			 String state=null;
			 String country=null;		
			
			
				try {
					
					Connection con=ConnectionProvider.getConnection();
					PreparedStatement ps=con.prepareStatement("insert into user123(name,email,mobile,question,answer,password,address,city,state,country) values(?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1, name);
					ps.setString(2, email);
					ps.setLong(3, mobile);
					ps.setString(4, question);
					ps.setString(5, answer);
					ps.setString(6,password);
					ps.setString(7, address);
					ps.setString(8, city);
					ps.setString(9, state);
					ps.setString(10, country);
					ps.executeUpdate();
					
					
					resp.sendRedirect("sign-up.jsp?msg=valid");//Succesfully REgisterd
					
				}catch(Exception e) {
					e.printStackTrace();
					
					resp.sendRedirect("sign-up.jsp?msg=invalid");//try again
				}
			
			
		}

}
