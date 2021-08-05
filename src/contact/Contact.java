package contact;

import java.util.Scanner;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	
	// Contact Object constructor and legal parameters
	public Contact(String contactId, String firstName, String lastName, String Number, String Address) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(Number == null || Number.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(Address == null || Address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}	
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;
		
	}
	
	// Contact ID methods
	public String getContactId() {
		return contactId;
	}
	
	
	// First Name methods
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	// Last Name Methods
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	// Number Methods
	public String getNumber() {
		return Number;
	}
	
	public void setNumber(String Number) {
		this.Number = Number;
	}
	
	
	//Address methods
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	@Override
	public boolean equals(Object obj) {
		
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;
	       Contact other = (Contact) obj;
	       if (contactId == null) {
	           if (other.contactId != null)
	               return false;
	       } else if (!contactId.equals(other.contactId))
	           return false;
	       if (firstName == null) {
	           if (other.firstName != null)
	               return false;
	       } else if (!firstName.equals(other.firstName))
	           return false;
	       if (lastName == null) {
	           if (other.lastName != null)
	               return false;
	       } else if (!lastName.equals(other.lastName))
	           return false;
	       if (Number == null) {
	           if (other.Number != null)
	               return false;
	       } else if (!Number.equals(other.Number))
	           return false;
	       if (Address == null) {
	           if (other.Address != null)
	               return false;
	       } else if (!Address.equals(other.Address))
	           return false;
	       
	       return true;
	   }
}
