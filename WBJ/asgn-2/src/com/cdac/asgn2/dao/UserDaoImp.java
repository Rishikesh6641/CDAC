package com.cdac.asgn2.dao;

import static com.cdac.asgn2.DButils.DButils.*;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class UserDaoImp implements UserDao{

	private Connection connection;
	private CallableStatement cst;
	
	public UserDaoImp()throws SQLException{
		
		connection=openConnection();
		//String qry="{? =call transfer_funds_func(?,?,?)}";
		cst=connection.prepareCall("{? =call transfer_funds_func(?,?,?)}");
		cst.registerOutParameter(1,Types.DOUBLE);
	}
	@Override
	public String executeStoredProcedure(int x, int y, double z) throws SQLException {
		cst.setInt(2, x);
		cst.setInt(3, y);
		cst.setDouble(4, z);
		cst.execute();
		return "Out Put:"+cst.getDouble(1);
	}

	@Override
	public void cleanUp() throws SQLException{
		cst.close();
		closeConnection();
	}
	
}
