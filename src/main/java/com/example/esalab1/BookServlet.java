package com.example.esalab1;

import com.example.esalab1.model.Book;
import com.example.esalab1.services.BookService;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "bookServlet", value = "/book-servlet")
public class BookServlet extends HttpServlet {
    private List<Book> bookList;

    @EJB
    BookService bookService;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        bookList = bookService.getAll();

        // Printing all authors
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (Book book : bookList) {
            out.println("<h1>" + book.getName() + "</h1>");
        }
        out.println("</body></html>");

    }

    public void destroy() {
    }
}