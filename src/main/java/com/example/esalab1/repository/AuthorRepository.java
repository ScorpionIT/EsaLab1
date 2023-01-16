package com.example.esalab1.repository;

import com.example.esalab1.model.Author;

import java.util.List;
import java.util.UUID;

public interface AuthorRepository {
    void save(Author author);

    Author getAuthorById(UUID id);

    Author getAuthorBySurname(String surname);

    List<Author> getAll();
}
