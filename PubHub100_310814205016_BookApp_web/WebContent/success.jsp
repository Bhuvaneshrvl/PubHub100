<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<h1>Book Enquires</h1><br>welcome
<%=session.getAttribute("name")
%><br>
<%
String message= (String)request.getAttribute("message");
String pricechanged=(String)request.getAttribute("msg");
if(message!=null){
%>
<p><%=message %></p>
<%
}%>
<%
if(pricechanged=="book price changed"){
%>
<p><%=pricechanged %></p>
<%
}
%>


<a href="addbook.jsp">Add your Book</a><br>
<a href="findallbooks.jsp">List of Books</a><br>
<a href="delete.jsp">Delete Book</a><br>
<a href="changebookprice.jsp">Change Book Price</a>
</body>
</html>