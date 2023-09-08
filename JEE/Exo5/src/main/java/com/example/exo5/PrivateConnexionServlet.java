package com.example.exo5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (name = "privateConnexionServlet", value = "/private/connexion")
public class PrivateConnexionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Boolean isConnected =(Boolean) (req.getSession().getAttribute("connected")!=null ? req.getSession().getAttribute("connected") : false);

        if (isConnected) {
            req.getRequestDispatcher("/WEB-INF/private/connected").forward(req,resp);
        }else {
            resp.sendRedirect(req.getContextPath() + "/WEB-IN/auth/signin.jsp");
        }
    }
}
