import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Test {

	public static void main(String[] args) {

		/*****************************
		 * panel stuff
		 *****************************/
		TinyGIS panel = new TinyGIS();
		JLabel instruct = new JLabel("Left-click to name a Point of Interest, Right-click to mark a path");
		
		BufferedImage campus = null;
		try {
			campus = ImageIO.read(new File(Test.class.getResource("campus.png").toURI()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.setCampus(campus);
		panel.add(instruct);
		
		
		/*****************************
		 * Menu stuff
		 *****************************/
		 
		JMenuBar menuBar = new JMenuBar(); 
		JMenu fileMenu = new JMenu("File"); 
		JMenuItem openMenuItem = new JMenuItem("Open...");
		JMenuItem saveMenuItem = new JMenuItem("Save..."); 
		
		openMenuItem.addActionListener(panel);
		saveMenuItem.addActionListener(panel);
		// add menu items to menu 
		fileMenu.add(openMenuItem); 
		fileMenu.add(saveMenuItem);
		// add menu to menu bar
		menuBar.add(fileMenu);

		/********************************/
		
		JFrame frame = new JFrame("Tiny GIS");
		
		// add the menubar
		frame.setJMenuBar(menuBar);
		
		// add panel
		frame.add(panel);
		
		// frame setup
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
	}

}
