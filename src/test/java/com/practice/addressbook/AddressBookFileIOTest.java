package com.practice.addressbook;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookFileIOTest {
//	@Test
//	public void givenContactsInFileShouldRead() {
//		AddressBookFileIOService addressBookFileIOService = new AddressBookFileIOService();
//		List<Contacts> contactList = new ArrayList<>();
//		contactList = addressBookFileIOService.readData();
//		System.out.println(contactList);
//		Assert.assertEquals(2, contactList.size());
//	}
	
	@Test
	public void writeContactsToFile() {
		AddressBookFileIOService addressBookFileIOService = new AddressBookFileIOService();
		List<Contacts> contactList = new ArrayList<>();
		Contacts contact1 = new Contacts("Kush", "Agg", "abc", "Saharanpur", "UP", "123456", "7878787878", "abc@yahoo.co.in");
		Contacts contact2 = new Contacts("Kav", "Agg", "xyz", "Saharanpur", "UP", "785478", "9856257845", "xyz@gmail.com");
		contactList.add(contact1);
		contactList.add(contact2);
		addressBookFileIOService.writeData(contactList);
		Assert.assertEquals(16, addressBookFileIOService.countEntries());
	}
}
