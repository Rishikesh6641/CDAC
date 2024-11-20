package com.cdac.ov.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.cdac.ov.dbutils.DButils.*;
import com.cdac.ov.pojo.User;

public class UserDaoImpl implements UserDao {
	
	private PreparedStatement pst,pst1;
	private Connection connection;
	
	public UserDaoImpl()throws SQLException{
		connection=getConnection();
		pst=connection.prepareStatement("select * from users where email=? and password=?");
		pst1=connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
	}
	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		pst.setString(1,email);
		pst.setString(2, password);
		
		try(ResultSet rst = pst.executeQuery()){
			
			if(rst.next()) {
				return new User(rst.getInt(1),rst.getString(2),
						rst.getString(3),rst.getString(4),rst.getString(5),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8));
			}
		}
		return null;
	}
	
	@Override
	public String registerUser(User newVoter) throws SQLException {
		pst1.setString(1,newVoter.getFirstName());
		pst1.setString(2,newVoter.getLastName());
		pst1.setString(3,newVoter.getEmail());
		pst1.setString(4,newVoter.getPassword());
		pst1.setDate(5,newVoter.getDob());
		pst1.setBoolean(6, newVoter.isStatus());
		pst1.setString(7, newVoter.getUserRole());
		
		int res=pst1.executeUpdate();
		if(res==1)
			return "Registered Successfully";
		
		return "Unsuccefull entery";
		
	}

	@Override
	public void cleanUp() throws SQLException {
		pst.close();
		closeConnection();
	}
	
}
