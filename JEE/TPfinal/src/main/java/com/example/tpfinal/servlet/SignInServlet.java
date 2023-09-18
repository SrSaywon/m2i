package com.example.tpfinal.servlet;

import com.example.tpfinal.data.FakeDB;
import com.example.tpfinal.models.User;
import com.example.tpfinal.models.UserDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

@WebServlet(name = "signInServlet", value = "/auth/signIn")
public class SignInServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO dto = new UserDTO();
        ArrayList<String> errors = new ArrayList<>();

        req.setAttribute("user", dto);
        req.setAttribute("errors", errors);
        req.setAttribute("mode", "signIn");

        req.getRequestDispatcher("/WEB-INF/auth/signIn.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> errors = new ArrayList<>();
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Optional<User> foundUser = FakeDB.users.stream().filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password)).findFirst();

        if (foundUser.isPresent()) {
            req.getSession().setAttribute("user", foundUser.get());
            resp.sendRedirect(req.getContextPath() + "/servlet/list");

        }else {
            errors.add("Invalid credentials");
            UserDTO dto = new UserDTO();
            dto.setUsername(username);
            dto.setPassword(password);
            req.setAttribute("user", dto);
            req.setAttribute("errors", errors);
            req.setAttribute("mode", "signIn");
            req.getRequestDispatcher("/WEB-INF/auth/signIn.jsp").forward(req,resp);
        }
    }

}
