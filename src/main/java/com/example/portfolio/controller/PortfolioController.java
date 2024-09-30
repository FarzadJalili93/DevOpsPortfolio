package com.example.portfolio.controller;


import com.example.portfolio.service.ProjektService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    private final ProjektService projektService;

    public PortfolioController(ProjektService projektService) {
        this.projektService = projektService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cv")
    public String cv() {
        return "cv";
    }

    @GetMapping("/projekt")
    public String projekt(Model model) {
        model.addAttribute("projects", projektService.fetchAllProjects());
        return "projekt";
    }
}
