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
	private ArrayList<Point> point = new ArrayList<Point>();
	
	
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
		
		for(int i = 0; i < poi.size(); i++) {
			g.setColor(Color.red);
			g.fillOval((int)poi.get(i).getCenter().getX()-5, (int)poi.get(i).getCenter().getY()-5, 10, 10);
			if(labelFlag) {
				g.setColor(Color.black);
				g.setFont(new Font("default", Font.BOLD, 16));
				g.drawString(poi.get(i).getName(), (int)poi.get(i).getCenter().getX() + 10, (int)poi.get(i).getCenter().getY());
				
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
		System.out.println(e.getButton());
		
		
		Point tmp = new Point(e.getX(), e.getY());
		POI tmpPOI = new POI(tmp, buff, "Unnamed", false);
		String name = JOptionPane.showInputDialog("Enter POI Name: ");
		tmpPOI.setName(name);
		poi.add(tmpPOI);
		
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
