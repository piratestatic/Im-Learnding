import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {
	public GUI() {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane);
		layeredPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton tempButton = new JButton("Temperature Converter");
		tempButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		layeredPane.add(tempButton);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(tempButton, popupMenu);
		
		JButton distbutton = new JButton("Distance Converter");
		layeredPane.add(distbutton);
		
		JButton btnNewButton = new JButton("Exit");
		layeredPane.add(btnNewButton);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
