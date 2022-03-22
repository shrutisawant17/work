package com.example.LibrarySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LibrarySystem.domain.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
 
}