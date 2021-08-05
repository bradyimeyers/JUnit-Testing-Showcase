package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {
	
	@Test
	void testContactClass() {
		Contact contact = new Contact("Unique ID", "Bob", "Builder", "1112223333", "Address");
			assertTrue(contact.getContactId().equals("Unique ID"));
			assertTrue(contact.getFirstName().equals("Bob"));
			assertTrue(contact.getLastName().equals("Builder"));
			assertTrue(contact.getNumber().equals("1112223333"));
			assertTrue(contact.getAddress().equals("Address"));
	}
	
	@Test
	void testContactClassIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique IDUnique IDUnique ID", "Bob", "Builder", "1112223333", "Address");
		});
	}
	
	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Bob", "Builder", "1112223333", "Address");
		});
	}
	
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", "BobBobBobBobBobBob", "Builder", "1112223333", "Address");
		});
	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", null, "Builder", "1112223333", "Address");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", "Bob", "BuilderBuilderBuilderBuilder", "1112223333", "Address");
		});
	}
	
	void testContactLastNamNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", "Bob", null, "1112223333", "Address");
		});
	}
	
	@Test
	void testContactNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", "Bob", "Builder", "111222333333333333", "Address");
		});
	}
	
	@Test
	void testContactNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", "Bob", "Builder", null, "Address");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", "Bob", "Builder", "1112223333", "Extremely long address that exceeds the 30 character limit");
		});
	}
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Unique ID", "Bob", "Builder", "1112223333", null);
		});
	}
	
}