import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach public void setup() {
        service = new ContactService();
    }

    @Test public void testAddContactSuccess() {
        Contact c = new Contact("001", "John", "Smith", "1234567890", "1 Elm St");
        service.addContact(c);
        assertEquals(c, service.getContact("001"));
    }

    @Test public void testAddDuplicateContactFails() {
        Contact c1 = new Contact("001", "John", "Smith", "1234567890", "1 Elm St");
        Contact c2 = new Contact("001", "Jane", "Smith", "0987654321", "2 Oak St");
        service.addContact(c1);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(c2));
    }
}