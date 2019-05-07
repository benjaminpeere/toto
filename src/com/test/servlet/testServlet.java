package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "testServlet", urlPatterns = "/jenkins/job/toto/test")
public class testServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "Transmission de données à la vue";
        request.setAttribute("test", message);
        this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
    }

}
