package com.example.personal_portfolio_app.service;

//package com.example.portfolio.service;

import com.example.personal_portfolio_app.model.ContactForm;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    // This method could be expanded to send emails, persist to a DB, etc.
    public void processContact(ContactForm contactForm) {
        // For now, we just print out; replace with real business logic
        System.out.println("Received contact request:");
        System.out.println("Name: " + contactForm.getName());
        System.out.println("Subject: " + contactForm.getSubject());
        System.out.println("Email: " + contactForm.getEmail());
    }
}
