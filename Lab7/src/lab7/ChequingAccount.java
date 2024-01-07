// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 6
// Description: Class for Chequing account, 
//				extend Bank account and adds chequing specific behaviours and attributes

package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class for a chequing account, extends the Bank account and adds additional
 * chequing specific functionality.
 * 
 * @author Mostapha A
 * @version 1.1
 * @since 1.8
 * @see BankAccount
 */
public class ChequingAccount extends BankAccount {
	// instance variable
	private double fee;

	// no argument constructor
	ChequingAccount() {
	}

	// return the data of the account
	/**
	 * Return a formatted string of all the account information. Uses the super
	 * method and adds on to it.
	 * 
	 * @return The formatted string of all information
	 */
	public String toString() {
		// add all the details to one string
		String details;
		details = super.toString() + " | Fee: " + String.format("%.1f", fee) + "\n";

		// return string
		return details;
	}

	// add a new bank account
	/**
	 * Take input from the user and create a new Bank Account. Uses the super method
	 * and adds on to it.
	 * 
	 * @return A boolean value of whether it was successful or not
	 */
	public boolean addBankAccount(Scanner input) {
		boolean loop = true;
		// ask for and store input to create a new account
		// call super method for non checking specific information
		super.addBankAccount(input);

		// chequing specific information
		// loop for valid input for an monthly fee
		do {
			System.out.print("Enter the Chequing Account's monthly fee : ");
			// try the input and catch errors
			try {
				fee = input.nextDouble();
				if (fee < 0) {
					throw new ArithmeticException("Monthly fees must be a positive value.");
				}
				loop = false;
			} catch (InputMismatchException e) {
				// print error and exception
				System.err.println(e+ ": This is not a number, try again.");
				input.nextLine();
			} catch (ArithmeticException e) {
				// print error and exception
				System.out.println(e);
				input.nextLine();
			}
		} while (loop == true);

		// return boolean value to be used next lab
		return true;
	}

	// perform monthly updates
	/**
	 * Perform the necessary calculations for subtracting any fees from the balance.
	 */
	public void monthlyAccountUpdate() {
		// if statement to determine if balance has enough for fees
		if (balance >= fee) {
			// subtract fee from balance
			balance = balance - fee;
		} else {
			// display error message
			System.out.println(
					"Account " + accountNumber + " does not have enough balance to subtract the fees of " + fee);
		}
	}

}
