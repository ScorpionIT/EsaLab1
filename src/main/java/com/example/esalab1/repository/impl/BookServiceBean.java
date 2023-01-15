package com.example.esalab1.repository.impl;

import com.example.esalab1.model.Book;
import com.example.esalab1.model.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.esalab1.repository.BookService;
import com.example.esalab1.utils.HibernateUtil;

import java.util.List;
import java.util.UUID;

public class BookServiceBean implements BookService {

    public BookServiceBean() {

    }

    @Override
    public Book getById(UUID id) {
        Transaction transaction = null;
        Book book = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            book = session.get(Book.class, id);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public List<Book> getAll() {
        Transaction transaction = null;
        List<Book> bookList = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            bookList = session.createQuery("FROM Book", Book.class)
                    .getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public void create(Book book) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(book);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Book book) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.merge(book);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Book book) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.remove(book);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<Book> getBookListByAuthor(Author author) {
        Transaction transaction = null;
        List<Book> bookList = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            bookList = session.createQuery("FROM Book WHERE author = :id", Book.class)
                    .setParameter("id", author.getId())
                    .getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return bookList;
    }
}
