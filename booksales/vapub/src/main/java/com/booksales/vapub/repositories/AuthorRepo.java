package com.booksales.vapub.repositories;

import java.util.List;
import java.util.Optional;

import com.booksales.vapub.models.AuthorModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends CrudRepository<AuthorModel, Long>{
    Optional<AuthorModel> findById(Long id);
    List<AuthorModel> findAll();
}