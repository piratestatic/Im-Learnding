/*
 * Corey Hodges
 * Project 1
 * 31 May 2021
 * GUI Converter
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUIConverter extends JFrame {
	private JTextField userInput = new JTextField("", 20), output = new JTextField("", 20);
    private final JButton prefix = new JButton("Prefix to Postfix");
    private final JButton postfix = new JButton("Postfix to Prefix");
    private static Converter convert = new Converter();
		
 public GUIConverter(){
		super("Expression Evaluator");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Layout changed to handle 2 JButtons
		setLayout(new GridLayout(3, 2));
		JComponent[] inputComponents = {new JLabel("Enter Expression"),
		userInput};
		makeFlowPanel(inputComponents);
		JComponent[] buttonComponents = {prefix, postfix};
		makeFlowPanel(buttonComponents);
		JComponent[] outputComponents = {new JLabel("Result"), output};
		makeFlowPanel(outputComponents);	
		output.setEditable(false);
		prefix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
				output.setText(convert.prefixToPostfix(userInput.getText()));
				}
				catch (java.util.EmptyStackException e){
					JFrame err1 = new JFrame();
					JOptionPane.showMessageDialog(err1, "Did you mean to click Prefix to Postfix?","Invalid Operation",JOptionPane.WARNING_MESSAGE);
				} catch (StackFull e) {
					JFrame err2 = new JFrame();
					JOptionPane.showMessageDialog(err2,"Check equation for accuracy","Incorrect Format",JOptionPane.WARNING_MESSAGE);
				} catch (Exception e) {
					JFrame err3 = new JFrame();
					JOptionPane.showMessageDialog(err3, e,"System Generated",JOptionPane.WARNING_MESSAGE);
				}
				
			}	
		});
		postfix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
				output.setText(convert.postfixToPrefix(userInput.getText()));
				}
				catch(java.util.EmptyStackException e) {
						JFrame err1 = new JFrame();
						JOptionPane.showMessageDialog(err1, "Did you mean to click Postfix to Prefix?","Invalid Operation",JOptionPane.WARNING_MESSAGE);
				}
				catch(StackFull e) {
						JFrame err2 = new JFrame();
						JOptionPane.showMessageDialog(err2,"Check equation for accuracy","Incorrect Format",JOptionPane.WARNING_MESSAGE);
				}
					
				}
			});
				
	}
    private void makeFlowPanel(JComponent[] components)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		for (Component component: components)
			panel.add(component);
		add(panel);
	}

	public static void main(String[] args) {	
		GUIConverter frame = new GUIConverter();
		frame.setVisible(true);
	}
}
