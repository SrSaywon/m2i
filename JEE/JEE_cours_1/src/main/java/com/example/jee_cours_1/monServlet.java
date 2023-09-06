package com.example.jee_cours_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "monServlet", value = "/monServlet")
public class monServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("monServlet est lancé");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Requête GET envoyé à /monServlet!");

        resp.setContentType("text/plain");

        PrintWriter writer = resp.getWriter();

        writer.println("La réponse du servlet monServlet");
    }

    @Override
    public void destroy() {
            System.out.println("mon servlet est détruit");

    }
}
