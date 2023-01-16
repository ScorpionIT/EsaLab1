package com.example.esalab1.services.impl;

import com.example.esalab1.model.Book;
import com.example.esalab1.repository.BookRepository;
import com.example.esalab1.services.BookService;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import java.util.List;
import java.util.UUID;

@Singleton
public class BookServiceImpl implements BookService {

    @EJB
    private BookRepository bookRepository;


    @Override
    public Book getBookById(UUID id) {
        return bookRepository.getBookById(id);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book getBookByName(String name) {
        return bookRepository.getBookByName(name);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }
}
