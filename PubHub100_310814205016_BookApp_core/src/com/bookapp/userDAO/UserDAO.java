package com.bookapp.userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookapp.connectonutill.ConnectionUtill;
import com.bookapp.usermodel.User;

public class UserDAO {
	public void Register(User user) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtill.getConnection();

		PreparedStatement pst;
		pst = connection.prepareStatement("insert into users(name,email_id,password)values (?,?,?);");
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmailid());
		pst.setString(3, user.getPassword());

		pst.executeUpdate();

	}

	public boolean login(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtill.getConnection();

		String sql = "select name from users where email_id=? and password=?;";

		PreparedStatement pst = connection.prepareStatement(sql);

		pst.setString(1, user.getEmailid());
		pst.setString(2, user.getPassword());
		//pst.executeQuery();
		ResultSet rst = pst.executeQuery();

		boolean flag = false;
		if (rst.next()) {
			flag = true;
		}
		return flag;
	
	}


}
