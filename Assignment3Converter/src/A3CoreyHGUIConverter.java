
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Implement GUIConverter class using JFrame and JPanel as follows:
public class A3CoreyHGUIConverter extends JFrame { 

    public static void main(String[] args) {
        A3CoreyHGUIConverter converter = new A3CoreyHGUIConverter();
    }

    public A3CoreyHGUIConverter() throws HeadlessException {
        super("Welcome to Converter"); 
        setLayout(new BorderLayout()); //layout for GUI
        add(east(), BorderLayout.EAST); //Temperature area
        add(center(), BorderLayout.CENTER);//Distance area
        add(bottom(), BorderLayout.SOUTH);//Exit area
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 230);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    //"Center Panel"
    private JPanel center() {
        JPanel distPanel = new JPanel();
        distPanel.setLayout(new GridLayout(1, 1));
        JButton distButton = new JButton("Distance Converter");
        distPanel.add(distButton);
        distButton.addActionListener(new ActionListener() { 
        	@Override
        	public void actionPerformed(ActionEvent e) {		
        	//an input dialog pop up when Distance Converter is clicked             
        		String input = JOptionPane.showInputDialog(null, 
            		"Input miles distance to convert");                   
        		double value = Double.NaN;//Not a Number
        		if (input != null) { //in case user clicks cancel after clicking Distance
        			try {
        				value = Double.parseDouble(input);
        			} catch (NumberFormatException ex) {
        				value = Double.NaN;//Not a Number
        			}
            	A3CoreyHDistanceConverter converter = new A3CoreyHDistanceConverter(value);
            	JOptionPane.showMessageDialog(null,
                    value + " miles equals "
                    + converter.convert() + " kilometers");
        		}
        	}
        });
    return distPanel;
    }

    //"East Panel"
    private JPanel east() {
        JPanel tempPanel = new JPanel();
        tempPanel.setLayout(new GridLayout(1, 1));
        JButton tempButton = new JButton("Temperature Converter");
        tempPanel.add(tempButton);  
 
        tempButton.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
	
        		String input = JOptionPane.showInputDialog(null,
                    "Input fahrenheit temperature to convert");
        		double value = Double.NaN;//Not a Number
        		//if user clicks cancel program will revert to first window
        		if (input != null) {
        			try {
        				value = Double.parseDouble(input);
        			} catch (NumberFormatException ex) {
        				value = Double.NaN;//Not a Number
        			}
            	A3CoreyHTemperatureConverter converter = 
            		new A3CoreyHTemperatureConverter(value);
            	JOptionPane.showMessageDialog(null,
                    value + " F equals "
                    + converter.convert() + " C");
        		}
        	}
        });        
        return tempPanel;
    }

    //"South Panel"
    private JPanel bottom() {
        JPanel exitPanel = new JPanel();
        exitPanel.setLayout(new GridLayout(1, 1));
        JButton exitButton = new JButton("Exit");
        exitPanel.add(exitButton); 
        exitButton.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
        		// When user clicks Exit, the program will terminate
        		System.exit(0);
        	}
        });
        return exitPanel;

    }
    
}




