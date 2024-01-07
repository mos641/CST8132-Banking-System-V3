// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class to throw an exception, extends exception

package lab7;

/**
 * Throws a more detailed exception, extends Exception. For when there is an account with the same number.
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 * @see Exception
 */
public class DuplicateAccountNumberException extends Exception {
	
	/**
	 * To satisfy compiler warning.
	 */
	private static final long serialVersionUID = 5749603824235195376L;
	
	/**
	 * Throw an exception for when there is an account with the same number
	 */
	public DuplicateAccountNumberException() {
		System.err.println("That account number is already used, Please enter another account number :");
	}
}
