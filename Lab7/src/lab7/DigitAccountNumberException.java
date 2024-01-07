// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class to throw an exception, extends exception

package lab7;

/**
 * Throws a more detailed exception, extends Exception. For when the account number doesn't fit the format.
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 * @see Exception
 */
public class DigitAccountNumberException extends Exception {
	/**
	 * To satisfy compiler warning.
	 */
	private static final long serialVersionUID = 5749603824235195376L;

	/**
	 * Throw an exception for when the account number doesn't fit the format
	 */
	public DigitAccountNumberException() {
		System.err.println("Please enter an account number that is 8 digits or less:");
	}
}
