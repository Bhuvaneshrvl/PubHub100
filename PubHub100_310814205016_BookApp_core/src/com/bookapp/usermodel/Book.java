package com.bookapp.usermodel;

public class Book {
	private int BookId;
	private String BookName;
	private int BookPrice;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "RegisterBook [BookId=" + BookId + ", BookName=" + BookName +  ", BookPrice=" + BookPrice + "]";
	}
	

}
