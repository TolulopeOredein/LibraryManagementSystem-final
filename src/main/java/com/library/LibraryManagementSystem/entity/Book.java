package com.library.LibraryManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="books")
public class Book {
	
	//annotate fields to persist on database
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="author")
	private String author;
	
	@Column(name="ISBN")
	private String isbn;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="country")
	private String Country;
	
	@Column(name="gender")
	private String Gender;

	// create a no-arg. Constructor
	
	public Book() {
		super();
	}
     
	//Generate constructor using fields
	
	public Book(int id, String author, String isbn, String publisher, String country, String gender) {
		super();
		this.id = id;
		this.author = author;
		this.isbn = isbn;
		this.publisher = publisher;
		Country = country;
		Gender = gender;
	}
     
	//generate Setters and getters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
	
	//Generate ToString for debugging purpose

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", isbn=" + isbn + ", publisher=" + publisher + ", Country="
				+ Country + ", Gender=" + Gender + "]";
	}
	
	
	
	

}
