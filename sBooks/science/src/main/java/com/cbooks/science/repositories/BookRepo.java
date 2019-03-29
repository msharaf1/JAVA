package com.cbooks.science.repositories;

import java.util.List;
import java.util.Optional;

import com.cbooks.science.models.BookModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// @Repository
// public interface BookRepo extends CrudRepository<BookModel, Long>{

// }

@Repository
public interface BookRepo extends CrudRepository<BookModel, Long> {
    // this method retrieves all the books from the database
    List<BookModel> findAll();

    // this method find a book by their description
    List<BookModel> findByDescriptionContaining(String search);

    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);

    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);

    Optional<BookModel> findById(Long id);
    
}
