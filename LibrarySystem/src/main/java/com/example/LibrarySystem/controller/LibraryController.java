package com.example.LibrarySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.LibrarySystem.domain.Library;
import com.example.LibrarySystem.service.LibraryService;

@Controller 
public class LibraryController
{
    @Autowired
    private LibraryService service;
 
   @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Library> listbook = service.listAll();
        model.addAttribute("listbook", listbook);
        System.out.print("Get / ");
        return "index";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        Library lib = new Library();
        model.addAttribute("library",lib);
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savebook(@ModelAttribute("Library") Library std) {
        service.save(std);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditbookPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Library std = service.get(id);
        mav.addObject("Library", std);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deletebook(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
