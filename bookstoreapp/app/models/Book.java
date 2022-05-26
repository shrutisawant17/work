package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book
{

    public int id;
    public String title;
    public String author;
    public int price;

    public Book()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public Book(int id, String title, String author, int price)
    {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static List<Book> books = new ArrayList<>();

    static
    {
        books.add(new Book(1, "java", "abc", 500));
        books.add(new Book(2, "c++", "xyz", 600));
    }

    public static List<Book> allBooks()
    {
        return books;
    }

    public static Book findById(int id)
    {
        for (Book book : books)
        {
            if (id == (book.id))
            {
                return book;
            }
        }
        return null;
    }

    public static void add(Book book)
    {
        books.add(book);
    }

    public static boolean remove(Book book)
    {
        return books.remove(book);
    }

}
