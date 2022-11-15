package org.hcltraining.librarymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.hcltraining.librarymanagement.dto.Book;
import org.hcltraining.librarymanagement.dto.BorrowBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	

	public Book addBook(Book book) {
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(book);
	entityTransaction.commit();
	return entityManager.find(Book.class, book.getBookId());
	}
	
	public void getBorrowBookbyId(int bookid,int userid ) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		TypedQuery<BorrowBook> query = entityManager.createQuery("select bb from BorrowBook bb where bb.userId = ?1 and bb.bookId = ?2", BorrowBook.class);
		BorrowBook book = query.setParameter(1, userid).setParameter(2, bookid).getSingleResult();
		if(book!=null) {
			String status="book returned successfuly";
			book.setStatus(status);
			entityTransaction.begin();
			entityManager.persist(book);
			entityTransaction.commit();
			
		}
		
	}

}
