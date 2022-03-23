package com.example.LibrarySystem.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Library
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "bookname", nullable = false)
    private String bookname;

    @Column(name = "author")
    private String author;

    public Library()
    {
    }

    public Library(String bookname, String author)
    {
        super();

        this.bookname = bookname;
        this.author = author;

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

    public void setAuthor(String author)
    {
        this.author = author;
    }

    

}
