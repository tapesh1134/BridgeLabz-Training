package org.tapesh;

import org.junit.jupiter.api.Test;
import org.tapesh.modal.Contact;
import org.tapesh.service.AddressBookService;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookServiceTest {

    @Test
    void testAddAndFetchContact() {
        AddressBookService service = new AddressBookService();

        Contact contact = new Contact();
        contact.setFirstName("Bob");
        contact.setLastName("Marley");

        service.addContact(contact);

        Contact fetched = service.getContact("Bob Marley");

        assertEquals("Bob", fetched.getFirstName());
        assertEquals("Marley", fetched.getLastName());
    }

    @Test
    void testFetchNonExistingContactReturnsEmptyContact() {
        AddressBookService service = new AddressBookService();

        Contact contact = service.getContact("No Name");

        assertNotNull(contact);
        assertNull(contact.getFirstName());
        assertNull(contact.getLastName());
    }
}
