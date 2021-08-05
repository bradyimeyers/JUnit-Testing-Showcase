# Title
- Contact Service with JUnit Test

# Description
- The Contact Service deliverable uses in-memory data structures to support storing contacts
- Utilizes JUnit tests to verify Contact Service requirements are met
- 95%+ coverage met for application

# Features
- Contact.java
  + Methods to add, update, delete contacts in service
  + Unique parameters for each Contact object field
- ContactService.java
  + Acts as driver class for Contact.java
  + Add contacts with unique IDs
    ~ Check if IDs are unique
  + Delete contacts per ID
  + Update contact fields per ID
- ContactTest.java
  + Tests creation of Contact object
- ContactServiceTest.java
  + Tests success and failure cases for each method in application
