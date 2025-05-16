package br.uem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletSendEmail extends HttpServlet {
    private String email;

    // Overrides init, setting the email param
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        email = config.getInitParameter("email");
    }

    @Override
    // Overrides doGet function
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>Sending email...</h1>");
        out.println("<h1>Email sent to " + email + "</h1>");
        out.close();
    }
}
