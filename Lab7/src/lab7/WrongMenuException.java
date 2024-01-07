// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class to throw an exception, extends exception

package lab7;

/**
 * Throws a more detailed exception, extends Exception. For when the wrong menu option is used.
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 * @see Exception
 */
public class WrongMenuException extends Exception {
	
	/**
	 * To satisfy compiler warning.
	 */
	private static final long serialVersionUID = 5749603824235195376L;
	
	/**
	 * Throw an exception when the wrong menu option is used.
	 */
	public WrongMenuException() {
		System.err.println("Wrong Menu Selection: Did not receive one of the listed inputs. "
				+ "Please enter one of the listed inputs.");
	}

}
