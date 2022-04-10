/*
 * Corey Hodges
 * Project 2
 * 12 June 2021
 * Polynomial
 *
 */
import java.util.*;

public class Polynomial implements Iterable<Polynomial.Term>, Comparable<Polynomial> {
	Comparator<Polynomial> compare;
	private Term head = null;
	//A constructor that accepts a string that defines one polynomial in the same format 
	//as provided in the input file.
	public Polynomial(String file) {
		Scanner scan = new Scanner(file);
		try{
			while(scan.hasNext()){
				addTerm(scan.nextDouble(), scan.nextInt());
			}
		} 
		catch (Exception ex){
			System.out.println(ex.getLocalizedMessage());
			throw new InvalidPolynomialSyntax("Error: Invalid Syntax, check input");
		}
	}

	public void addTerm(double coefficient, int exponent ){
		if (exponent < 0){
			throw new InvalidPolynomialSyntax("Error: Invalid Syntax, Negative exponents");
		}
		Term pointer = head;
		if(pointer == null){ 
			head = new Term(coefficient, exponent);
			head.next = null;
		} 
		else { 
			while(pointer.next != null){
				pointer = pointer.next;
			}
			pointer.next = new Term(coefficient, exponent);
		}

	}

	/*
	 * A compareTo method that compares two polynomials.  If their highest exponents are the 
	 * same, their coefficients are compared. If two polynomials have the same highest order exponent with the
	 * same coefficients the next highest exponent is examined, and so on.
	 */
	@Override
	public int compareTo(Polynomial poly1) {
		Term compTo1 = this.head;
		Term compTo2 = poly1.head;

		while (compTo1 != null && compTo2 != null){
			//If the two polynomials have different highest 
			//order exponents, the one with the highest exponent is the greatest.
			if (compTo1.getExponent() != compTo2.getExponent()){
				return compTo1.getExponent() - compTo2.getExponent();
			}
			else if(compTo1.getCoefficient() != compTo2.getCoefficient()) {
				if(compTo2.getCoefficient()> compTo1.getCoefficient()){
					return -1;
				}
				else if(compTo2.getCoefficient()< compTo1.getCoefficient()){
					return +1;
				}
			}
			compTo1 = compTo1.getNext();
			compTo2 = compTo2.getNext();
		}//if both are null they are equal
		if (compTo1 == null && compTo2 == null){
			return 0;
		}//If two polynomials have the same highest order exponent with the
		 //same coefficients the next highest exponent is examined, and so on.
		if (compTo1 == null){
			return -1;
		}else {
			return +1;
		}
	}
	//If the exponents are the same...
	public int compareExponents(Polynomial poly2) {
		Term compExp1 = this.head;
		Term compExp2 = poly2.head;
		while(compExp1 != null && compExp2 != null) {
			if (compExp1.getExponent() != compExp2.getExponent()) {
				return compExp1.getExponent() - compExp2.getExponent();
			}
			else {
				compExp1 = compExp1.getNext();
				compExp2 = compExp2.getNext();
			}
		}
		if(compExp1 == null && compExp2 == null){
			return 0;
		}
		if (compExp2 == null){
			return +1;
		}
		else {
			return -1;
		}
	}

	public Polynomial() { 
		compare = (Polynomial poly1, Polynomial poly2) -> poly1.compareExponents(poly2); 
		}
	public Polynomial(Comparator<Polynomial> compare){ 
		this.compare = compare; 
		}

	@Override
	public Iterator<Term> iterator() {
		return new Iterator() {

			private Term pointer = getHead();

			@Override
			public boolean hasNext() {
				return pointer != null && pointer.getNext() != null;
			}

			@Override
			public Term next() {
				Term data = pointer;
				pointer = pointer.next;
				return data;
			}
		};
	}

	@Override
	public String toString() {
		StringBuilder expressionBuilder = new StringBuilder();
		//first check head to avoid +1x^3 +3x^2
		if (head.coefficient > 0){
			expressionBuilder.append(head.toString());
		}
		else {
			expressionBuilder.append(" - ").append(head.toString());
		}
		for(Term tmp = head.next; tmp != null; tmp = tmp.next) {
			if (tmp.coefficient < 0) {
				expressionBuilder.append(" - ").append(tmp.toString());
			} 
			else {
				expressionBuilder.append(" + ").append(tmp.toString());
			}
		}
		return expressionBuilder.toString();

	}

	static class Term {
		private double coefficient;
		private int exponent;
		private Term next;

		private Term(double coefficient, int exponent) {
			this.coefficient = coefficient;
			this.exponent = exponent;
			this.next = null;
		}

		private int getExponent() {
			return exponent;
		}
		private double getCoefficient() {
			return coefficient;
		}
		private Term getNext() {
			return next;
		}

		@Override
		public String toString(){
			String termString = String.format("%.1f", Math.abs(coefficient));
			if (getExponent() == 0) { 
				return termString;
			}
			else if(getExponent() == 1){ 
				return termString + "x";
			} 
			else{
				return termString + "x^" + getExponent();
			}
		}
	}

	private Term getHead() {
		return head;
	}
}