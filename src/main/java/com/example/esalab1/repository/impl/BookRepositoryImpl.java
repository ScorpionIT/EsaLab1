package com.example.esalab1.repository.impl;

import com.example.esalab1.model.Book;
import com.example.esalab1.repository.BookRepository;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Singleton
@Transactional
public class BookRepositoryImpl implements BookRepository {

    @PersistenceContext(unitName = "testUnit")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Book book) {
        if (book.getId() != null) {
            entityManager.merge(book);
            return;
        }
        entityManager.persist(book);
    }

    @Override
    public Book getBookById(UUID id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public List<Book> getAll() {
        return entityManager.createQuery("select book from Book book ", Book.class).
                getResultList();
    }

    @Override
    public Book getBookByName(String name) {
        return entityManager.createQuery("select book from Book book where book.name = :name ", Book.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void delete(Book book) {
        entityManager.remove(entityManager.contains(book) ? book : entityManager.merge(book));
    }
}
