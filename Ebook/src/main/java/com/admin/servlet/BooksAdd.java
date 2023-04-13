package com.admin.servlet;

import java.io.File;
import java.io.IOException;

import com.DAO.BookDAOImpl;
import com.DB.BookDtls;
import com.DB.DBconnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
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
			
			BookDtls b = new BookDtls();
			
			BookDAOImpl dao = new BookDAOImpl(DBconnect.getConn());

			
			boolean f = dao.addBooks(b);
			
			HttpSession session = req.getSession();
			if(f) {
				
				String path = getServletContext().getRealPath("") + "book";
				
				File file = new File(path);
				part.write(path + File.separator+ fileName);
				
				
				session.setAttribute("succMsg", "Book Add Successfully");
				resp.sendRedirect("admin/add_books.jsp");
			}else {
				session.setAttribute("failedMsg", "Something wrong on server");
				resp.sendRedirect("admin/add_books.jsp");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
