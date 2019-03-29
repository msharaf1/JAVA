package com.cbooks.science.repositories;

import java.lang.StackWalker.Option;
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
    // List<BookModel> deleteBook
    Optional<BookModel> findById(Long id);

    // this method find a book by their description
    List<BookModel> findByDescriptionContaining(String search);

    // this method counts how many titles contain a certain string
    String countByTitleContaining(String search);

    // this method deletes a book that starts with a specific title
    String deleteByTitleStartingWith(String search);

    Long deleteById(long id);

    // Long updateById(Long id);

    

}
