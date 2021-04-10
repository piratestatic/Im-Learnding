import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameEX2 {

    private static class HelloWorldDisplay extends JPanel {

      public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawString( "Hello World!", 20, 30 );

      }

    }

    public static void main(String[] args) {

        HelloWorldDisplay displayPanel = new HelloWorldDisplay();

        JPanel content = new JPanel(); // creates
        content.setLayout(new BorderLayout());
        content.add(displayPanel, BorderLayout.CENTER);

        JFrame window = new JFrame("GUI Test");
        window.setContentPane(content); // adds
        window.setSize(50, 100);
        window.setLocation(400, 00);
        window.setVisible(true);
    }
}
