package com.bookapp.userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bookapp.connectonutill.ConnectionUtill;
import com.bookapp.usermodel.Book;

public class BookDAO {

	public void addBook(Book book) {
		Connection connection = ConnectionUtill.getConnection();
		String sql = "insert into books(book_name,book_price) values(?,?);";
		PreparedStatement pst = null;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, book.getBookName());
			pst.setInt(2, book.getBookPrice());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void changeBookName(String oldName, String newName) {
		Connection connection = ConnectionUtill.getConnection();
		PreparedStatement pst=null;
		try {
			pst = connection.prepareStatement("update books set book_name=? where book_name=?;");
			pst.setString(1, newName);
			pst.setString(2, oldName);
			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			

	}

	public List<Book> findAll() {
		Connection connection = ConnectionUtill.getConnection();
		PreparedStatement pst=null;
		ResultSet rst=null;
		List<Book> books = null;
		try {
			pst = connection.prepareStatement("select book_id,book_name,book_price from books ;");
			pst.executeQuery();
			rst = pst.executeQuery();
			books = new ArrayList<Book>();
			while (rst.next()) {
				Book book = new Book();
				book.setBookId(rst.getInt(1));
				book.setBookName(rst.getString(2));
				book.setBookPrice(rst.getInt(3));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			try {
				rst.close();
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			return books;
	}

	public void delete(String bName) {
		Connection connection = ConnectionUtill.getConnection();
		PreparedStatement pst = null;
		try {
			pst = connection.prepareStatement("delete from books where book_name=?;");
			pst.setString(1, bName);
			System.out.println(pst.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void changePrice(int price, String bName){
		Connection connection = ConnectionUtill.getConnection();
		PreparedStatement pst=null;
		try {
			pst = connection.prepareStatement("update books set book_price=? where book_name=?;");
			pst.setInt(1, price);
			pst.setString(2, bName);
			System.out.println(pst.executeUpdate());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	
}
}
