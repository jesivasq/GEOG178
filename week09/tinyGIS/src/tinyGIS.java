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

public class tinyGIS extends JPanel implements MouseListener, ActionListener {

	private ArrayList<POI> poi = new ArrayList<POI>();
	private BufferedImage campus;
	private int buff = 10;
	private JButton lab = new JButton("Turn labels on");
	private boolean labelflag = false;
	
	public tinyGIS() { 
		super(true);
		setPreferredSize(new Dimension(699, 446));
		this.addMouseListener(this);
		add(lab);
		this.lab.addActionListener(this);
	}
	
	public BufferedImage getCampus() {
		return campus;
	}

	public void setCampus(BufferedImage campus) {
		this.campus = campus;
	}
	
	// View 
	
	public void paintComponent(Graphics g) {
		g.drawImage(campus, 0, 0, this);
		
		for (int i = 0; i < poi.size(); i++) {
			g.setColor(Color.red);
			g.fillOval((int) poi.get(i).getCenter().getX() - 5 , 
					(int) poi.get(i).getCenter().getY() - 5, 
					10, 
					10);
			
			if(labelflag) {
				g.setColor(Color.black);
				g.setFont(new Font("default", Font.BOLD, 22));
				g.drawString(poi.get(i).getName(), 
						(int) poi.get(i).getCenter().getX() - 10 , 
						(int) poi.get(i).getCenter().getY() - 10);
			}
			
		}
	}

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
		Point tmp = new Point(e.getX(), e.getY());
		POI tmpPOI = new POI(tmp, buff, "Unnamed", false);
		String name = JOptionPane.showInputDialog("Enter POI name: ");
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
		if(e.getSource() == lab) {
			labelflag = !labelflag;
		}
		
		if(labelflag) { lab.setText("Turn labels off"); 
		} else { 
			lab.setText("Turn labels on");
		}
	
		
		repaint();
		
	}
	

}
