import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class run {

	public static void main(String[] args) throws IOException, URISyntaxException {
		tinyGIS panel = new tinyGIS();
		
		BufferedImage campus; 
		campus = ImageIO.read(new File(run.class.getResource("campus.png").toURI()));
		panel.setCampus(campus);
		
		JFrame frame = new JFrame("Tiny GIS");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

}
