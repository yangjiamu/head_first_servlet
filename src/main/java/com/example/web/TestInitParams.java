package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class TestInitParams extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Enumeration<String> e = getServletContext().getInitParameterNames();
        while (e.hasMoreElements()){
            out.println("<br>param name = " + e.nextElement() + "<br>");
        }
        out.println("main email is: " + getServletContext().getInitParameter("mainEmail"));
        out.println("<br>");
        out.println("admin email is: " + getServletContext().getInitParameter("adminEmail"));
    }
}
