package com.DAO;

import com.entity.BookDtls;

public interface BookDAO {
	public boolean addBooks(BookDtls b);
	
	public List<BookDtls> getAllBooks();

	public BookDtls getBook ById(int id);

	public boolean updateEditBooks(int id);

	public boolean deleteBooks(int id);
}
