package hwWk7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ListenerPanel extends JPanel implements MouseListener, MouseMotionListener{
	
	ArrayList<Point> ary;
	private int x = 0;
	private int y = 0;

	public ListenerPanel() {
		super(true);
		// TODO Auto-generated constructor stub
		// Set the (preferred) size of the panel
		setPreferredSize(new Dimension(500,500));
		ary = new ArrayList<Point>();
		
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
		//System.out.println("mouse clicked");
		
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
		//System.out.println("Mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Mouse released");
		System.out.println(arg0.toString());
		x = arg0.getX();
		y = arg0.getY();
		ary.add(new Point( x, y));
		repaint();
	}

	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);  
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);


        g2d.setColor(Color.black);
        
        for(int i = 0; i < ary.size(); i++) {
        	g2d.fillOval((int)ary.get(i).getX()-5, (int)ary.get(i).getY()-5, 10, 10);
        	if(i > 0) g.drawLine(ary.get(i-1).getX(), ary.get(i-1).getY(), ary.get(i).getX(), ary.get(i).getY());
        }
	}

	
}
