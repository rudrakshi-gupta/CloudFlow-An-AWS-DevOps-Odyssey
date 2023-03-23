package com.DAO;

import java.util.List;

public interface BookDAO {
	public boolean addBooks(BookDtls b);
	public List<BookDtls> getAllBooks();
	public BookDtls getBookByID(int id);
}
