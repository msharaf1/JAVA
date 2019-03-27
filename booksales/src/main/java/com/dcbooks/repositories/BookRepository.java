package com.dcbooks.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.dcbooks.models.BooksModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BooksModel, Long> {
    // List<BooksModel> findByCreatedAt(Date createdAt);
    Optional<BooksModel> findById(Long id);
        // this method retrieves all the books from the database
        List<BooksModel> findAll();
        // this method find a book by their description
        List<BooksModel> findByDescriptionContaining(String search);
        // this method counts how many titles contain a certain string
        Long countByTitleContaining(String search);
        // this method deletes a book that starts with a specific title
        Long deleteByTitleStartingWith(String search);
}