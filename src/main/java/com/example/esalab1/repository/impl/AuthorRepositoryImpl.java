package com.example.esalab1.repository.impl;

import com.example.esalab1.model.Author;
import com.example.esalab1.repository.AuthorRepository;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Singleton
@Transactional
public class AuthorRepositoryImpl implements AuthorRepository {
    @PersistenceContext(unitName = "testUnit")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Author author) {
        if (author.getId() != null) {
            entityManager.merge(author);
            return;
        }
        entityManager.persist(author);
    }

    @Override
    public Author getAuthorById(UUID id) {
        return entityManager.find(Author.class, id);
    }

    @Override
    public Author getAuthorBySurname(String surname) {
        return entityManager.createQuery(
                "select author from Author author where author.surname =:surname ",
                Author.class).setParameter("surname", surname).getSingleResult();
    }

    @Override
    public List<Author> getAll() {
        return entityManager.createQuery("select author from Author author ", Author.class).
                getResultList();
    }
}
