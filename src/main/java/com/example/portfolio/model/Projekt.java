package com.example.portfolio.model;

public class Projekt {
    private final String title;
    private final String details;
    private final String repositoryUrl;

    public Projekt(String title, String details, String repositoryUrl) {
        this.title = title;
        this.details = details;
        this.repositoryUrl = repositoryUrl;
    }


    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }
}
