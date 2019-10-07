package com.cbooks.science.controllers;

import javax.validation.Valid;

import com.cbooks.science.models.BookModel;
import com.cbooks.science.services.BookService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    private BookService bookServ;
    public HomeController(BookService bookServ){
        this.bookServ = bookServ;
    }
    
    @GetMapping(value="/home")
    public String showHome(Model model) {
        model.addAttribute("bookList", bookServ.allBooks());
        return "index";
    }

    @GetMapping("/home/new")
    public String addBookToLibraryGet(@ModelAttribute("bookObj") BookModel book){
        return "newBook";
    }
    @PostMapping("/home/new")
    public String addBookToLibrary(@Valid @ModelAttribute("bookObj") BookModel book, BindingResult result){
        if(result.hasErrors()){
            return "newBook";
        }else{
            bookServ.createBook(book);
            return "redirect:/home";
        }
    }
    
}