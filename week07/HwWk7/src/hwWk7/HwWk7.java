package hwWk7;

import java.awt.*;
//import java.awt.FlowLayout;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JRadioButton;
//import javax.swing.JFrame;

import hwWk7.MyPanel;
import hwWk7.Point;

public class HwWk7 implements ActionListener{

	
	ListenerPanel foo;
	//JRadioButton rb1, rb2;
	
	HwWk7(){
		
		// set the basic properties of the frame
		JFrame jfrm = new JFrame("Close the Polygon");
		jfrm.setLayout(new FlowLayout()); // i think this is the default, but JIC
		jfrm.setSize(500, 700);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// make a new panel
		foo = new ListenerPanel();
		
		// make the buttons
		JButton btnClose = new JButton("Close the polygon");
		JButton btnReset = new JButton("Reset");
		
		btnClose.addActionListener(this);
		btnReset.addActionListener(this);
		
//		rb1 = new JRadioButton();
//		rb2 = new JRadioButton();
//		ButtonGroup g1 = new ButtonGroup();
//		
//		rb1.setText("Waypoints");
//		rb2.setText("POIs");
//		
//		// add the button to the frame
//		//jfrm.add(btnClose);
//		jfrm.add(rb1);
//		jfrm.add(rb2);
//		g1.add(rb1);
//		g1.add(rb2);
//		rb1.setSelected(true);
		
		foo.addMouseListener(foo);
		foo.addMouseMotionListener(foo);
		jfrm.add(foo);
		jfrm.pack();
		
		
		// set to visible or we'll never see it (oops)
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		System.out.println("ae.toString():\n" + ae.toString());
	}
	

	
	
}
