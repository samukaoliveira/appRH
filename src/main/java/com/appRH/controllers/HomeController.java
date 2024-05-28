package com.appRH.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Retorna o nome da página Thymeleaf (index.html) ou o nome do arquivo JSP (index.jsp)
    }
}
