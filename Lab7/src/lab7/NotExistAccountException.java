// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class to throw an exception, extends exception

package lab7;

/**
 * Throws a more detailed exception, extends Exception. For when an account does not exist.
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 * @see Exception
 */
public class NotExistAccountException extends Exception {
	/**
	 * To satisfy compiler warning.
	 */
	private static final long serialVersionUID = 5749603824235195376L;

	/**
	 * Throw an exception for when the account does not exist
	 */
	public NotExistAccountException() {
		//print an error message
		System.err.print("Account does not exist.");
	}
}
