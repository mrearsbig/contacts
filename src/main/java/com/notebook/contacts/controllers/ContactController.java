package com.notebook.contacts.controllers;

import java.util.List;

import com.notebook.contacts.models.Contact;
import com.notebook.contacts.repositories.ContactRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        super();
        this.contactRepository = contactRepository;
    }

    @GetMapping
    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Contact postContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id) {
        return contactRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Contact putContact(@PathVariable String id, @RequestBody Contact update) {
        Contact contact = contactRepository.findById(id).get();
        contact.setName(update.getName());
        contact.setLastname(update.getLastname());
        contact.setCellphone(update.getCellphone());
        contact.setEmail(update.getEmail());
        return contactRepository.save(contact);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteContact(@PathVariable String id) {
        contactRepository.deleteById(id);
    }
}
