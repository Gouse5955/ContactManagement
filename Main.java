import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contactmanager contactManager = new Contactmanager();

        while (true) {
            // Display menu
            System.out.println("Contact Manager Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search for Contact");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after the number input

            switch (choice) {
                case 1:
                    // Add a contact
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phone, email);
                    contactManager.addContact(contact);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    // Display all contacts
                    contactManager.displayAllContacts();
                    break;

                case 3:
                    // Search for a contact
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContact(searchName);
                    break;

                case 4:

                    // Exit the program
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
