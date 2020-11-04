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
	
//	@Test
//	public void writeContactsToFile() {
//		AddressBookFileIOService addressBookFileIOService = new AddressBookFileIOService();
//		List<Contacts> contactList = new ArrayList<>();
//		Contacts contact1 = new Contacts("Kush", "Agg", "abc", "Saharanpur", "UP", "123456", "7878787878", "abc@yahoo.co.in");
//		Contacts contact2 = new Contacts("Kav", "Agg", "xyz", "Saharanpur", "UP", "785478", "9856257845", "xyz@gmail.com");
//		contactList.add(contact1);
//		contactList.add(contact2);
//		addressBookFileIOService.writeData(contactList);
//		Assert.assertEquals(16, addressBookFileIOService.countEntries());
//	}
	
	//@SuppressWarnings("deprecation")
	@Test
	public void givenContactsFromCSVFileShouldRead() {
		AddressBookFileIOService addressBookFileIOService = new AddressBookFileIOService();
		List<Contacts> contactList = new ArrayList<>();
		contactList = addressBookFileIOService.readCSVData();
		System.out.println(contactList);
		Assert.assertEquals(2, contactList.size());
	}
	
	//@SuppressWarnings("deprecation")
	@Test
	public void writeContactsToCSVFile() {
		AddressBookFileIOService addressBookFileIOService = new AddressBookFileIOService();
		List<Contacts> contactList = new ArrayList<>();
		Contacts contact1 = new Contacts("Arijit", "Dey", "sodepur", "kolkata", "WB", "123456", "7878787878", "arijiy@yahoo.co.in");
		Contacts contact2 = new Contacts("Partha", "Saha", "NewTown", "BidhanNagar", "WB", "785478", "9856257845", "partha@gmail.com");
		contactList.add(contact1);
		contactList.add(contact2);
		boolean b = addressBookFileIOService.writeCSVData(contactList);
		Assert.assertTrue(b);
	}
	
//	@Test
//	public void writeContactsToJsonFile() {
//		AddressBookFileIOService addressBookFileIOService = new AddressBookFileIOService();
//		List<Contacts> contactList = new ArrayList<>();
//		Contacts contact1 = new Contacts("Arijit", "Dey", "sodepur", "kolkata", "WB", "123456", "7878787878", "arijiy@yahoo.co.in");
//		Contacts contact2 = new Contacts("Partha", "Saha", "NewTown", "BidhanNagar", "WB", "785478", "9856257845", "partha@gmail.com");
//		contactList.add(contact1);
//		contactList.add(contact2);
//		boolean b = addressBookFileIOService.writeJsonData(contactList);
//		Assert.assertTrue(b);
//	}
//	
//	//@SuppressWarnings("deprecation")
//	@Test
//	public void readContactsFromJsonFile() {
//		AddressBookFileIOService addressBookFileIOService = new AddressBookFileIOService();
//		List<Contacts> contactList = new ArrayList<>();
//		Contacts contact1 = new Contacts("Arijit", "Dey", "sodepur", "kolkata", "WB", "123456", "7878787878", "arijiy@yahoo.co.in");
//		Contacts contact2 = new Contacts("Partha", "Biswas", "NewTown", "BidhanNagar", "WB", "785478", "9856257845", "partha@gmail.com");
//		contactList.add(contact1);
//		contactList.add(contact2);
//		boolean b = addressBookFileIOService.readJsonFile();
//		Assert.assertTrue(b);
//	}
}
