package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet. annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {

            String email=req.getParameter("email");
            String password=req.getParameter("password");

            if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
              resp. sendRedirect("admin/home.jsp");
            } else {
              resp.sendRedirect ("home.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 