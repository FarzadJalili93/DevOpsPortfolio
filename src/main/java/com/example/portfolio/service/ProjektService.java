package com.example.portfolio.service;


import com.example.portfolio.model.Projekt;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProjektService {


    public List<Projekt> fetchAllProjects() {
        return Arrays.asList(
                new Projekt("IT-Security project",
                        "Developet a webpage following the rules of OWASP and took security measures",
                        "https://github.com/Ali-Abdullah1/javasecstart"),
                new Projekt("Booking webpage for a hotel",
                        "Built a hotel booking platform where users can search for rooms, make reservations, and manage bookings. The backend is developed using Java and Spring Boot, with data stored in a MySQL database. " +
                                "Includes an admin panel for managing rooms and bookings, with Spring Security handling authentication. RESTful APIs are used to manage user interactions.",
                        "https://github.com/alexanderp9/BokningssystemPensionat"),
                new Projekt("Quiz Battle Game",
                        "Developed a multiplayer quiz game as part of an object-oriented programming course. The game allows players to compete in real-time by answering multiple-choice questions. " +
                                "The backend is built in Java with a focus on object-oriented design principles such as inheritance and polymorphism. The game logic manages player sessions, scores, and question distribution.",
                        "https://github.com/Jatteliten/Inlamning4OOP")
        );
    }
}


