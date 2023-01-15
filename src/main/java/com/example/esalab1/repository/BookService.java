package com.example.esalab1.repository;


import com.example.esalab1.model.Book;
import com.example.esalab1.model.Author;

import java.util.List;

public interface BookService extends CRUDService<Book> {

    List<Book> getBookListByAuthor(Author author);
}
