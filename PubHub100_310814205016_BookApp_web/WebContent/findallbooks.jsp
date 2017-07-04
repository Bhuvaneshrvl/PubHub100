<%@page import="com.bookapp.usermodel.Book"%>
<%@page import="com.bookapp.userDAO.BookDAO"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find all books</title>
</head>
<body>
<h1>Book Enquires</h1><br>
<a href="addbook.jsp">Add your Book</a><br>
<a href="delete.jsp">Delete Book</a><br>
<a href="changebookprice.jsp">Change Book Price</a><br>
<%
String message= (String)request.getAttribute("message");
if(message!=null){
%>
<p><%=message %></p>
<%
}%>
	<table border=1>
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Book Price</th>
		</tr>


		<%
         BookDAO dao=new BookDAO();
         
	     List<Book>list =dao.findAll();
	     for(Book book:list){
	    	%>
	    	<tr>
	    	<td><%=book.getBookId() %></td>
	    	<td><%=book.getBookName() %></td>
	    	<td><%=book.getBookPrice() %></td>
	    	</tr>
	    	
	    	<% 
	    	 
	     }
	     %>
	     
		</tbody>


	</table>
</body>
</html>