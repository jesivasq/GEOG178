package hwWk7;

import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ListenerPanel extends JPanel implements MouseListener, MouseMotionListener, ActionListener {

	//ArrayList<Point> ary;
	ArrayList<Point> aryPOI;
	ArrayList<Point> aryWP;

	private int x = 0;
	private int y = 0;
	JRadioButton rb1, rb2;
	
	BufferedImage img;

	public ListenerPanel() {
		super(true);
		// TODO Auto-generated constructor stub
		// Set the (preferred) size of the panel
		setPreferredSize(new Dimension(500, 500));
		//ary = new ArrayList<Point>();
		aryPOI = new ArrayList<Point>();
		aryWP = new ArrayList<Point>();

		rb1 = new JRadioButton();
		rb2 = new JRadioButton();
		ButtonGroup g1 = new ButtonGroup();

		rb1.setText("Waypoints");
		rb2.setText("POIs");

		// add the button to the frame
		// jfrm.add(btnClose);
		this.add(rb1);
		this.add(rb2);
		g1.add(rb1);
		g1.add(rb2);
		rb1.setSelected(true);
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		//load image
//		img = null;
//		try {
//			img = ImageIO.read(getClass().getResource("campus.png"));
//		} catch (IOException e) {
//		}

	}

	public ListenerPanel(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ListenerPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ListenerPanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("mouse clicked");

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("Mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("Mouse released");
		// System.out.println(arg0.toString());
		x = arg0.getX();
		y = arg0.getY();

		if (rb1.isSelected()) {
			aryWP.add(new Point(x, y));
		} else {
			aryPOI.add(new Point(x, y));
		}
		//ary.add(new Point(x, y));
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		//draw the map in the background
		//g.drawImage(img, 0, 0, null);
		
		// draw the POI array first, so it's behind the waypoints array
		g2d.setColor(Color.red);
		for (int i = 0; i < aryPOI.size(); i++) {
			g2d.fillOval((int) aryPOI.get(i).getX() - 10, (int) aryPOI.get(i).getY() - 10, 20, 20);
		}
		
		
		// draw the waypoints array
		g2d.setColor(Color.black);
		for (int i = 0; i < aryWP.size(); i++) {

			g2d.fillOval((int) aryWP.get(i).getX() - 5, (int) aryWP.get(i).getY() - 5, 10, 10);
			if (i > 0)
				g.drawLine(aryWP.get(i - 1).getX(), aryWP.get(i - 1).getY(), aryWP.get(i).getX(), aryWP.get(i).getY());
		}



	}

	public void actionPerformed(ActionEvent ae) {
		repaint();
		System.out.println("ae.toString():\n" + ae.toString());
	}

}
