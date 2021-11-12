package com.library.LibraryManagementSystem.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.LibraryManagementSystem.dao.BookRepository;
import com.library.LibraryManagementSystem.entity.Book;

@Service
public class BookServiceImpl implements BookService {
	// inject repository 
	private BookRepository bookRepository;

		@Autowired
		public BookServiceImpl(BookRepository theBookRepository) {
			bookRepository = theBookRepository;
		}
		
		// implement methods from BookService
		
		@Override
		public List<Book> findAll() {
			return bookRepository.findAll();
		}

		@Override
		public Book findById(int theId) {
			Optional<Book> result = bookRepository.findById(theId);
			
			Book theBook = null;
			
			if (result.isPresent()) {
				theBook = result.get();
			}
			else {
				// we didn't find the book
				throw new RuntimeException("Did not find Book id - " + theId);
			}
			
			return theBook;
		}

		@Override
		public void save(Book theBook) {
			bookRepository.save(theBook);
		}

		@Override
		public void deleteById(int theId) {
			bookRepository.deleteById(theId);
		}

	}









