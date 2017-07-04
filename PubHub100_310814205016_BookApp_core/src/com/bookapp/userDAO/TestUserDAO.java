package com.bookapp.userDAO;

import java.sql.SQLException;

import com.bookapp.usermodel.User;

public class TestUserDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		//user.setName("Ajith");
		user.setEmailid("ajith@gmail.com");
		user.setPassword("uio");
		
		
		UserDAO dao = new UserDAO();
		//dao.Register(user);
		System.out.println(dao.login(user));
		
		
		

	}

}
