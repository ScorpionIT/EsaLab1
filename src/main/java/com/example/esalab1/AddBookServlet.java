package com.example.esalab1;

import com.example.esalab1.model.Author;
import com.example.esalab1.model.Book;
import com.example.esalab1.services.AuthorService;
import com.example.esalab1.services.BookService;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "addBookServlet", value = "/addBook-servlet")
public class AddBookServlet extends HttpServlet {
    @EJB
    AuthorService authorService;
    @EJB
    BookService bookService;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Book book = new Book();

        book.setName(request.getParameter("book_name"));

        String surname = request.getParameter("author");
        Author author = authorService.getAuthorBySurname(surname);
        book.setAuthor(author);

        book.setPublishDate(Date.valueOf(request.getParameter("publish")));

        book.setPageCount(Integer.valueOf(request.getParameter("num_of_pages")));

        bookService.save(book);

        response.sendRedirect("index.jsp");

    }

    public void destroy() {
    }
}