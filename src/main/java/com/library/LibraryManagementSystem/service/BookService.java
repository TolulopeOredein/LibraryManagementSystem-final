package com.library.LibraryManagementSystem.service;
import java.util.List;
import com.library.LibraryManagementSystem.entity.Book;

public interface BookService {

	    // specify Service methods

		public List<Book> findAll();
		
		public Book findById(int theId);
		
		public void save(Book theBook);
		
		public void deleteById(int theId);
		
	

}
