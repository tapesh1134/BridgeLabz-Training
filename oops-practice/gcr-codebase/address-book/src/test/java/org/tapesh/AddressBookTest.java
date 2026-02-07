package org.tapesh;

import org.junit.jupiter.api.Test;
import org.tapesh.dao.AddressBook;
import org.tapesh.modal.Contact;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void testAddAndGetContact() {
        AddressBook addressBook = new AddressBook();

        Contact contact = new Contact();
        contact.setFirstName("Alice");
        contact.setLastName("Smith");

        addressBook.addContact(contact);

        Contact fetched = addressBook.getContact("Alice Smith");

        assertNotNull(fetched);
        assertEquals("Alice", fetched.getFirstName());
        assertEquals("Smith", fetched.getLastName());
    }

    @Test
    void testGetContactNotFound() {
        AddressBook addressBook = new AddressBook();
        Contact contact = addressBook.getContact("Unknown Person");

        assertNull(contact);
    }
}
