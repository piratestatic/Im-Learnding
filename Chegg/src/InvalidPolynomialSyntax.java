/*
 * Corey Hodges
 * Project 2
 * 12 June 2021
 * InvalidPolynomialSyntax
 *
 */

/*
 * The second class is InvalidPolynomialSyntax, which defines an 
 * unchecked exception that contains a constructor that allows a 
 * message to be supplied. It is thrown by the constructor of 
 * the Polynomial class should the supplied string contain 
 * coefficients or exponents of an improper type or should the 
 * exponents fail to be listed in strictly descending order.
 */
public class InvalidPolynomialSyntax extends RuntimeException {
	
	InvalidPolynomialSyntax(String message){
		super(message);
	}
}