import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test public void testValidContactCreation() {
        Contact contact = new Contact("1234567890", "John", "Doe", "0123456789", "123 Main Street");
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("0123456789", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
        assertEquals("1234567890", contact.getContactId());
    }

    @Test public void testInvalidPhoneThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Jane", "Doe", "123", "Address"));
    }
}