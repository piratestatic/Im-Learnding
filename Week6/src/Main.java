/*
 * Corey Hodges
 * Project 3
 * 27 June 2021
 * BinarySearchTree
 *
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main extends JFrame {

	private JTextField input = new JTextField(20), output = new JTextField(30);
	private static BinaryTree inputTree;

	//main here
	public static void main(String[] args) {
		Main frame = new Main();
		frame.setVisible(true);
	}

	
	public Main() {
		super("Binary Tree Categorizer");
		setSize(715, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		JComponent[] inputComponents = {new JLabel("Enter Tree:"), input};
		JComponent[] outputComponents = {new JLabel("Output"), output};
		JButton[] buttonComponents = {new JButton("Make Tree"), new JButton("Is Balanced?"),
				new JButton("Is Full?"), new JButton("Is Proper?"), new JButton("Height"),
				new JButton("Nodes"), new JButton("Inorder")};
		makeFlowPanel(inputComponents);
		makeFlowPanel(buttonComponents);
		makeFlowPanel(outputComponents);
		addActionListeners(buttonComponents);
		output.setEditable(false);
		setResizable(false);
	}

	
	private void makeFlowPanel(JComponent[] components) {
		JPanel panel = new JPanel(new FlowLayout());
		for (Component component: components) { 
			panel.add(component); 
		}
		add(panel);
	}
	
	private void addActionListeners (JButton[] buttons){
		for (JButton button: buttons){
			button.addActionListener(treeListener);
		}
	}
	
	private final ActionListener treeListener = event -> {
		try {
			switch ((event.getActionCommand())){
			
			case "Make Tree":
				inputTree = new BinaryTree(input.getText());
				output.setText(inputTree.toString());
				break;
			case "Is Balanced?":
				output.setText(String.valueOf(inputTree.isBalanced()));
				break;
			case "Is Full?":
				output.setText(String.valueOf(inputTree.isFull()));
				break;
			case "Is Proper?":
				output.setText(String.valueOf(inputTree.isProper()));
				break;
			case "Height":
				output.setText(String.valueOf(inputTree.height()));
				break;
			case "Nodes":
				output.setText(String.valueOf(inputTree.nodes()));
				break;
			case "Inorder":
				output.setText(inputTree.inOrder());
				break;
			}
		} catch (InvalidTreeSyntax except) {
			JOptionPane.showMessageDialog(getParent(),except.getMessage());
		}catch (IndexOutOfBoundsException indexExcept) {
			JOptionPane.showMessageDialog(getParent(),"You have to plant seeds to make a tree!");
		}
	};
}