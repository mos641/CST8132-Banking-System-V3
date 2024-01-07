// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class for the Person object to be used as the account holder

package lab7;

/**
 * This class is for a person object to be used as the account holder.
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 */
public class Person {
	// instance variables
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	
	/**
	 * No argument constructor to be able to create an object without parameters.
	 */
	//no argument constructor
	public Person() {
		
	}

	// getter method for name
	/**
	 * Method to access the private variables of first name and last name.
	 * @return return the first name and last name together of the Person.
	 */
	public String getName() {
		String Name = firstName + " " + lastName;
		return Name;
	}

	// getter method for email
	/**
	 * This is a method to access the email address of the Person.
	 * @return return the email address of the Person.
	 */
	public String getEmail() {
		return email;
	}

	// getter method for phone number
	/**
	 * This is a method to access the phone number of the person.
	 * @return
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	//setter method for first name
	/**
	 * This is a method to set or change the first name of the person.
	 * @param firstName The desired first name to use.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//setter method for last name
	/**
	 * This is a method to set or change the last name of the person.
	 * @param lastName The desired last name to use.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//setter method for email
	/**
	 * This method is for setting or changing the email address of the person.
	 * @param email The desired email to use.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	//setter method for phone number
	/**
	 * This method is to set or change the phone number of the person.
	 * @param phoneNumber The desired phone number to use.
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
