package com.bridgelabz.addressbookStreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookMain {

	public static void main(String[] args) {

		//Map<String, List<Contact>> cityMap = new LinkedHashMap<>();
		List<Contact> listContact = new ArrayList<Contact>();

		AddressBook addressBook1 = new AddressBook();
		Contact contact = new Contact("Faisal", "Ahmad", "Mumbai", "6655443322");
		Contact contact1 = new Contact("Rahul", "Kumar", "Pune", "8855443322");
		Contact contact2 = new Contact("Karan", "Rao", "Lucknow", "6655443355");
		Contact contact3 = new Contact("Aman", "Yadav", "Delhi", "1255443389");

		AddressBook addressBook2 = new AddressBook();
		Contact contact5 = new Contact("Arun", "Kishor", "Delhi", "1255443389");
		Contact contact6 = new Contact("Karan", "Yadav", "Delhi", "1255443389");

//		listContact.add(contact);
//		listContact.add(contact1);
//		listContact.add(contact2);
//		listContact.add(contact3);

		addressBook1.listContact.add(contact);
		addressBook1.listContact.add(contact1);
		addressBook1.listContact.add(contact2);
		addressBook1.listContact.add(contact3);

		addressBook2.listContact.add(contact5);
		addressBook2.listContact.add(contact6);
		
		Map<String, AddressBook> addressBookMap = new LinkedHashMap<>();
		addressBookMap.put("addressBook1", addressBook1);
		addressBookMap.put("addressBook2", addressBook2);
		
		// Searching details by using firstName
//		List<Contact> listContact1 = new ArrayList<Contact>();
//		for(Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
//			AddressBook addBook = addressBookMap.get(entry.getKey());
//			List<Contact> nameListContact1 = addBook.listContact.stream().filter(x -> x.firstName.equals("Arun"))
//					.collect(Collectors.toList());
//			listContact1.addAll(nameListContact1);
//		}
//		System.out.println("Searched name details are: " + listContact1);
		
		Map<String, List<Contact>> cityMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
			
			AddressBook addressBook = addressBookMap.get(entry.getKey());
			addressBook.listContact.stream().forEach(element -> {
				if(cityMap.containsKey(element.getCity())) {
					List<Contact> list = cityMap.get(element.getCity());
					list.add(element);
				} else {
					List<Contact> list = new ArrayList<>();
					list.add(element);
					cityMap.put(element.getCity(), list);
				}
			});
		}
		System.out.println(cityMap);
	}

}
