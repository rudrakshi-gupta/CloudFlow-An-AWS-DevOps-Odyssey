package com.DAO;

import com.entity.BookDtls;

public interface BookDAO {
	public boolean addBooks(BookDtls b);
	
	
	public BookDtls getAllBooks();
}
