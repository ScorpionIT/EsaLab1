package com.example.esalab1.repository;

import com.example.esalab1.model.Book;

import java.util.List;
import java.util.UUID;

public interface BookRepository {

    void save(Book book);

    Book getBookById(UUID id);

    List<Book> getAll();

    Book getBookByName(String name);

    void delete(Book book);
}
