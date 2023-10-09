package com.example.demo_spring_security_session.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class BaseController {
    @GetMapping
    public String getHomePage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("user", "johnny");

        return "home";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "loginForm";
    }

    @PostMapping("/login")
    public String login() {
        // Récupérer les valeurs du formulaire
        public String login(String pseudo, String password, HttpServletRequest request) {
            if (pseudo != null )
        }

        // Si elles sont égales à certaines variables, tu ajoute en session l'utilisateur

        // Sinon, tu redirige vers la page d'accueil / tu retourne le formulaire avec erreurs

        return null;
    }

}
