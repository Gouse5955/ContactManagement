import java.util.ArrayList;

public class Contactmanager {
    private ArrayList<Contact> contacts;

    // Constructor
    public Contactmanager() {
        contacts = new ArrayList<>();
    }

    // Add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Display all contacts
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contacts) {
                contact.displayContact();
                System.out.println("-------------------------");
            }
        }
    }

    // Search for a contact by name
    public void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.displayContact();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found with the name: " + name);
        }
    }
}
