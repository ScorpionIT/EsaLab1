package com.example.esalab1;

import com.example.esalab1.model.Author;
import com.example.esalab1.services.AuthorService;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "authorServlet", value = "/author-servlet")
public class HelloServlet extends HttpServlet {
    private List<Author> authorList;
    @EJB
    AuthorService authorService;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        authorList = authorService.getAll();

        // Printing all authors
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (Author author : authorList) {
            out.println("<h1>" + author.getSurname() + "</h1>");
        }
        out.println("</body></html>");

    }

    public void destroy() {
    }
}