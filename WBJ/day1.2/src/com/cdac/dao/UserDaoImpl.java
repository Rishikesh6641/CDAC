package com.cdac.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	//state - 
	private Connection connection;
	private PreparedStatement pst1,pst2,pst3,pst4,pst5;
	//ctor
	public UserDaoImpl() throws SQLException{
		// 1. Invoke DButils' method to open cn
		connection=openConnection();
		//2. Create PST
		pst1=connection.prepareStatement("select * from users where role=?");
		System.out.println("user dao created !");
		//3.create pst2
		pst2=connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		//pst for changing password
		pst3=connection.prepareStatement("Update users set password=? where email=?");
		//pst 4 for deleting user details
		pst4=connection.prepareStatement("delete from users where id=?");
		//pst 5 for sigining in 
		pst5=connection.prepareStatement("select * from users where email=?");
	}
	//update users set email='Rishikesh@gmail.com' where email='rishikesh@gmail.com';

	@Override
	public List<User> fetchUserDetailsByRole(String role) throws SQLException {
		//0. create empty list
		List<User> users=new ArrayList<>();
		//1. set IN param
		pst1.setString(1, role);
		//2 exec query -> process RST
		try (ResultSet rst=pst1.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, 
			 * String email, String password, Date dob, boolean status,
			String userRole
			 */
			while(rst.next()) {
				users.add(new User(rst.getInt(1),rst.getString(2),
						rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8))
						);
			}
		}
		return users;//dao layer rets list of selected users --> Tester
	}
	
	//method for registering the user
	@Override
	public String registerVoter(User newVoter)throws SQLException{
		System.out.println("inside");
		pst2.setString(1,newVoter.getFirstName());
		pst2.setString(2,newVoter.getLastName());
		pst2.setString(3,newVoter.getEmail());
		pst2.setString(4,newVoter.getPassword());
		pst2.setDate(5,newVoter.getDob());
		pst2.setBoolean(6, newVoter.isStatus());
		pst2.setString(7, newVoter.getUserRole());
		
		int res=pst2.executeUpdate();
		if(res==1)
			return "Registered Successfully";
		
		return "Unsuccefull entery";
	}
	
	//method for cahnging the password
	@Override
	public String changePassword(String email,String op,String np)throws SQLException {
		
		pst3.setString(1,np);
		pst3.setString(2,email);
		int res=pst3.executeUpdate();
		
		if(res==1)
			return "Updated password succesfully";
		return "No such record found";
	}
	@Override
	public String deleteDetails(int id)throws SQLException{
		pst4.setInt(1, id);
		int res=pst4.executeUpdate();
		if(res==1) {
			return "Deleted Details";
		}
		return "No Such record Found";
	}
	
	 public User SignIn(String email,String password)throws SQLException{
		 User user=null;
		pst5.setString(1, email);
		try(ResultSet res=pst5.executeQuery();){
			
			while(res.next()) {
				user=new User();
				user.setUserId(res.getInt(1));
				user.setFirstName(res.getString(2));
				user.setLastName(res.getString(3));
				user.setEmail(res.getString(4));
				user.setPassword(res.getString(5));
				user.setDob(res.getDate(6));
				user.setStatus(res.getBoolean(7));
				user.setUserRole(res.getString(8));
			}
		}
		return user;
	}
	
	@Override
	public void cleanUp() throws SQLException {
		//close pst1
		if(pst1 != null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
		//close connection
		closeConnection();
		System.out.println("user dao cleaned up !");
		
	}
}
