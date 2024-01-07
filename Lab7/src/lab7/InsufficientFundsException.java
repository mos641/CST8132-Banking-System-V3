// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 7
// Description: Class to throw an exception, extends exception

package lab7;

/**
 * Throws a more detailed exception, extends Exception. For when there are insufficient funds.
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 * @see Exception
 */
public class InsufficientFundsException extends Exception {
	/**
	 * To satisfy compiler warning.
	 */
	private static final long serialVersionUID = 5749603824235195376L;
	
	//to store the amount the account is short by
	private double shortAmount;
	
	/**
	 * Throw exception for when there are insufficient funds.
	 * @param shortAmount How much money you are short by for a withdrawal.
	 */
	public InsufficientFundsException(double shortAmount) {
		this.shortAmount = shortAmount;
		System.err.println("You are unable to withdraw money as you are short $" 
		+String.format("%.1f", shortAmount)+ ".");
	}
	
	/**
	 * Return the amount short by.
	 * @return The amount you are short by.
	 */
	public double getShortAmount() {
		return shortAmount;
	}
}
