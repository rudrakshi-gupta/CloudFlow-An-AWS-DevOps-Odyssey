package com.DAO;

public class BookDAOImpl {
	public BookDtls getBookByID(int id) {
		BookDtls b = null;
		try {
			String sql = "select * from book_dtls where bookId=?";
			PreparedStatement ps = 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
