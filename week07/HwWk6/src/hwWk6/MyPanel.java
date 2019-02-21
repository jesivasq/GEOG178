package hwWk6;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;
import java.util.ArrayList;

public class MyPanel extends JPanel{
	
	ArrayList<Point> ary;
	
	public MyPanel() {
		super(true);
		setBorder(BorderFactory.createLineBorder(Color.black));
		ary = new ArrayList<Point>();
		
		ary.add(new Point(50, 50));
		ary.add(new Point(150, 50));
		ary.add(new Point(200, 100));
		ary.add(new Point(100, 150));
		ary.add(new Point(40, 180));
		ary.add(new Point(40, 80));  // comment out this line to see the polygon fail to close
	}
	
	// getter
	public ArrayList<Point> getAry() {
		return ary;
	}

	// setter
	public void setAry(ArrayList<Point> ary) {
		this.ary = ary;
	}


	public Dimension getPreferredSize() {
		return new Dimension(250,200);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//g.drawString("This is a MyPanel", 10, 20);
		//g.drawLine(0, 0, 50, 50);
		
		for(int i = 1; i < ary.size(); i++) {
			g.drawLine(ary.get(i-1).getX(), ary.get(i-1).getY(), ary.get(i).getX(), ary.get(i).getY());
		}
	}
	
}
