package com.example.jee_cours_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "monServletAvecJsp", value = "/monservlet-jsp")
public class MonServletAvecJsp extends HttpServlet {

    private String prenom;
    private String prenoms;

    @Override
    public void init() throws ServletException {
        prenom = "Jhon";

        prenoms = new ArrayList<>();
        prenoms.add("jack");
        prenoms.add("martin");
        prenoms.add("franck");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("blabla", prenom);
        req.setAttribute("prenomB", prenom);
        req.setAttribute("prenoms", prenoms);

        getServletContext().getRequestDispatcher("/test-01.jsp").forward(req, resp);
    }
}
