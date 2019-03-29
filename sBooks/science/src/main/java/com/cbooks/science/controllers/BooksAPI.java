package com.cbooks.science.controllers;

import java.util.List;

import com.cbooks.science.models.BookModel;
import com.cbooks.science.services.BookService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksAPI {

    private final BookService bookService;
    
    public BooksAPI(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/api/books")
    public List<BookModel> index() {
        return bookService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public BookModel create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        BookModel addBooks = new BookModel(title, desc, lang, numOfPages);
        return bookService.createBook(addBooks);
    }
    
    @RequestMapping("/api/books/{id}")
    public BookModel show(@PathVariable("id") Long id) {
        BookModel book = bookService.findBook(id);
        return book;
    }

    // @RequestMapping(value = "/api/books/{id}edit", method = RequestMethod.PUT)
    // public BookModel updateBook(@PathVariable("id") Long id, 
    // @RequestParam(value="title") String title, 
    // @RequestParam(value="description") String desc,
    // @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages){
    //     // BookModel bookModel = bookService.findBook(id);
        
    //     // bookModel.setTitle(title);
    //     // bookModel.setDescription(desc);
    //     // bookModel.setLanguage(lang);
    //     // bookModel.setNumberOfPages(numOfPages);
    //     // return bookModel;

    //     BookModel book = bookService.updateBook(id, title, desc, lang, numOfPages);
    //     return book;
    // }

    @RequestMapping(value="/api/books/{id}/delete", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
    }

}