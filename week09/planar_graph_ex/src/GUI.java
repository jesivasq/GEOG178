import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {
	
		Nodes nodes = new Nodes();
		Lines graph = new Lines();
	
	public GUI() {
		super(true);
		setPreferredSize(new Dimension(600,600));
		
		Lines network =  new Lines();
			  network.add(new Line(new Point(200, 400), new Point(500, 200))); 
			  network.add(new Line(new Point(100, 100), new Point(500, 500)));
			  network.add(new Line(new Point(50,  300), new Point(500, 300)));
			  network.add(new Line(new Point(250, 100), new Point(250, 500)));
		
		 //network.add(new Line(new Point(30, 30), new Point(300, 30)));
			  
		nodes = network.buildNodes();
		graph = network.buildGraph();
		
		System.out.println(nodes.size());
		System.out.println(graph.size());
	}
	
	public void paintComponent(Graphics g) {
	
		for (int i = 0; i < graph.size(); i++) {
			Random rand  = new Random();
	
				float r  = (float)  Math.random();
				float g1 = (float) Math.random()
;				float b  = (float) Math.random();
				g.setColor(new Color(r,g1,b));
			graph.get(i).draw(g);
		}
		
		for (int i = 0; i < nodes.size(); i++) {
			g.setColor(Color.black);
			nodes.get(i).getP().draw(g);
		}		
}

	public static void main(String[] args) {
		GUI panel = new GUI();
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
