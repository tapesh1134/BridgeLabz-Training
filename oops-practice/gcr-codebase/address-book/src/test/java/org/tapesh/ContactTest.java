package org.tapesh;

import org.junit.jupiter.api.Test;
import org.tapesh.modal.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testContactSettersAndGetters() {
        Contact contact = new Contact();

        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setAddress("Street 1");
        contact.setCity("Delhi");
        contact.setState("Delhi");
        contact.setZip(110001);
        contact.setPhoneNumber(9876543210L);
        contact.setEmail("john@example.com");

        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("Street 1", contact.getAddress());
        assertEquals("Delhi", contact.getCity());
        assertEquals("Delhi", contact.getState());
        assertEquals(110001, contact.getZip());
        assertEquals(9876543210L, contact.getPhoneNumber());
        assertEquals("john@example.com", contact.getEmail());
    }

    @Test
    void testToStringNotNull() {
        Contact contact = new Contact();
        assertNotNull(contact.toString());
    }
}
