package com.library.LibraryManagementSystem.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.LibraryManagementSystem.entity.Book;
import com.library.LibraryManagementSystem.service.BookService;


@Controller
@RequestMapping("/books")
public class BookController {
	
	private BookService bookService;
	
	public BookController(BookService thebookService) {
		this.bookService = thebookService;
		
	}
     
     @GetMapping("/showFormForAdd")
 	public String showFormForAdd(Model theModel) {
 		
 		Book theBook = new Book();
 		
 		theModel.addAttribute("book", theBook);
 		
 		return "books/book-form";
 	}
 	@PostMapping("/save")
 	public String saveEmployee(@ModelAttribute("book") Book theBook){
 		bookService.save(theBook);
 		
 		//save and return to list of books
 		return "redirect:/books/list";
 		
 	}
 	
 	@GetMapping("/list")
	 public String listBooks(Model theModel) {
		 
		 List<Book>theBooks = bookService.findAll();
		 theModel.addAttribute("books", theBooks);
		 
		 //list of books
		 return "/books/list-of-books";
	 }
 	
 	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId") int theId, Model theModel) {
		
		//get book from the service
		Book theBook = bookService.findById(theId);
		
		// set book as a model attribute to pre-populate the form
            theModel.addAttribute("book", theBook);
		
		// send over to form
		
		return "books/book-form";
	}
 	
 	@GetMapping("/getBookById")
	public String getBookById(@RequestParam("bookId") int theId, Model theModel) {
		
		//get book from the service
		Book theBook = bookService.findById(theId);
		
		//create a model attribute
            theModel.addAttribute("book", theBook);
		
		// send over to our form
		
		return "books/book-by-id";
	}
 	
 	@GetMapping("/delete")
	public String delete(@RequestParam("bookId") int theId) {
		
		// delete the book
		bookService.deleteById(theId);
		
		// redirect to books/list
		return "redirect:/books/list";
	}
 	
}
