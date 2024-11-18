package com.cdac.asgn2.dao;

import java.sql.SQLException;

public interface UserDao {
	String executeStoredProcedure(int x, int y, double z)throws SQLException;
	void cleanUp()throws Exception;
}
