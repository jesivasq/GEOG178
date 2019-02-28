import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		JFrame frame = new JFrame("Tiny GIS");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
	}

}
