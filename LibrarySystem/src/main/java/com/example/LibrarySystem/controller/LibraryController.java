package com.example.LibrarySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.LibrarySystem.domain.Library;
import com.example.LibrarySystem.service.LibraryService;

@Controller
public class LibraryController
{
    @Autowired

    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService)
    {
        super();
        this.libraryService = libraryService;
    }

    @GetMapping("/book")
    public String listbook(Model model)
    {
        int b = 20;
        model.addAttribute("book", libraryService.getAllLibrary());
        return "book";
    }

    @GetMapping("/book/new")
    public String createLibaryForm(Model model)
    {
        int a = 10;
        Library library = new Library();
        model.addAttribute("library", library);
        return "createbook";

    }

    @PostMapping("/book")
    public String saveLibrary(@ModelAttribute("library") Library library)
    {
        libraryService.saveLibrary(library);
        return "redirect:/book";
    }

    @GetMapping("/book/edit/{id}")
    public String editLibraryForm(@PathVariable Long id, Model model)
    {
        model.addAttribute("library", libraryService.getLibraryById(id));
        return "editbook";
    }

    @PostMapping("/book/{id}")
    public String updateLibrary(@PathVariable Long id, @ModelAttribute("library") Library library, Model model)
    {

        Library existingLibrary = libraryService.getLibraryById(id);
        existingLibrary.setId(id);
        existingLibrary.setBookname(library.getBookname());
        existingLibrary.setAuthor(library.getAuthor());
        libraryService.updateLibrary(existingLibrary);
        return "redirect:/book";
    }

    @PostMapping(value = "/book/save")
    public String saveBook(@ModelAttribute("book") Library book)
    {

        libraryService.saveLibrary(book);
        return "redirect:/book";
    }

    @GetMapping("/book/{id}")
    public String deleteLibrary(@PathVariable Long id)
    {
        libraryService.delete(id);
        return "redirect:/book";
    }

}