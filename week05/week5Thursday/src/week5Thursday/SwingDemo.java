package week5Thursday;

import javax.swing.*;

public class SwingDemo {
	SwingDemo() {
		JFrame jfrm = new JFrame("A Simple Swing App");
		
		jfrm.setSize(275, 100);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlab = new JLabel("Swing defines...");
		
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
		
	}
	
}

