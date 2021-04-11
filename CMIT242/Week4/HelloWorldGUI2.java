/* <---DELETE TO USE

 
 
 
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldGUI2 {

     private static class HelloWorldDisplay extends JPanel {

          public void paintComponent(Graphics g) { // method to draw a String "Hello World!"

               super.paintComponent(g);
               g.drawString( "Hello World!", 20, 30 ); // string at x=20 and y=30
           }
     }

     private static class ButtonHandler implements ActionListener {

          public void actionPerformed(ActionEvent e) {
               System.exit(0);
          }
     }

     public static void main(String[] args) {

          HelloWorldDisplay displayPanel = new HelloWorldDisplay(); // creates an instance of the class that will draw the String "Hello World!"
          JButton okButton = new JButton("OK"); // creates the OK Button widget

          ButtonHandler listener = new ButtonHandler(); // creates the handler for the button - which has code what to do when the button is clicked
          okButton.addActionListener(listener); // adds the handler to the button widget

          JPanel content = new JPanel(); // creates new content instance - rectangle where other components can be added to
          content.setLayout(new BorderLayout());
          content.add(displayPanel, BorderLayout.CENTER); // adds the display panel instance that has the String "Hello World!" in CENTER
          content.add(okButton, BorderLayout.SOUTH); // adds the ok button below Hello string

         JFrame window = new JFrame("GUI Test"); // creates frame window with title "GUI Test"
         window.setContentPane(content); // adds content we created above which has hello String and ok button
         window.setSize(250,100); // sets size of the window
         window.setLocation(100,100); // sets x,y location where it should display
         window.setVisible(true); // makes it visible
    }

}

DELETE TO USE ---> */
