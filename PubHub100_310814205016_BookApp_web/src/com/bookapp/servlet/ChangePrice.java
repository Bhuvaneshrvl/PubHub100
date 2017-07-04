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
 * Servlet implementation class ChangePrice
 */
@WebServlet("/ChangePrice")
public class ChangePrice extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bName=request.getParameter("bName");
		int bPrice=Integer.parseInt(request.getParameter("bprice"));
		BookDAO dao=new BookDAO();
		RequestDispatcher rst=request.getRequestDispatcher("success.jsp");
		String message="book price changed";
		
			dao.changePrice(bPrice, bName);
			request.setAttribute("msg", message);
			rst.forward(request, response);
		
		
	}

	
}
