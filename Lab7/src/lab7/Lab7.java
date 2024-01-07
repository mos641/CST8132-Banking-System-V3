// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class for the main method

package lab7;

import java.util.Scanner;

/**
 * This class is for the main method.
 * 
 * @author Mostapha A
 * @version 1.1
 * @since 1.8
 * @see Bank
 */
public class Lab7 {
	/**
	 * Main method to call and run the code.
	 * 
	 * @param String[]
	 * @throws Exception
	 */
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String menu = "q";
		Bank bank = new Bank(input);
		
		//loop condition
		Boolean loop = true;
		// welcome message
		System.out.println("======= Welcome to the Banking Simulation Program =======\n");

		// loop to loop through program until quitting
		do {
			// loop to throw and catch any exceptions
			do {
				// menu output for choices
				System.out.print("a: Add new account \n" + "u: Update an account\n" + "d: Display an account\n"
						+ "p: Print all accounts\n" + "m: Run monthly update\n" + "q: Quit\n" + "\n"
						+ "Enter your option: ");

				// try the input and catch any errors
				try {
					menu = input.nextLine();
					// if it a valid choice, set loop condition to exit loop
					if (menu.equalsIgnoreCase("a") || menu.equalsIgnoreCase("u") || menu.equalsIgnoreCase("d")
							|| menu.equalsIgnoreCase("p") || menu.equalsIgnoreCase("q")) {
						loop = false;
					} else {
						// else throw exception
						System.out.println("\n");
						throw new WrongMenuException();
					}
				} catch (WrongMenuException e) {
					// print error and exception
					System.out.println(e+ "\n");
				}

			} while (loop == true);
			// switch for each option
			switch (menu.toLowerCase()) {
			case "a":
				System.out.println();
				bank.addAccount();
				System.out.println();
				break;
			case "u":
				System.out.println();
				bank.updateAccount();
				System.out.println();
				break;
			case "d":
				System.out.println();
				System.out.println(bank.displayAccount());
				System.out.println();
				break;
			case "p":
				System.out.println();
				bank.printAccountDetails();
				System.out.println();
				break;
			case "m":
				System.out.println();
				bank.monthlyUpdate();
				System.out.println("\n");
				break;
			}
			input.nextLine();

		} while (!menu.equalsIgnoreCase("q"));

		// close scanner
		input.close();
		// quit message
		System.out.println("\nQuit: Successfully exited the program");
	}

}
