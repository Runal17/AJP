package exampleservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    
    public FirstServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("Request is Received");
		response.setContentType("text/html");
		PrintWriter pWriter= response.getWriter();
		
		pWriter.print("<h1 style='color:blue '>Requeest is received</h1>");
		pWriter.print("<h3 style='color:blue '>response is sent</h3>");
		Statement stmt=null;
		Connection con=null;
		//load the drivers of database
		
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdactest","root","edac");
		     stmt= con.createStatement();
			
			String query="INSERT INTO students (name,coursel) VALUES ('VINEY PAL','eDAC')";
			int noOfStudentInserted=stmt.executeUpdate(query);
			
			pWriter.print("\n NO of student REcord INserted"+ noOfStudentInserted);
			
			 query="INSERT INTO students (name,coursel) VALUES ('sam PAL','eDAC')";
			
			response.sendRedirect("index.jsp");
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();		
     		} catch (SQLException e) {		
	    		e.printStackTrace();
	    	}finally {
			
			pWriter.close();
			
			
    	try {
    		 if(stmt!=null)
					stmt.close();
				
		     if(con!=null)
				    con.close();
		
    	   } catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
