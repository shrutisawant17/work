package com.example.LibrarySystem.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String bookname;
    private String author;
    public Library()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public Library(Long id, String bookname, String author)
    {
        super();
        this.id = id;
        this.bookname = bookname;
        this.author= author;
       
    }
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getBookname()
    {
        return bookname;
    }
    public void setBookname(String bookname)
    {
        this.bookname = bookname;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setCourse(String author)
    {
        this.author = author;
    }
   
    
    
    
}
