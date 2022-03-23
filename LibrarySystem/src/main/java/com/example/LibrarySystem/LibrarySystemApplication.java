package com.example.LibrarySystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.LibrarySystem.domain.Library;
import com.example.LibrarySystem.repository.LibraryRepository;

@SpringBootApplication

public  class LibrarySystemApplication implements CommandLineRunner
{

    public static void main(String[] args)
    {
        SpringApplication.run(LibrarySystemApplication.class, args);
    }
@Autowired
private LibraryRepository libraryRepository;
      
@Override
public void run (String...args)throws Exception
{
Library lib1= new Library ("secret","shruti");
libraryRepository.save(lib1);
  
Library lib2= new Library ("inferno","Danbrown");
libraryRepository.save(lib2);
}
}
