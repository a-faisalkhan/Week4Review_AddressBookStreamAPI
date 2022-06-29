package com.bridgelabz.addressbookStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBookMain {

	List<Contact> listContact = new ArrayList<Contact>();

	public static void main(String[] args) {

		Map<String, List<Contact>> cityMap = new LinkedHashMap<>();
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

		List<Contact> collect = listContact.stream().filter(p -> p.getFirstName().equalsIgnoreCase(firstName))
				.collect(Collectors.toList());
		for (Contact contact4 : collect) {
			System.out.println("Search result: " + contact);
		}

		System.out.println(addressBook.listContact);

	}

}
