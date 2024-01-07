// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class to throw an exception, extends exception

package lab7;

/**
 * Throws a more detailed exception, extends Exception. For when the account number is negative.
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 * @see Exception
 */
public class NegativeAccountNumberException extends Exception {
	
	/**
	 * To satisfy compiler warning.
	 */
	private static final long serialVersionUID = 5749603824235195376L;
	
	/**
	 * Throw an exception when the account number is negative
	 */
	public NegativeAccountNumberException () {
		System.err.println("Please enter a positive integer value for the account number :");
	}
}
