package org.tapesh.service;

import org.tapesh.dao.AddressBook;
import org.tapesh.modal.Contact;

public class AddressBookService {
    AddressBook addressBook = new AddressBook();
    public void addContact(Contact contact){
        addressBook.addContact(contact);
    }

    public String getContact(String inputName) {
        Contact contact = addressBook.getContact(inputName);
        if (contact == null) {
            return "Contact not found.";
        }
        return  contact.toString();
    }
}
