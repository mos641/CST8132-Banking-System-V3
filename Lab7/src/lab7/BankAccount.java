// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Abstract class to be used as the basis for savings and chequing accounts

package lab7;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Bank account class to be extended by savings and chequing accounts. Contains
 * the common attributes and behaviours.
 * 
 * @author Mostapha A
 * @version 1.1
 * @since 1.8
 * @see Person
 */
abstract class BankAccount {
	// instance variables
	/** The bank account number, up to 8 digits **/
	protected long accountNumber;
	/** The account holder, an object of class Person **/
	protected Person accHolder = new Person();
	/** The balance of amount of funds available in the account **/
	protected double balance;

	// no argument constructor
	/**
	 * No argument constructor to create a bank account without parameters.
	 */
	BankAccount() {
	}

	// return the data of the account
	/**
	 * Return a formatted string of all the account information.
	 * 
	 * @return The formatted string of all information
	 */
	public String toString() {
		// for formatting balance
		DecimalFormat format = new DecimalFormat("0.##");

		// add all the details to one string
		String details;
		details = "AccountNumber: " + accountNumber + " | Name: " + accHolder.getName() + " | Phone Number: "
				+ accHolder.getPhoneNumber() + " | Email Address: " + accHolder.getEmail() + " | Balance: "
				+ format.format(balance);

		// return string
		return details;
	}

	// method for adding a bank account to the array
	/**
	 * Take input from the user and create a new Bank Account.
	 * 
	 * @param input A scanner object named input to take in the input of the user
	 * @return A boolean value of whether it was successful or not.
	 */
	public boolean addBankAccount(Scanner input) {
		boolean loop = true;
		// ask for and store input to create a new account

		// account holder details
		System.out.print("Enter first name of account holder : ");
		accHolder.setFirstName(input.next());

		System.out.print("Enter last name of account holder : ");
		accHolder.setLastName(input.next());

		// loop for valid input for a phone number
		do {
			System.out.print("Enter phone number of account holder : ");
			// try the input and catch errors
			try {
				accHolder.setPhoneNumber(input.nextLong());
				loop = false;
			} catch (InputMismatchException e) {
				// print error and exception
				System.err.println(e+ ": This is not a number, try again.");
				input.nextLine();
			}
		} while (loop == true);
		//reset loop variable
		loop = true;
		
		//prompt for input
		System.out.print("Enter email of account holder : ");
		accHolder.setEmail(input.next());

		// loop for valid input for a opening balance
		do {
			System.out.print("Enter opening balance of account holder : ");
			// try the input and catch errors
			try {
				balance = input.nextDouble();
				loop = false;
			} catch (InputMismatchException e) {
				// print error and exception
				System.err.println(e+ ": This is not a number, try again.");
				input.nextLine();
			}
		} while (loop == true);

		// return boolean value to be used next lab
		return false;
	}

	// withdraw or deposit from the account
	/**
	 * Update the balance of the account based on a withdrawal or a deposit.
	 * 
	 * @param The amount withdrawn or deposited.
	 */
	public void updateBalance(double changes) {
		// add or subtract from current balance
		balance = balance + changes;
	}

	// abstract to be used in sub classes
	/**
	 * Perform the necessary calculations for any monthly fees or interest.
	 */
	public abstract void monthlyAccountUpdate();
}
