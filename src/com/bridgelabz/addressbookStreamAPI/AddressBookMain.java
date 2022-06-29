package com.bridgelabz.addressbookStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		List<Contact> listContact = new ArrayList<Contact>();

		Contact contact = new Contact("Faisal", "Ahmad", "Mumbai", "6655443322");
		Contact contact1 = new Contact("Rahul", "Kumar", "Pune", "8855443322");
		Contact contact2 = new Contact("Karan", "Rao", "Lucknow", "6655443355");
		Contact contact3 = new Contact("Aman", "Yadav", "Delhi", "1255443389");

		listContact.add(contact);
		listContact.add(contact1);
		listContact.add(contact2);
		listContact.add(contact3);

		System.out.println(addressBook.listContact);
	}

}
