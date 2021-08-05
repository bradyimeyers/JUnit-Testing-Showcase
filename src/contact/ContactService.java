package contact;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	public boolean add(Contact contact) {
		boolean alreadyPresent = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
		
		if (!alreadyPresent) {
			contacts.add(contact);
			System.out.println("Contact Added");
			return true;
		}
		
		else {
			System.out.println("Contact already exists");
			return false;
		}
	}
	
	public boolean remove(String contactId) {
		for (Contact c : contacts) {
			if (c.getContactId().equals(contactId)) {
				contacts.remove(c);
				System.out.println("Contact removed");
				return true;
			}
		}
		
		System.out.println("Contact not found");
		return false;
	}
	
	public boolean update(String contactId, String firstName, String lastName, String Number, String Address) {
		for (Contact c : contacts) {
			if (c.getContactId().equals(contactId)) {
				if (!firstName.equals(""))
	                   c.setFirstName(firstName);
	               if (!lastName.equals(""))
	                   c.setLastName(lastName);
	               if (!Number.equals(""))
	                   c.setNumber(Number);
	               if (!Address.equals(""))
	            	   c.setAddress(Address);
	               System.out.println("Contact updated Successfully!");
	               return true;
			}
		}
		System.out.println("Contact not found");
		return false;
	}
	
}