package com.example.tpfinal.servlet;

import com.example.tpfinal.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (name = "privatePage", value = "/private/page")
public class PrivatePage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");

        if (user != null) {
            req.setAttribute("user", user);
            req.getRequestDispatcher("/WEB-INF/person/listPerson.jsp").forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/auth/signIn");
        }
    }
}
