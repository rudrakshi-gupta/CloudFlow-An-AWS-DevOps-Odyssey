package com.DAO;

import java.util.List;

import com.entity.BookDtls;

public interface BookDAO {
	public boolean addBooks(BookDtls b);
<<<<<<< HEAD
	
=======
>>>>>>> 8924a61e19bf6d666a0988be834ce640e3c3b78b
	public List<BookDtls> getAllBooks();

	public BookDtls getBook ById(int id);

	public boolean updateEditBooks(int id);

	public boolean deleteBooks(int id);
}
