package com.cbooks.science.controllers;

import java.awt.print.Book;
import java.util.List;

import com.cbooks.science.models.BookModel;
import com.cbooks.science.repositories.BookRepo;
import com.cbooks.science.services.BookService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksAPI {

    private final BookService bookService;
    private BookRepo bR;
    ;
    public BooksAPI(BookService bookService, BookRepo bR){
        this.bookService = bookService;
        this.bR = bR;
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


    @RequestMapping(value="/api/books/{id}/delete", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
    }



    @RequestMapping(value="/api/books/{id}/update", method = RequestMethod.PUT)
    public void updatedBook(@PathVariable("id") Long id, BookModel book
        )
    {
        BookModel bId = bookService.findBook(id);
        if(bId != null){
            bR.save(book);
        }
    }
}