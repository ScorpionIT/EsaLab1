package com.example.esalab1.repository;

import com.example.esalab1.model.Author;
import com.example.esalab1.model.Book;

public interface AuthorService extends CRUDService<Author> {

    Book getLastBookByAuthor(Author author);
}