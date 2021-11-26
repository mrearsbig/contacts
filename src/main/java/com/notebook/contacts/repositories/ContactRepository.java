package com.notebook.contacts.repositories;

import com.notebook.contacts.models.Contact;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    
}
