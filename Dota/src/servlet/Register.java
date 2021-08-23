package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.UserDaoimpl;
import dto.pojo.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String name=request.getParameter("name");
		int drank=Integer.parseInt(request.getParameter("drank"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		UserDao user= new UserDaoimpl();
		
		int status=user.registerUser(new User(name,  username, password,  drank));
		
		if(status==1) {
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("registerfail.jsp");
		}
	}

}
