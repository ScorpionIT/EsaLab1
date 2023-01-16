package com.example.esalab1.services;

import com.example.esalab1.model.Author;

import java.util.List;
import java.util.UUID;

public interface AuthorService {

    Author getAuthorById(UUID id);

    void save(Author author);

    Author getAuthorBySurname(String surname);

    List<Author> getAll();
}
