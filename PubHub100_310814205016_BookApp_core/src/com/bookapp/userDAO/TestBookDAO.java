package com.bookapp.userDAO;

import java.sql.SQLException;

//import com.bookapp.usermodel.Book;

public class TestBookDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Book book=new  Book();
		BookDAO dao=new BookDAO();
		
		/*book.setBookName("java 7");
		book.setBookPrice(1234);
		dao.addBook(book);
		
		System.out.println(dao.findAll());
		
		dao.delete("eclipse");
		String old="eclipse12";
		String nw ="eclipse1" ;
		dao.changeBookName(old,nw);
		*/
		//dao.changePrice(200, "eclipse");
		dao.delete("eclipse");
		
		
	}

}
