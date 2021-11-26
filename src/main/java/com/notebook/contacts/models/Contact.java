package com.notebook.contacts.models;

import org.springframework.data.annotation.Id;

public class Contact {
    @Id
    private String id;
    private String name;
    private String lastname;
    private String cellphone;
    private String email;

    public Contact(String id, String name, String lastname, String cellphone, String email) {
        super();
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
