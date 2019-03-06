// mostly from https://www.geeksforgeeks.org/java-swing-jmenubar/

//Java program to construct 
//Menu bar to add menu items 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException; 

public class Menu extends JFrame implements ActionListener{ 
	// menubar 
	static JMenuBar mb; 

	// JMenu 
	static JMenu fileMenu; 

	// Menu items 
	static JMenuItem openMenuItem, saveMenuItem, m3; 

	// create a frame 
	static JFrame f;


	public Menu() {
		// create a frame 
		f = new JFrame("Menu demo"); 

		// create a menubar 
		mb = new JMenuBar(); 

		// create a menu 
		fileMenu = new JMenu("Menu"); 

		// create menuitems 
		openMenuItem = new JMenuItem("Open..."); 
		saveMenuItem = new JMenuItem("Save..."); 
		m3 = new JMenuItem("MenuItem3"); 
		
		// test
		openMenuItem.addActionListener(this);
		saveMenuItem.addActionListener(this);
		m3.addActionListener(this);

		// add menu items to menu 
		fileMenu.add(openMenuItem); 
		fileMenu.add(saveMenuItem); 
		fileMenu.add(m3); 

		// add menu to menu bar 
		mb.add(fileMenu); 

		// add menubar to frame 
		f.setJMenuBar(mb); 

		// set the size of the frame 
		f.setSize(500, 500); 
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// When somebody clicks on the menu
		if(e.getSource() == openMenuItem) {
			
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Open");
			int fileChooserResult = fileChooser.showOpenDialog(f);
			
			if(fileChooserResult == JFileChooser.APPROVE_OPTION) {
				File openPath = fileChooser.getSelectedFile();
				
				try {
					FileInputStream fileIn = new FileInputStream(openPath.getAbsolutePath());
					
					
				} catch (FileNotFoundException i ) {
					System.out.println("Open failed");
				} catch (IOException i ) {
					System.out.println("Open failed");
				} // end try/catch
			} else {
				System.out.println("Open cancelled");
			}
		} // end if for menu choices
	} // end actionPerformed
	
} 
