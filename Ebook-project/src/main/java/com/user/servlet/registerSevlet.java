package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBconnect;
import com.entity.User;

@WebServlet("/register")
public class registerSevlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = req.getParameter("fname");
			String email = req.getParameter("email");
			String phoneno = req.getParameter("phno");
			String password = req.getParameter("pwd");
			String check = req.getParameter("check");
			
//			System.out.println(name+" "+email+" "+phoneno+" "+password+" "+check);
			
			HttpSession session = req.getSession();
			
			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhoneno(phoneno);
			us.setPassword(password);
			
			if(check!=null) {
			
				UserDAOImpl dao = new UserDAOImpl(DBconnect.getConn());
				boolean f = dao.userRegister(us);
				if(f) {
//					System.out.println("User Register Success");
					session.setAttribute("succMsg", "Registeration Success...");
					resp.sendRedirect("register.jsp");
				}
				else {
//					System.out.println("Something went wrong on the server TRY AGAIN....");
					session.setAttribute("failedMsg", "Something went wrong on the server TRY AGAIN....");
					resp.sendRedirect("register.jsp");
				}
			}
			else {
//				System.out.println("Please CHECK and AGREE terms and conditions!!");
				session.setAttribute("failedMsg", "Please CHECK and AGREE terms and conditions!!");
				resp.sendRedirect("register.jsp");
			}
		}
		catch(Exception e) {
			
		}
	}
	
}
