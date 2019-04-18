package com.booksales.vapub.repositories;

import java.util.List;
import java.util.Optional;

import com.booksales.vapub.models.BookModels;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<BookModels, Long>{
    Optional<BookModels> findById(Long id);
    // List<BookModels> findById(Long id);
    List<BookModels> findAll();

}