package com.example.portfolio.service;

import com.example.portfolio.model.ContactMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    private final List<ContactMessage> messages = new ArrayList<>();

    public void addMessage(ContactMessage message) {
        messages.add(message);
    }

    public List<ContactMessage> getAllMessages() {
        return messages;
    }
}
