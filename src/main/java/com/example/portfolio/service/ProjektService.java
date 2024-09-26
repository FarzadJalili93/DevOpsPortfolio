package com.example.portfolio.service;

import com.example.portfolio.model.Projekt;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProjektService {

    public List<Projekt> getProjects() {
        return Arrays.asList(
                new Projekt("Projekt 1: To-Do App",
                        "Det här är ett projekt där jag utvecklade en enkel to-do applikation med Java och Spring Boot. Den låter användare skapa, uppdatera och radera uppgifter. Appen använder en MySQL-databas för att lagra uppgifterna.",
                        "https://github.com/ditt-github-användarnamn/todo-app"),
                new Projekt("Projekt 2: Väderservice API",
                        "Detta projekt bygger på att hämta data från ett öppet väder-API och presentera aktuell väderinformation för en vald stad. Applikationen är byggd med Java och använder RESTful services för att kommunicera med API:et.",
                        "https://github.com/ditt-github-användarnamn/weather-api"),
                new Projekt("Projekt 3: E-handelsplattform",
                        "I detta projekt byggde jag en enkel e-handelsplattform med användarhantering och varukorgsfunktionalitet. Plattformen är skapad med hjälp av Java, Spring Boot och en MongoDB-databas.",
                        "https://github.com/ditt-github-användarnamn/ecommerce-platform")
        );
    }
}

