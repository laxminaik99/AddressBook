package com.bridgelabz8;
import java.util.*;

public class AddressBookMainUC1 {
	 private String firstName;
	    private String lastName;
	    private String address;
	    private String city;
	    private String state;
	    private String zip;
	    private String phoneNumber;
	    private String email;

	    public AddressBookMainUC1(String firstName, String lastName, String address, String city, String state, String zip,
	                   String phoneNumber, String email) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	    }

	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	    	this.firstName = firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	    	this.lastName = lastName;
	    }
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	    	this.address = address;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	    	this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	    	this.state = state;
	    }
	    public String getZip() {
	        return zip;
	    }
	    public void setZip(String zip) {
	    	this.zip = zip;
	    }
	    public String getPhoneNumber() {
	        return phoneNumber;
	    }
	    public void setPhoneNumber(String phoneNumber) {
	    	this.phoneNumber = phoneNumber;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	    	this.email = email;
	    }
	   
	    public void printContactDetails() {
	        System.out.println("Name: " + firstName + " " + lastName);
	        System.out.println("Address: " + address);
	        System.out.println("City: " + city);
	        System.out.println("State: " + state);
	        System.out.println("Zip Code: " + zip);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Email: " + email);
	    }

	    public static void main(String[] args) {
	    	AddressBookMainUC1 myContact = new AddressBookMainUC1("John", "Doe", "123 Main St", "Anytown", "CA", "12345",
	                                         "555-123-4567", "john.doe@example.com");

	        myContact.printContactDetails();
	    }
}