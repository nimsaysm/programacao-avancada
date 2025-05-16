package br.uem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHelloWorld extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Starting...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello world!</h1>");
        out.close();
    }

    @Override
    public void destroy() {
        System.out.println("Destroying...");
        super.destroy();
    }
}