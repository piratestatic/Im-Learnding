/*
 * Corey Hodges
 * Project 3
 * 27 June 2021
 * BinarySearchTree
 *
 */

import java.util.*;

public class BinaryTree {

	Node parent, child;

	public BinaryTree(String input) throws InvalidTreeSyntax {
		Stack<Node> nodeStack = new Stack<>();
		String[] inputArray = input.substring(1, input.length()-1) 
				// split the String into an array of strings
				.split("(?<=\\()|(?=\\()|(?<=\\))|(?=\\))");
		parent = new Node(inputArray[0]); //setting the new first character to the root
		for (int i = 1; i < inputArray.length - 1; i++) {
			//Child becomes parent if one exists
			if (inputArray[i].equals("(")) { 
				nodeStack.push(parent);
				if (child != null) { 
					parent = child; 
				}
			//assign the current parent as the child of one on stack
			}
			else if(inputArray[i].equals(")")) {
				try { 
					child = parent; 
					parent = nodeStack.pop();
				}
				catch (EmptyStackException emptyStack) { 
					throw new InvalidTreeSyntax("Incorrect parenthesis!"); 
					}
				//child to parent zone.
			}
			else { 
				child = new Node(inputArray[i]);
			if (parent != null) { 
					parent.addChild(child); 
				}
			}
		}
		//every node will have 2 parenthesis
		if (this.recNodes(parent) * 3 != input.length()) throw new InvalidTreeSyntax("Incorrect Syntax");
	}

	
	public boolean isBalanced() { 
		return recIsBalanced(this.parent); 
		}

	private boolean recIsBalanced(Node root) {
		//base case
		if (root == null) {
			return true;
		}
		//return true if the absolute difference is at most 1
		return (Math.abs(recHeight(root.left) - recHeight(root.right)) <= 1) &&
				(recIsBalanced(root.left) && recIsBalanced(root.right));
	}

	
	public boolean isFull() {
		return recIsFull(this.parent, recHeight(this.parent), 0); 
	}
	//the index of parent is 0
	private boolean recIsFull(Node root, int height, int index) {
		if (root == null) { 
			return true; 
		}
		//check to see if height is same among leaves
		if (root.left == null && root.right == null) { 
			return (height == index + 1); 
			}
		//one child empty
		if (root.left == null || root.right == null) { 
			return false;
			}
		//recursive call to both children
		return recIsFull(root.left, height, index + 1) && recIsFull(root.right, height, index+1);
	}
	
	public boolean isProper() { 
		return recIsProper(this.parent); 
	}

	private boolean recIsProper(Node root) {
		//base case
		if(root == null) {
			return true;
		}
		//returns true if two or false if zero
		return ((root.left != null || root.right == null) && (root.left == null || root.right != null))
				&& (recIsProper(root.left) && recIsProper(root.right)); 
	}

	public int height() {
		return recHeight(this.parent)-1; 
	}
	//subtracted one since root is 0
	private int recHeight(Node root) {
		//adds one to the greater of left and right, zero if null
		return (root == null) ? 0 : 1 + Math.max(recHeight(root.left), recHeight(root.right));
	}
	
	public int nodes() { 
		return recNodes(this.parent); 
	}

	private int recNodes(Node root) {
		return (root == null) ? 0 : 1 + recNodes(root.left) + recNodes(root.right);
	}
	
	public String inOrder() {
		return recInOrder(this.parent);
	}
	private String recInOrder(Node root) {
		return (root == null) ? "" : "(" + recInOrder(root.left) + root.info + recInOrder(root.right) + ")";
	}

	// simply calls the the root node toString
	@Override
	public String toString() { 
		return parent.toString(); 
	}


	public static class Node {
		private String info;
		private Node left, right;
		
		public Node(String info) { 
			this.info = info; 
		}

		private void addChild(Node child) throws InvalidTreeSyntax {
			//nodes can have 2 children at most 
			if (this.left == null) { 
				this.setLeft(child); 
			}
			else if (this.right == null) { 
				this.setRight(child); 
			}
			else { 
				throw new InvalidTreeSyntax("Nodes can only have 2 children!");
			} 
		}

		private void setLeft(Node newLeft) { 
			left = newLeft; 
		}
		
		private void setRight(Node newRight) { 
			right = newRight; 
		}

		@Override //To call the recursive method
		public String toString() { 
			return toString(this); 
		}
		// recursively printing out the nodes
		private static String toString(Node root) {
			return (root == null) ? "" : "(" + root.info + toString(root.left) + toString(root.right) + ")";
		}
	}
}