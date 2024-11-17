package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojos.User;

public interface UserDao {
//add a method to fetch user details by role
	List<User>   fetchUserDetailsByRole(String role) throws SQLException;
	//add a method to clean up DB resources;
	void cleanUp() throws SQLException;
	//register the user
    String registerVoter(User newVote)throws SQLException ;
    //change user password
    String changePassword(String email,String op, String np)throws SQLException;
    //delete voters details
    String deleteDetails(int id)throws SQLException;
    //sign-in method
    User SignIn(String email,String password)throws SQLException;
}
