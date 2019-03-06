package lab08;

// mostly from https://www.geeksforgeeks.org/java-swing-jmenubar/

//Java program to construct 
//Menu bar to add menu items 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class Menu extends JFrame implements ActionListener{ 
	// menubar 
	static JMenuBar mb; 

	// JMenu 
	static JMenu x; 

	// Menu items 
	static JMenuItem m1, m2, m3; 

	// create a frame 
	static JFrame f;


	public Menu() {
		// create a frame 
		f = new JFrame("Menu demo"); 

		// create a menubar 
		mb = new JMenuBar(); 

		// create a menu 
		x = new JMenu("Menu"); 

		// create menuitems 
		m1 = new JMenuItem("MenuItem1"); 
		m2 = new JMenuItem("MenuItem2"); 
		m3 = new JMenuItem("MenuItem3"); 
		
		// test
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);

		// add menu items to menu 
		x.add(m1); 
		x.add(m2); 
		x.add(m3); 

		// add menu to menu bar 
		mb.add(x); 

		// add menubar to frame 
		f.setJMenuBar(mb); 

		// set the size of the frame 
		f.setSize(500, 500); 
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equalsIgnoreCase("menuItem1")) {
			System.out.println("this is menu item 1");
		}
	}
	
} 
