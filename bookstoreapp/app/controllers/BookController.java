package controllers;

import java.util.List;
import javax.inject.Inject;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import java.util.Set;
import models.Book;
import play.mvc.Controller;
import play.api.i18n.I18nSupport;
import play.mvc.Result;
import views.html.*;

public class BookController extends Controller
{

    @Inject
    FormFactory formFactory;

    public Result index1()
    {
        List<Book> books = Book.allBooks();
        return ok(index1.render(books));

    }

    public Result create()
    {

        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm));

    }

    public Result save()
    {
        Form<Book> bookForm = formFactory.form(Book.class);
        Book book = bookForm.get();
        Book.add(book);
        return redirect(routes.BookController.index1());
    }

    public Result edit(Integer id)
    {
        Book book = Book.findById(id);
        if (book == null)
        {
            return notFound("Book Not Found");
        }
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(edit.render(bookForm));
    }

    public Result update()
    {
        Form<Book> bookForm = formFactory.form(Book.class);
        Book oldbook = Book.findById(book.id);
        if (oldbook == null)
        {
            return notFound("Book Not Found");
        }
        oldbook.title=book.title;
        oldbook.author=book.author;
        oldbook.price=book.price;
             
        return redirect(routes.BookController.index1());
    }

    public Result destroy(Integer id)
    {
        return null;
    }

    public Result show(Integer id)
    {
        return null;
    }
}
