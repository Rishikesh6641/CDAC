package com.cdac.ov.pages;

import static com.cdac.ov.dbutils.DButils.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.ov.Dao.UserDao;
import com.cdac.ov.Dao.UserDaoImpl;
import com.cdac.ov.pojo.User;

@WebServlet("/login")
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println("Init");
			openConnection();
			userDao=new UserDaoImpl();
		}catch(Exception e) {
			throw new ServletException("Exception in init",e);
		}
	}

	public void destroy() {
		try {
			closeConnection();
		}catch(Exception e){
			throw new RuntimeException("Exception in dstry",e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter pw=response.getWriter()){
			String email=request.getParameter("em");
			String pass=request.getParameter("pass");
			
			User user=userDao.authenticateUser(email, pass);
			
			if(user==null) {
				pw.print("<h5>Invalid Password or Username Please try again<a href='login'>Retry</a></h5>");
			}else {
				System.out.println("Prog reached here1");
				Cookie cookie=new Cookie("userdetail",user.toString());
				response.addCookie(cookie);
				
				if(user.getUserRole().equals("admin")) {
					response.sendRedirect("Admin");
				}else {
					if(user.isStatus()) {
						response.sendRedirect("logout");
					}else {
						System.out.println("Prog reached here4");
						response.sendRedirect("candiateList");
					}
				}
			}
		}catch(Exception e) {
			throw new ServletException("Exception in doPost",e);
		}
	}

}
