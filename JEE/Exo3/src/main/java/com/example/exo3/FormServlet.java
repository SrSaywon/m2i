package com.example.exo3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.invoke.StringConcatFactory;



@WebServlet(name = "formServlet", value = "/form")
public class FormServlet extends HttpServlet {

    private String myInitParametre;

    @Override
    public void init() throws ServletException {
        myInitParametre = getServletContext().getInitParameter("haha");
        System.out.println(myInitParametre);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = "add";
        if(!req.getParameter("mode").isBlank()){
            mode = req.getParameter("mode");
        }
        req.setAttribute("mode",mode);
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

    }
}
