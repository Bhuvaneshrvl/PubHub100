package com.bookapp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.bookapp.userDAO.UserDAO;
import com.bookapp.usermodel.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mailid=request.getParameter("email");
		String password=request.getParameter("pass");
		User user=new User();
		user.setEmailid(mailid);
		user.setPassword(password);
		UserDAO  dao=new UserDAO();
		HttpSession session=request.getSession();
		String name=user.getEmailid()+"   sucessfully logedin";
		session.setAttribute("name", name);
		
		try {
			boolean flag= dao.login(user);
			if(flag){
			response.sendRedirect("success.jsp");	
			}
			else{
				response.sendRedirect("failure.jsp");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
		}
		
		
		
	}

}
