package com.library.LibraryManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.LibraryManagementSystem.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
