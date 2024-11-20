package com.cdac.ov.pages;

import static com.cdac.ov.dbutils.DButils.openConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.ov.Dao.UserDao;
import com.cdac.ov.Dao.UserDaoImpl;
import com.cdac.ov.pojo.User;


@WebServlet("/voter_register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
	
	public void init(ServletConfig config) throws ServletException {
		try {
			openConnection();
			userDao=new UserDaoImpl();
		}catch(Exception e) {
			throw new ServletException("Exception init of Registration",e);
		}
	}

	public void destroy() {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		try (PrintWriter pw=response.getWriter()){
			String fname=request.getParameter("fn");
			String lname=request.getParameter("ln");
			String email=request.getParameter("em");
			String pass=request.getParameter("pass");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			String dtpara=request.getParameter("dob");
			java.util.Date dt=sdf.parse(dtpara);
			java.sql.Date sqldt=new Date(dt.getTime());
			user.setFirstName(fname);
			user.setLastName(lname);
			user.setEmail(email);
			user.setPassword(pass);
			user.setDob(sqldt);
			String result=userDao.registerUser(user);
			pw.print("<h5>"+result+"</h5>");
			
		}catch(Exception e) {
			throw new ServletException("Exception in doPost of registration",e);
		}
	}

}
