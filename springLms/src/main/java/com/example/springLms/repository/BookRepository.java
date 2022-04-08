package com.example.springLms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springLms.model.Book;
import com.example.springLms.model.Category;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	public Book findByTag(String tag);
	public List<Book> findByCategory(Category category);
	public List<Book> findByCategoryAndStatus(Category category, Integer status);
	public Long countByStatus(Integer status);
}
