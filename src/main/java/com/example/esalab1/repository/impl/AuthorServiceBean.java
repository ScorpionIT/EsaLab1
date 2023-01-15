package com.example.esalab1.repository.impl;

import com.example.esalab1.model.Book;
import com.example.esalab1.model.Author;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.esalab1.repository.AuthorService;
import com.example.esalab1.utils.HibernateUtil;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class AuthorServiceBean implements AuthorService {

    public AuthorServiceBean() {

    }

    @Override
    public Author getById(UUID id) {
        Transaction transaction = null;
        Author author = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            author = session.get(Author.class, id);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return author;
    }

    @Override
    public List<Author> getAll() {
        Transaction transaction = null;
        List<Author> authorList = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            authorList = session.createQuery("FROM Author", Author.class)
                    .getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return authorList;
    }

    @Override
    public void create(Author author) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(author);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Author author) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.merge(author);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Author author) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.remove(author);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Book getLastBookByAuthor(Author author) {
        Transaction transaction = null;
        List<Book> bookList = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            bookList = session.createQuery("FROM Book WHERE author = :id", Book.class)
                    .setParameter("id", author.getId())
                    .getResultList();
            if (!bookList.isEmpty()) {
                bookList.sort(Comparator.comparing(o -> o.getPublishDate().toInstant().toEpochMilli()));
                transaction.commit();
                return bookList.get(0);
            }

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }
}