package org.hcltraining.librarymanagement.service;

import org.hcltraining.librarymanagement.dao.LibraryDao;
import org.hcltraining.librarymanagement.dto.Book;
import org.hcltraining.librarymanagement.dto.BorrowBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	@Autowired
	LibraryDao libraryDao;
	public Book addBook(Book book) {
		return libraryDao.addBook(book);
	}
	
	public void returnBorrowBook(int bookid,int userid) {
		libraryDao.getBorrowBookbyId(bookid, userid);
	}


}
