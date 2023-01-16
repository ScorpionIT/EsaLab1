package com.example.esalab1.services.impl;

import com.example.esalab1.model.Author;
import com.example.esalab1.repository.AuthorRepository;
import com.example.esalab1.services.AuthorService;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import java.util.List;
import java.util.UUID;

@Singleton
public class AuthorServiceImpl implements AuthorService {
    @EJB
    private AuthorRepository authorRepository;


    @Override
    public Author getAuthorById(UUID id) {
        return authorRepository.getAuthorById(id);
    }

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author getAuthorBySurname(String surname) {
        return authorRepository.getAuthorBySurname(surname);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.getAll();
    }
}
