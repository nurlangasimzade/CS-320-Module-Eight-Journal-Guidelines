import java.util.HashMap;

public class ContactService {
    private HashMap<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) throw new IllegalArgumentException("Duplicate ID");
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String firstName) {
        if (contacts.containsKey(contactId)) contacts.get(contactId).setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        if (contacts.containsKey(contactId)) contacts.get(contactId).setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {
        if (contacts.containsKey(contactId)) contacts.get(contactId).setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {
        if (contacts.containsKey(contactId)) contacts.get(contactId).setAddress(address);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}