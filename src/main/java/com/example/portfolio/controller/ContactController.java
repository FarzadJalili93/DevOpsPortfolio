package com.example.portfolio.controller;

import com.example.portfolio.model.ContactMessage;
import com.example.portfolio.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String showContactForm() {
        return "contact-form";
    }

    @PostMapping("/contact")
    public String handleContactForm(ContactMessage contactMessage, Model model) {
        contactService.addMessage(contactMessage);

        model.addAttribute("confirmation", "Thank you for your message, " + contactMessage.name() + "!");

        return "contact-confirmation";
    }

    @GetMapping("/admin/messages")
    public String showAllMessages(Model model) {
        model.addAttribute("messages", contactService.getAllMessages());
        return "messages-list";
    }
}

