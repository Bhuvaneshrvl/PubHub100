package com.bookapp.usermodel;

public class TestBook {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookId(2);
		book.setBookName("eclise");
		
		book.setBookPrice(1234);
		
		System.out.println(book);
	}

}
