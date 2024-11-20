package com.cdac.ov.Dao;

import java.sql.SQLException;

import com.cdac.ov.pojo.User;

public interface UserDao {
	
	public User authenticateUser(String email , String password)throws SQLException;
	public String registerUser(User newVoter)throws SQLException;
	public void cleanUp()throws SQLException;
}
