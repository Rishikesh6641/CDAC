package com.cdac.ov.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//
//	public void init(ServletConfig config) throws ServletException {
//		
//	}

//	public void destroy() {
//		
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter()){
			Cookie[] cookie=request.getCookies();
			if(cookie!=null) {
				for(Cookie c:cookie) {
					if(c.getName().equals("userdetail")) {
						pw.print("<h5>"+c.getValue()+"</h5>");
					}else {
						pw.print("<h5>Sorry no cookies for you<h5>");
					}
				}
			}
			pw.print("<h5></h5>");
		}
	}
}
