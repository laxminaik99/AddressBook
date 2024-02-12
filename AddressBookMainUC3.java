package com.bridgelabz8;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMainUC3 {
  
    private ArrayList<Contact> contacts;

    public AddressBookMainUC3() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(String firstName, String lastName) {
        Scanner scanner = new Scanner(System.in);
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                contact.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Enter new address:");
                String newAddress = scanner.nextLine();
                System.out.println("Enter new city:");
                String newCity = scanner.nextLine();
                System.out.println("Enter new state:");
                String newState = scanner.nextLine();
                System.out.println("Enter new zip code:");
                String newZip = scanner.nextLine();
                System.out.println("Enter new phone number:");
                String newPhoneNumber = scanner.nextLine();
                System.out.println("Enter new email:");
                String newEmail = scanner.nextLine();

                contact.setAddress(newAddress);
                contact.setCity(newCity);
                contact.setState(newState);
                contact.setZip(newZip);
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    
    public static void main(String[] args) {
    	AddressBookMainUC3 addressBook = new AddressBookMainUC3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for a new contact:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("Zip Code: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);

        System.out.println("\nEnter details to edit a contact:");
        System.out.print("First Name: ");
        String editFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String editLastName = scanner.nextLine();
        addressBook.editContact(editFirstName, editLastName);

      
    }

}
