package com.example.esalab1;

import com.example.esalab1.model.Book;
import com.example.esalab1.services.BookService;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "deleteBookServlet", value = "/deleteBook-servlet")
public class DeleteBookServlet extends HttpServlet {
    private List<Book> bookList;

    @EJB
    BookService bookService;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Book book = bookService.getBookByName(request.getParameter("name"));
        bookService.delete(book);
        response.sendRedirect("index.jsp");
    }

    public void destroy() {
    }
}
