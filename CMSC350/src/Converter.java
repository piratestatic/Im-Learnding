/*
 * Corey Hodges
 * Project 1
 * 31 May 2021
 * Prefix and Postfix Converter
 *
 */
import java.util.*;

public class Converter {
	static boolean isOperator(String s) {
		switch (s) {
		case ("+"):
		case ("-"):
		case ("*"):
		case ("/"):
			return true;
		}
		return false;
	}
	
	public String prefixToPostfix(String expression) throws Exception {
		var revStack = new Stack<String>();
		var operStack = new Stack<String>();
		//tokenize the string containing the prefix expression
		String[] token; 
		
		if(expression.contains(" ")) {
			token = expression.split(" ");
		}else {
			token = expression.split("");
		}
		
		for(int i = 0; i<token.length;i++) {
			revStack.push(token[i]);
		}
		
		//while the reversal stack is not empty
		while(!revStack.isEmpty()) {
			//if it is an operand push it onto the operand stack
			//if(!isOperator(operStack.peek())){
			if(!isOperator(revStack.peek())){
				//pop the next token from the reversal stack
				operStack.push(revStack.pop());
			//else it is an operator	
			}else {
				//pop two operands off of the operand stack
				String operand1 = operStack.pop();
				String operand2 = operStack.pop();
				String operator = revStack.pop();
				//create a string with the two operands followed the operator
				String temp = operand1 + " " + operand2 + " " + operator;
				//push that string onto the operand stack
				operStack.push(temp);
			}
		}
		//pop the postfix expression off the stack
		String convertedExpression = operStack.pop();
		if(!operStack.isEmpty()) {
			throw new StackFull();
		}
		return convertedExpression;
	}
	

	public String postfixToPrefix(String expression) {
		var revStack = new Stack<String>();
		var operStack = new Stack<String>();
		//tokenize the string containing the postfix expression
		String [] token;
		
		//if it is a space
		if (expression.contains(" ")) {
			token = expression.split(" ");
		}else {
			token = expression.split("");
		}
		
		while(!revStack.isEmpty()) {
			operStack.push(revStack.pop());
		}
		for (int i= token.length-1;i>=0;i--) {
			operStack.push(token[i]);
		}
		while(!operStack.isEmpty()) {
			if(!isOperator(operStack.peek())) {
				revStack.push(operStack.pop());
			}else {
				String operand2 = revStack.pop();
				String operand1 = revStack.pop();
				String operator = operStack.pop();
				String temp = operator+" "+operand1+" "+operand2;
				revStack.push(temp);
			}
		}
		String convertedString = revStack.pop();
		
		if(!revStack.isEmpty()) {
			throw new StackFull();
		}
		return convertedString;
	}
}





