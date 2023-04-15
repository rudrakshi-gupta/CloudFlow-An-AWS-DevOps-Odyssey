package com.Admin.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;


@WebServlet("/add_books")
public class BooksAdd extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String bookname=req.getParameter("bname");
			String authorname = req.getParameter("author");
			Double price = Double.parseDouble(req.getParameter("categories"));
			String categories = req.getParameter("btype");
			String status=  req.getParameter("status");
			Part part = req.getPart("bimg");
			String fileName = part.getSubmittedFileName();
			
			Book b = new BookDetails();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
