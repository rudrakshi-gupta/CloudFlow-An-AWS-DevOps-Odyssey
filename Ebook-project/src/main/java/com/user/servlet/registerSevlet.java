package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			
			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhoneno(phoneno);
			us.setPassword(password);
			
			UserDAOImpl dao = new UserDAOImpl(DBconnect.getConn());
		}
		catch(Exception e) {
			
		}
	}
	
}
