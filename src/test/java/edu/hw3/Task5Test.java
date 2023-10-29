package edu.hw3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void parse_Contacts_Check_First() {
        String[] names = new String[]{"Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke"};
        var result = Task5.parseContacts(names, "ASC");
        String expected = "Thomas Aquinas";
        assertEquals(expected, result[0].getFirstName() + " " + result[0].getLastName());

    }

    @Test
    void parse_Contacts_Check_Second() {
        String[] names = new String[]{"Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke"};
        var result = Task5.parseContacts(names, "ASC");
        String expected = "Rene Descartes";
        assertEquals(expected, result[1].getFirstName() + " " + result[1].getLastName());

    }

}
