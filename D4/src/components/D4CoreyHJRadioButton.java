package components;//important for now...

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.beans.*; //Property change stuff
import java.awt.*;
import java.awt.event.*;

 //D4CoreyHJRadioButton.java requires these files: CustomDialog.java
    
public class D4CoreyHJRadioButton extends JPanel {
    JLabel label;									
    JFrame frame;									
    String dialogDesc = "Just a simple radio button"; 
    					

    //Creates the GUI shown inside the frame's content pane. 
    public D4CoreyHJRadioButton(JFrame frame) {
        super(new BorderLayout());
        this.frame = frame;											
       
        //Create the components.
        JPanel featurePanel = mainDialogBox();
        label = new JLabel("Click the \"CLICK HERE\" button" + " to bring up the selected dialog.", JLabel.CENTER);
             
        //Lay them out.
        Border padding = BorderFactory.createEmptyBorder(20,20,5,20);        
        featurePanel.setBorder(padding);
      
        //Lets get rid of this tabbed feature
        JTabbedPane tabbedPane = new JTabbedPane();  
        tabbedPane.addTab("More Dialogs", null, featurePanel,dialogDesc); //tooltip text        
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

    //Creates the panel shown by the second tab. 
    private JPanel mainDialogBox() {
        final int numButtons = 2;
        JRadioButton[] radioButtons = new JRadioButton[numButtons];
        final ButtonGroup group = new ButtonGroup();

        JButton showItButton = null;
        final String nonAutoCommand = "nonautooption"; //non-auto-closing radio button

        radioButtons[0] = new JRadioButton("Red Pill");//These buttons do the same thing
        radioButtons[0].setActionCommand(nonAutoCommand);//This is on purpose
        
        radioButtons[1] = new JRadioButton("Blue Pill");//These buttons do the same thing
        radioButtons[1].setActionCommand(nonAutoCommand);//I did this to give the illusion of choice

        for (int i = 0; i < numButtons; i++) {
            group.add(radioButtons[i]);
        }
        radioButtons[0].setSelected(true);

        showItButton = new JButton("CLICK HERE");
        showItButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = group.getSelection().getActionCommand();

               
                	if (command == nonAutoCommand) {
                    final JOptionPane optionPane = new JOptionPane("The only way to close this dialog is by\n" + "pressing one of the following buttons.\n"+ "Do you understand?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);

                    //You can't use pane.createDialog() because that
                    //method sets up the JDialog with a property change
                    //listener that automatically closes the window
                    //when a button is clicked.
                    final JDialog dialog = new JDialog(frame, "Click a button", true);                               
                    dialog.setContentPane(optionPane);
                    dialog.setDefaultCloseOperation(
                        JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent we) {
                            setLabel("Thwarted user attempt to close window.");
                        }
                    });
                    optionPane.addPropertyChangeListener(
                        new PropertyChangeListener() {
                            public void propertyChange(PropertyChangeEvent e) {
                                String prop = e.getPropertyName();

                                if (dialog.isVisible()
                                 && (e.getSource() == optionPane)
                                 && (JOptionPane.VALUE_PROPERTY.equals(prop))) {
                                    //If you were going to check something
                                    //before closing the window, you'd do
                                    //it here.
                                    dialog.setVisible(false);
                                }
                            }
                        });
                    dialog.pack();
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);

                    int value = ((Integer)optionPane.getValue()).intValue();
                    if (value == JOptionPane.YES_OPTION) {
                        setLabel("Good.");
                    } else if (value == JOptionPane.NO_OPTION) {
                        setLabel("Try using the window decorations " + "to close the non-auto-closing dialog. " + "You can't!");                                          
                    } else {
                        setLabel("Window unavoidably closed (ESC?).");
                    }
                	 }
                //non-auto-closing dialog with custom message area
                //NOTE: if you don't intend to check the input,
                //then just use showInputDialog instead.
                
            }
        });

        return createPane(dialogDesc + ":", radioButtons, showItButton);
                                                
    }
     // Create the GUI and show it. For thread safety, this method should be invoked from the event-dispatching thread.
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
