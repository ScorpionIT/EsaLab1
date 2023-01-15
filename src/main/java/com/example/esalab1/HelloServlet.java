package com.example.esalab1;

import com.example.esalab1.model.Author;
import com.example.esalab1.repository.AuthorService;
import com.example.esalab1.repository.impl.AuthorServiceBean;

import java.io.*;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "authorServlet", value = "/author-servlet")
public class HelloServlet extends HttpServlet {
    private List<Author> authorList;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        AuthorServiceBean authorService = new AuthorServiceBean();
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