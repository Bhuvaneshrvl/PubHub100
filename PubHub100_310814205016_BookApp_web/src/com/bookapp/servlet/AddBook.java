package com.bookapp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.userDAO.BookDAO;
import com.bookapp.usermodel.Book;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String bookName=request.getParameter("bname");
	    int bookPrice=Integer.parseInt(request.getParameter("price"));
	    String message="Book Save";
	    Book book = new Book();
	    book.setBookName(bookName);
	    book.setBookPrice(bookPrice);
	    
	    BookDAO dao =new BookDAO();
	    
			dao.addBook(book);
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			request.setAttribute("message", message);
			rd.forward(request, response);
			
		
	    
	}

}
