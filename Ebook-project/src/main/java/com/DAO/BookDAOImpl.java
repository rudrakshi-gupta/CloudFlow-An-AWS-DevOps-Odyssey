package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.BookDtls;

public class BookDAOImpl implements BookDAO{
	
	private Connection conn;
	
	public BookDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addBooks(BookDtls b) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			String sql = "insert into book_dtls(bookname, author, price, bookCategory, status, photo, user_email) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getAuthor());
			ps.setString(3, b.getPrice());
			ps.setString(4, b.getBookCategory());
			ps.setString(5, b.getStatus());
			ps.setString(6, b.getPhotoname());
			ps.setString(7, b.getEmail());
			
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return false;
	}

	public List<BookDtls> getAllBooks{
        
	    List<BookDtls> list = new ArrayList<BookDtls>();
		BookDtls b=null;

		try{
			String sql="select * from book_dtls";
			PreparedStatement ps=conn.prepareStatement(sql);

			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				b=new BookDtls();
				b.setBookId(rs.getInt(1));
				b.setBookName(rs.getString(2));
				b.setAuthor(rs.getString(3));
				b.setPrice(rs.getString(4));
				b.setBookCategory(rs.getString(5));
				b.setStatus(rs.getString(6));
				b.setPhotoname(rs.getString(7));
				b.setEmail(rs.getString(8));
				list.add(b);

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;

	}

	@Override
	public List<BookDtls> getAllBooks() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAllBooks'");
	}
}
