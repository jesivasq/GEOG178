package hwWk6;

import java.awt.*;
import java.awt.Canvas;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.*;
import java.util.ArrayList;

public class HwWk6 implements ActionListener{

	
	MyPanel foo;
	
	HwWk6(){
		
		// set the basic properties of the frame
		JFrame jfrm = new JFrame("Close the Polygon");
		jfrm.setLayout(new FlowLayout()); // i think this is the default, but JIC
		jfrm.setSize(500, 700);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// make a new panel
		foo = new MyPanel();
		
		// make the buttons
		JButton btnClose = new JButton("Close the polygon");
		JButton btnReset = new JButton("Reset");
		
		btnClose.addActionListener(this);
		btnReset.addActionListener(this);
		
		// add the button to the frame
		jfrm.add(btnClose);
		jfrm.add(foo);
		jfrm.pack();
		
		
		// set to visible or we'll never see it (oops)
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getActionCommand().equals("Close the polygon")) {		
			
			System.out.println("close");
			ArrayList<Point> p = foo.getAry();
			int last = p.size()-1;
			
			if((p.get(last) != p.get(0)) && p.get(last).distance(p.get(0)) <= 50) {
				p.add(p.get(0));
				foo.repaint();
				System.out.println("polygon closed");
			} else {
				System.out.println("no, distance too great");
			}
		} else {
			
			System.out.println("This should not run");
		}
	}
	

	
	
}
