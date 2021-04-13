


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameEX {

    public static void main(String[] args) {

		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("Hello World");
		content.add(label, BorderLayout.CENTER);
		
        JFrame window = new JFrame("GUI Test"); //Title Bar ("GUI Test")
        window.setContentPane(content); //MUST be here to use content from above!
        window.setSize(250, 100);
        window.setLocation(400, 400);
        window.setVisible(true);
    }
}



