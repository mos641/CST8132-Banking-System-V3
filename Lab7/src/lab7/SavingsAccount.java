// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class for Savings account, 
//				extend Bank account and adds savings specific behaviours and attributes

package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class for a savings account, extends the Bank account and adds additional
 * savings specific functionality.
 * 
 * @author Mostapha A
 * @version 1.1
 * @since 1.8
 * @see BankAccount
 */
public class SavingsAccount extends BankAccount {
	// instance variable
	private double interestRate;
	private double minBalance;

	// no argument constructor
	/**
	 * No argument constructor to be able to create an object without parameters.
	 */
	SavingsAccount() {
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
		details = super.toString() + " | Minimum Balance: " + String.format("%.1f", minBalance) + " | Interest Rate: "
				+ String.format("%.1f", interestRate) + "\n";

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
		// call super method for non savings specific information
		super.addBankAccount(input);

		// savings specific information
		// loop for valid input for a minimum balance
		do {
			System.out.print("Enter the Saving Account's minimum balance : ");
			// try the input and catch errors
			try {
				minBalance = input.nextDouble();
				loop = false;
			} catch (InputMismatchException e) {
				// print error and exception
				System.out.println(e+ ": This is not a number, try again.");
				input.nextLine();
			}
		} while (loop == true);
		//reset loop variable
		loop = true;

		// loop for valid input for an interest rate
		do {
			System.out.print("Enter the Saving Account's Yearly interest rate (should be a number in (0,1)) : ");
			// try the input and catch errors
			try {
				interestRate = input.nextDouble();
				if (interestRate > 1 || interestRate < 0) {
					throw new ArithmeticException();
				}
				loop = false;
			} catch (InputMismatchException e) {
				// print error and exception
				System.out.println(e+ ": This is not a number, try again.");
				input.nextLine();
			} catch (ArithmeticException e) {
				// print error and exception
				System.err.println("Interest rate must be a value between 0 and 1.\n" +e);
				input.nextLine();
			}
		} while (loop == true);

		// return boolean value to be used next lab
		return true;
	}

	// perform monthly updates
	/**
	 * Perform the necessary calculations for the monthly interest and add to the
	 * balance.
	 */
	public void monthlyAccountUpdate() {
		// if statement to determine if balance is above minimum for interest
		if (balance >= minBalance) {
			// add interest, divided by 12 because it is a yearly rate and this is a monthly
			// update
			balance = ((balance * interestRate) / 12) + balance;
		} else {
			// display error message
			System.out.println(
					"Account " + accountNumber + " does not have the " + minBalance + " required to apply interest");
		}

	}

}
