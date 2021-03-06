import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TinyGIS extends JPanel implements MouseListener, ActionListener {

	// array list for user-generated points
	private ArrayList<POI> poi = new ArrayList<POI>();
	private ArrayList<Point> waypoint = new ArrayList<Point>();
	
	
	// image
	private BufferedImage campus;
	private int buff = 10;
	
	// button
	private JButton lab = new JButton("Turn labels on");
	private boolean labelFlag = false;
	
	// constructor
	public TinyGIS() {
		super(true);
		setPreferredSize(new Dimension(699,466));
		
		// every panel we create will have a mouse listener
		this.addMouseListener(this);
		add(lab);
		this.lab.addActionListener(this);
	}
	
	
	
	// getters and setters
	public BufferedImage getCampus() {
		return campus;
	}

	public void setCampus(BufferedImage campus) {
		this.campus = campus;
	}

	// view
	public void paintComponent(Graphics g) {
		g.drawImage(campus, 0, 0, this);
		
		// draw the POIs
		for(int i = 0; i < poi.size(); i++) {
			g.setColor(Color.red);
			g.fillOval((int)poi.get(i).getCenter().getX()-5, (int)poi.get(i).getCenter().getY()-5, 10, 10);
			if(labelFlag || poi.get(i).isVisited()) {
				g.setColor(Color.black);
				g.setFont(new Font("default", Font.BOLD, 16));
				g.drawString(poi.get(i).getName(), (int)poi.get(i).getCenter().getX() + 10, (int)poi.get(i).getCenter().getY());
				
			}
		}
		
		// draw the waypoints; connect with lines if there's more than 1
		for(int j = 0 ; j < waypoint.size(); j++) {
			g.setColor(Color.black);
			g.fillOval((int)waypoint.get(j).getX()-5, (int)waypoint.get(j).getY()-5, 10, 10);
			if(j > 0 ) {
				g.drawLine((int)waypoint.get(j-1).getX(), (int)waypoint.get(j-1).getY(), (int)waypoint.get(j).getX(), (int)waypoint.get(j).getY());
			}
		}
		
		
		
	}

	// Mouse Listener Overrides
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.toString());
		// right-click is button=3,
		// left-click is button = 1;
		// e.getButton()
		//System.out.println(e.getButton());
		
		
		Point tmp = new Point(e.getX(), e.getY());
		
		// if it's a POI click, add to POI array
		if(e.getButton() == 1) {
			POI tmpPOI = new POI(tmp, buff, "Unnamed", false);
			String name = JOptionPane.showInputDialog("Enter POI Name: ");
			tmpPOI.setName(name);
			poi.add(tmpPOI);
		}
		else if( e.getButton() == 3) {	
			// if it's a waypoint click, add to waypoints
			waypoint.add(tmp);
			
			// check to see if it's close enough to turn the label on
			for(int i = 0; i < poi.size(); i++) {
				if(poi.get(i).isInside(tmp)) {
					System.out.println("is inside buffer");
					poi.get(i).setVisited(true);
				} else {
					// shut it off if it's not the currently visited point
					poi.get(i).setVisited(false);
				}
			}
		}
		
		// for both
		repaint();
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		
		if(e.getSource() == lab ) {
			labelFlag = !labelFlag;
		}
		if(labelFlag) {
			lab.setText("Turn labels off");
		} else {
			lab.setText("Turn labels on");
		}
		repaint();
		
		
	}

	
}
