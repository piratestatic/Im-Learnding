import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrePostGUI extends JFrame
{
	private JTextField input = new JTextField(20), output = new JTextField(20);
	private final JButton evaluate = new JButton("Evaluate");
	private PostfixEvaluator postfixEvaluator = new PostfixEvaluator(); 
	
	private final ActionListener evaluator = event ->
	{
		try
		{
			Integer value = postfixEvaluator.evaluateExpression(input.getText());
			output.setText("" + value);
		}
		catch (DivideByZero exception)
		{
			JOptionPane.showMessageDialog(null, "Division By Zero");
		}
	};
	
	public PrePostGUI()
	{
		super("Postfix Expresson Evaluator");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		JComponent[] inputComponents = {new JLabel("Enter Postfix Expression"),
			input};
		makeFlowPanel(inputComponents);
		JComponent[] buttonComponents = {evaluate};
		makeFlowPanel(buttonComponents);
		JComponent[] outputComponents = {new JLabel("Result"), output};
		makeFlowPanel(outputComponents);	
		output.setEditable(false);
		evaluate.addActionListener(evaluator);
	}	
	
	private void makeFlowPanel(JComponent[] components)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		for (Component component: components)
			panel.add(component);
		add(panel);
	}

	public static void main(String[] args)
	{
		PrePostGUI frame = new PrePostGUI();
		frame.setVisible(true);
	}
}
