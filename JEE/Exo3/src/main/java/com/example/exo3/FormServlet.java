package com.example.exo3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "formServlet", value = "/form")
public class FormServlet extends HttpServlet {

    private List<AnimalsObject> animals;

    @Override
    public void init() throws ServletException {
        animals =new ArrayList<>();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/addAnimal.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        String espece = req.getParameter("espece");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String nom = req.getParameter("nom");
        String couleur = req.getParameter("couleur");

        System.out.printf("Type: %s, Espèce: %s, Age: %d, Nom: %s, Couleur: %s ", type, espece, age, nom, couleur );

        req.setAttribute("type", "");
        req.setAttribute("espece", "");
        req.setAttribute("age", "");
        req.setAttribute("name", "");
        req.setAttribute("color", "");
        req.setAttribute("animals", animals);

        getServletContext().getRequestDispatcher("/WEB-INF/addAnimal.jsp").forward(req,resp);

    }
}
