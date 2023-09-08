package com.example.exo5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "newAccountServlet", value = "/auth/newAccount")
public class NewAccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountDTO accountToAdd =new AccountDTO(0L, "","");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        req.getRequestDispatcher("/WEB-INF/auth/newAccount.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");


        Account newAccount = new Account(
                username,
                password
        );

        FakeDB.accounts.add(newAccount);

        resp.sendRedirect("signin");
    }
}
