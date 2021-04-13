import javax.swing.JOptionPane;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 //D4CoreyHJRadioButton.java requires these files: CustomDialog.java
    
public class D4CoreyHJRadioButton extends JPanel {
    JLabel label;									
    JFrame frame;									
    String dialogDesc = "This is your last chance. After this, there is no turning back"; 
    					
    //Creates the GUI shown inside the frame's content pane. 
    public D4CoreyHJRadioButton(JFrame frame) {
        super(new BorderLayout());
        this.frame = frame;											
       
        //Create the components.
        JPanel featurePanel =  mainDialogBox();
        label = new JLabel("Click the \"CLICK HERE\" button" + " to bring up the selected dialog.", JLabel.CENTER);
             
        //Layout.
        Border padding = BorderFactory.createEmptyBorder(20,20,5,20);        
        featurePanel.setBorder(padding);
      
        
        JTabbedPane tabbedPane = new JTabbedPane();  
        tabbedPane.addTab("Tab" , null, featurePanel, dialogDesc); //tooltip text        
        add(tabbedPane, BorderLayout.CENTER);
        add(label, BorderLayout.PAGE_END);
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
    }
    //Sets the text displayed at the bottom of the frame.
    void setLabel(String newText) {
        label.setText(newText);
    }

     //Used to create a pane containing a description, a single column of radio buttons, and the CLICK HERE button.
    private JPanel createPane(String description, JRadioButton[] radioButtons, JButton showButton) {
                                                         
        int numChoices = radioButtons.length;
        JPanel box = new JPanel();
        JLabel label = new JLabel(description);

        box.setLayout(new BoxLayout(box, BoxLayout.PAGE_AXIS));
        box.add(label);

        for (int i = 0; i < numChoices; i++) {
            box.add(radioButtons[i]);
        }

        JPanel pane = new JPanel(new BorderLayout());
        pane.add(box, BorderLayout.PAGE_START);
        pane.add(showButton, BorderLayout.PAGE_END);
        return pane;
    }

    //Creates the panel shown . 
    private JPanel mainDialogBox() {
        int numButtons = 2;
        JRadioButton[] radioButtons = new JRadioButton[numButtons];
        ButtonGroup group = new ButtonGroup();

        JButton showItButton = new JButton("CLICK HERE");
        
        final String bluePillOption = "bluePill";
        final String redPillOption = "redPill"; 

        radioButtons[0] = new JRadioButton("Red Pill");//These buttons do the same thing
        radioButtons[0].setActionCommand(redPillOption);//This is on purpose
        
        radioButtons[1] = new JRadioButton("Blue Pill");//These buttons do the same thing
        radioButtons[1].setActionCommand(bluePillOption);//I did this to give the illusion of choice

        for (int i = 0; i < numButtons; i++) {
            group.add(radioButtons[i]);
        }
        radioButtons[0].setSelected(true);

        
        showItButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = group.getSelection().getActionCommand();

               
                	if (command == bluePillOption) {     
                        int n = JOptionPane.showConfirmDialog(
                                    frame, "You take the blue pill - the story ends\n" 
                                    		+ "you wake up in your bed and believe\n"
                                    		+ "whatever you want to believe.", 
                                    		null, 
                                    		JOptionPane.YES_NO_OPTION);
                        
                        if (n == JOptionPane.YES_OPTION) {
                        	setLabel("Enjoy your stay");
                        } else if (n == JOptionPane.NO_OPTION) {
                        	setLabel("Are you seeking the truth?");
                        } else {
                        	setLabel("Remember that all I am offering is the truth");
                        }
                    
                	} else if (command == redPillOption) {     
                		Object[] options = {"Yes", "No"};
                		int n = JOptionPane.showOptionDialog(
                                frame, "You take the red pill - you stay in Wonderland \n" 
                                + "and I show you how deep \n"
                                + "the rabbit-hole goes.", 
                                null, 
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                options,
                                options[0]);                               
                     if (n == JOptionPane.YES_OPTION) {
                    	 setLabel("Come with me");
                     } else if (n == JOptionPane.NO_OPTION) {
                         setLabel("Are you seeking the truth?");
                     } else {
                         setLabel("Remember that all I am offering is the truth");
                     }
                	 }
                    return;
                }
            });

            return createPane(dialogDesc + ":",
                              radioButtons,
                              showItButton);
        }

     // Create and show the GUIt.
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("D4CoreyHJRadioButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        D4CoreyHJRadioButton newContentPane = new D4CoreyHJRadioButton(frame);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread: creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
