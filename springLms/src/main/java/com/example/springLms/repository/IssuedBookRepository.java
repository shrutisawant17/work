package com.example.springLms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springLms.model.Book;
import com.example.springLms.model.IssuedBook;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Long> {
	public Long countByBookAndReturned(Book book, Integer returned);
}
