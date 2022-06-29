package com.bridgelabz.addressbookStreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookMain {

	public static void main(String[] args, Object firstName) {

		Map<String, List<Contact>> cityMap = new LinkedHashMap<>();
		Map<String, AddressBook> addressBookMap = new HashMap<>();
		AddressBook addressBook = new AddressBook();
		List<Contact> listContact = new ArrayList<Contact>();
		
		

		Contact contact = new Contact("Faisal", "Ahmad", "Mumbai", "6655443322");
		Contact contact1 = new Contact("Rahul", "Kumar", "Pune", "8855443322");
		Contact contact2 = new Contact("Karan", "Rao", "Lucknow", "6655443355");
		Contact contact3 = new Contact("Aman", "Yadav", "Delhi", "1255443389");

//		listContact.add(contact);
//		listContact.add(contact1);
//		listContact.add(contact2);
//		listContact.add(contact3);
		
		addressBook.listContact.add(contact);
		addressBook.listContact.add(contact1);
		addressBook.listContact.add(contact2);
		addressBook.listContact.add(contact3);

		List<Contact> collect = listContact.stream().filter(firstName).equalsIgnoreCase(firstName).collect(Collectors.toList());
		for (Contact contact4 : collect) {
			System.out.println("Search result: " + contact);
		}

		System.out.println(addressBook.listContact);
		
		System.out.println("Enter Name of new Address Book: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            System.out.println("Address book with this name exists, Enter new name.");
        } else {
            addressBookMap.put(bookName, addressBook);
            System.out.println("If you want to add another book or press any key to exit.");
            int newBook = scanner.nextInt();
            if (newBook == 1) {
            }
        }
    }

}

}
