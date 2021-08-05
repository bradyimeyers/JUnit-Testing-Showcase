package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {
	
	@Test
	void testContactServiceClassAddPass() {
		ContactService cs = new ContactService();
	       Contact c1 = new Contact("#001", "Bob", "Builder", "1112223333", "123 Build Lane");
	       Contact c2 = new Contact("#002", "Dora", "Explorer", "2223334444", "234 Dora Ave");
	       Contact c3 = new Contact("#003", "Scooby", "Doo", "3334445555", "345 Scooby Road");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	}
	
	@Test
	void testContactServiceClassAddFail() {
		ContactService cs = new ContactService();
	       Contact c1 = new Contact("#001", "Bob", "Builder", "1112223333", "123 Build Lane");
	       Contact c2 = new Contact("#002", "Dora", "Explorer", "2223334444", "234 Dora Ave");
	       Contact c3 = new Contact("#003", "Scooby", "Doo", "3334445555", "345 Scooby Road");
	       assertEquals(true, cs.add(c1));
	       assertEquals(false, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	}
	
	@Test
	void testContactServiceClassDeletePass() {
		ContactService cs = new ContactService();
	       Contact c1 = new Contact("#001", "Bob", "Builder", "1112223333", "123 Build Lane");
	       Contact c2 = new Contact("#002", "Dora", "Explorer", "2223334444", "234 Dora Ave");
	       Contact c3 = new Contact("#003", "Scooby", "Doo", "3334445555", "345 Scooby Road");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	       
	       assertEquals(true, cs.remove("#001"));
	       assertEquals(true, cs.remove("#002"));
	}
	
	@Test
	void testContactServiceClassDeleteFail() {
		ContactService cs = new ContactService();
	       Contact c1 = new Contact("#001", "Bob", "Builder", "1112223333", "123 Build Lane");
	       Contact c2 = new Contact("#002", "Dora", "Explorer", "2223334444", "234 Dora Ave");
	       Contact c3 = new Contact("#003", "Scooby", "Doo", "3334445555", "345 Scooby Road");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	       
	       assertEquals(true, cs.remove("#001"));
	       assertEquals(false, cs.remove("#009"));
	}
	
	@Test
	void testContactServiceClassUpdatePass() {
		ContactService cs = new ContactService();
	       Contact c1 = new Contact("#001", "Bob", "Builder", "1112223333", "123 Build Lane");
	       Contact c2 = new Contact("#002", "Dora", "Explorer", "2223334444", "234 Dora Ave");
	       Contact c3 = new Contact("#003", "Scooby", "Doo", "3334445555", "345 Scooby Road");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	       
	       assertEquals(true, cs.update("#001", "Spongebob", "Squarepants", "0001112222", "012 Bikini Bottom"));
	}
	
	@Test
	void testContactServiceClassUpdateFail() {
		ContactService cs = new ContactService();
	       Contact c1 = new Contact("#001", "Bob", "Builder", "1112223333", "123 Build Lane");
	       Contact c2 = new Contact("#002", "Dora", "Explorer", "2223334444", "234 Dora Ave");
	       Contact c3 = new Contact("#003", "Scooby", "Doo", "3334445555", "345 Scooby Road");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	       
	       assertEquals(false, cs.update("#009", "Egg", "Sandwich", "0001112222", "011 Egg Lane"));
	}
	
}
