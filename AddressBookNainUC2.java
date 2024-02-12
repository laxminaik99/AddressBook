package com.bridgelabz8;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookNainUC2 {
    private ArrayList<Contact> contacts;

    public AddressBookNainUC2() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

  
    public static void main(String[] args) {
    	AddressBookNainUC2 addressBook = new AddressBookNainUC2();
        Scanner scanner = new Scanner(System.in);

        // Adding a new contact
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
   }

}
