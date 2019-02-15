package edu.geog.ucsb.week6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

// A over-simplified GUI for drawing.
public class EmptyDrawingPanel extends JPanel {

	// A very simple example. In your case your points, polylines, polygons, and buffers go here.
	// Do not use the AWT Point, Polyline, and Polygon classes, they are only for painting. Use your own classes.
	private ArrayList<Point> somePoints;
	
	public EmptyDrawingPanel() {
		// Feel free to ignore, this just calls the constructor of JPanel to enable  DoubleBuffering to avoid flickering.
		super(true); 
		
		// Don't forget to instantiate the list or you will get a NullPointerException
		somePoints = new ArrayList<Point>();
		// Set the (preferred) size of the panel
		setPreferredSize(new Dimension(500,500));
	}

	/*
	 * Java takes care of calling this method. For this reason we had to define EmptyDrawingPanel 
	 * as a subclass of JPanel above. You do not need to call the method by hand. If, however, you
	 * change data in your model, e.g., the Point, you will have to call repaint() and repaint will call
	 * paintComponent and give it the graphic object g.
	 * 
	 */
	public void paintComponent(Graphics g) {
        super.paintComponent(g);    // Paints all other stuff, e.g., background.
        
    // Very simple example of how to paint your points.
    if(somePoints.size()==2){
    g.drawLine(
    		(int)(somePoints.get(0)).getX(), 
    		(int)(somePoints.get(0)).getY(), 
    		(int)(somePoints.get(1)).getX(), 
    		(int)(somePoints.get(1)).getY()
    		);
    g.setColor(Color.RED);
    g.fillOval((int)(somePoints.get(0)).getX()-4, (int)(somePoints.get(0)).getY()-4, 8, 8);
    g.fillOval((int)(somePoints.get(1)).getX()-4, (int)(somePoints.get(1)).getY()-4, 8, 8);
    	}
	}

	public static void main(String[] args) throws InterruptedException {
		
		EmptyDrawingPanel aPanel = new EmptyDrawingPanel();
		
		aPanel.somePoints.add(new Point(100,100));
		aPanel.somePoints.add(new Point(200,200));
			
		// You always need a frame to place other components such as panels or buttons
		JFrame frame = new JFrame("An (almost) empty panel");

		// Add an instance of the MinimalDrawingGUI to the frame.
		frame.add(aPanel);
		
		// Set the size, arrange components, and display the frame.
		frame.pack();
		frame.setVisible(true);
		
		// exit on close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

