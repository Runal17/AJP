package com.note.app.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.note.app.entity.Notes;
import com.note.app.utility.FactoryProvider;

/**
 * Servlet implementation class SaveServlet
 */
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		try {
			
			String note_title=request.getParameter("note_title");
			String note_content=request.getParameter("note_content");
			
			//transient state
			Notes note=new Notes(note_title,note_content,new Date());
			
			
			//persistant state
			/*Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory=cfg.buildSessionFactory();*/
			
			SessionFactory sessionFactory=FactoryProvider.getFactory();
			
			System.out.println("Tables created....");
			
			Session session=sessionFactory.openSession();
			session.save(note);//insert into notes value()
			
			session.beginTransaction().commit();
			
			response.sendRedirect("add_notes.jsp?msg=add");
			
			session.close();
			
			sessionFactory.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("add_notes.jsp?msg=invalid");
		}
		
		
		
	}

}
