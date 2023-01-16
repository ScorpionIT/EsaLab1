package com.example.esalab1.services;

import com.example.esalab1.model.Book;

import java.util.List;
import java.util.UUID;

public interface BookService {
    Book getBookById(UUID id);

    void save(Book book);

    List<Book> getAll();

    Book getBookByName(String name);

    void delete(Book book);
}
