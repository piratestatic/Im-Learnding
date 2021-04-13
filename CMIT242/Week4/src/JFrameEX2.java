import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameEX2 {
	//method to draw "Hellow World!"
    private static class HelloWorldDisplay extends JPanel {  //JPanel is built into Java

      public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawString( "Hello World!", 200, 300 ); // ("text in box", X location of text, Y location of text)

      }

    }

    public static void main(String[] args) {

        HelloWorldDisplay displayPanel = new HelloWorldDisplay(); //creates instance of the class that draws "Hellow World!"

        JPanel content = new JPanel(); // creates new content instance - retangle where other components can be added
        content.setLayout(new BorderLayout());
        content.add(displayPanel, BorderLayout.CENTER); //notes from class says this prints Hello World in the CENTER...

        JFrame window = new JFrame("GUI Test"); // (Text in title bar)
        window.setContentPane(content); // adds content from above, notes says there should be an OK button...
        window.setSize(500, 500); //X & Y window size
        window.setLocation(500, 400); //X & Y location of window on screen
        window.setVisible(true);
    }
}
