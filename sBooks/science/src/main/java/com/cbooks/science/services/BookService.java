package com.cbooks.science.services;

import java.util.List;
import java.util.Optional;

import com.cbooks.science.models.BookModel;
import com.cbooks.science.repositories.BookRepo;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepo bookRepo;
    
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    // returns all the books
    public List<BookModel> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public BookModel createBook(BookModel newBook) {
        return bookRepo.save(newBook);
    }
    // retrieves a book
    public BookModel findBook(Long id) {
        Optional<BookModel> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public void deleteBook(Long id) {
        bookRepo.deleteById(id);
	}
    
    public void updatedBook(BookModel book) {
        bookRepo.save(book);
    }
	// public BookModel updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    //     id = updatedBook();
        
    //     return BooKModel;
	// }
    
    
}
