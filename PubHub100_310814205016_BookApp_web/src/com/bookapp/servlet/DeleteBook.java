package com.bookapp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.userDAO.BookDAO;

/**
 * Servlet implementation class DeleteBook
 */
@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rst=request.getRequestDispatcher("findallbooks.jsp");
		String bName=request.getParameter("bname");
		String message="Book is Deleted";
		BookDAO dao=new BookDAO();
		
			dao.delete(bName);
			request.setAttribute("message", message);
			rst.forward(request, response);
		
		
	}

}
