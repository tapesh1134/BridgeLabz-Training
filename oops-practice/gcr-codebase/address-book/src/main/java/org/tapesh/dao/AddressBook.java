package org.tapesh.dao;


import org.tapesh.modal.Contact;

import java.util.HashMap;

public class AddressBook {
    HashMap<String, Contact> contactLibrary;
    public AddressBook(){
        this.contactLibrary = new HashMap<>();
    }

    public void addContact(Contact contact) {
        String key = contact.getFirstName() + " " + contact.getLastName();
        contactLibrary.put(key.toLowerCase(),contact);
    }

    public Contact getContact(String inputName) {
        Contact contact = contactLibrary.get(inputName.toLowerCase());
        return contact;
    }
}
