package com.booksales.vapub.services;

import java.util.List;

import com.booksales.vapub.models.AuthorModel;
import com.booksales.vapub.repositories.AuthorRepo;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private AuthorRepo aRepo;

    public AuthorService(AuthorRepo aRepo){
        this. aRepo = aRepo;
    }

    public List<AuthorModel> findAll(){
        return (List<AuthorModel>) aRepo.findAll();
    }

    public AuthorModel addAuthor(AuthorModel author){
        return aRepo.save(author);
    }
}