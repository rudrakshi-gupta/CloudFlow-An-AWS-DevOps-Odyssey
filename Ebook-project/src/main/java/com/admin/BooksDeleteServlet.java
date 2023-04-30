package com.admin.servlet;
-import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet. annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class Books DeleteServlet extends HttpServlet{

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try {
            int id=Integer.parseInt(req.getParameter("id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}