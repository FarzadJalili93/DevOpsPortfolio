package com.example.portfolio.controller;


import com.example.portfolio.service.ProjektService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @Autowired
    private ProjektService projektService;

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
        model.addAttribute("projects", projektService.getProjects());
        return "projekt";
    }
}
