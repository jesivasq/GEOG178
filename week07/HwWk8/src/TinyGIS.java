import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.*; 
import javax.swing.*; 
import java.io.*;


public class TinyGIS extends JPanel implements MouseListener, ActionListener {
	


	// array list for user-generated points
	private ArrayList<POI> poi = new ArrayList<POI>();
	private ArrayList<Point> waypoint = new ArrayList<Point>();
	private ArrayList<Way> way = new ArrayList<Way>();
	private ArrayList<PointBuffer> node = new ArrayList<PointBuffer>();
	private boolean isFirst = true; // for the Way array list
	int buffer = 20;
	Point holding;
	
	// image
	private BufferedImage campus;
	private int buff = 20;
	
	// buttons
	private JButton lab = new JButton("Turn labels on");
	private boolean labelFlag = false;
	private JButton clr = new JButton("Clear");
	
	// save file
	SaveFile saveFile;
	
	// constructor
	public TinyGIS() {
		super(true);
		setPreferredSize(new Dimension(699,466));
		
		// every panel we create will have a mouse listener
		this.addMouseListener(this);
		add(lab);
		add(clr);
		this.lab.addActionListener(this);
		this.clr.addActionListener(this);
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
			g.fillOval((int)poi.get(i).getCenter().getX()-8, (int)poi.get(i).getCenter().getY()-8, 16, 16);
			if(labelFlag || poi.get(i).isVisited()) {
				g.setColor(Color.black);
				g.setFont(new Font("default", Font.BOLD, 16));
				g.drawString(poi.get(i).getName(), (int)poi.get(i).getCenter().getX() + 10, (int)poi.get(i).getCenter().getY());
				
			}
		}
		
//		// draw the waypoints; connect with lines if there's more than 1
//		for(int j = 0 ; j < waypoint.size(); j++) {
//			g.setColor(Color.black);
//			g.fillOval((int)waypoint.get(j).getX()-5, (int)waypoint.get(j).getY()-5, 10, 10);
//			if(j > 0 ) {
//				g.drawLine((int)waypoint.get(j-1).getX(), (int)waypoint.get(j-1).getY(), (int)waypoint.get(j).getX(), (int)waypoint.get(j).getY());
//			}
//		}
//		
		
		// draw the nodes and the ways
		for(int i = 0; i < node.size(); i++) {
			g.setColor(Color.black);
			g.fillOval((int) node.get(i).getCenter().getX()-5, (int) node.get(i).getCenter().getY()-5, 10, 10);
		}
		
		for(int j = 0; j < way.size(); j++) {
			g.drawLine((int) way.get(j).getP1().getX(), (int) way.get(j).getP1().getY(), (int) way.get(j).getP2().getX(), (int)way.get(j).getP2().getY());
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
		// using e.getButton():
		// 	right-click is button=3, NODE
		// 	left-click is button = 1; POI
				
		Point tmp = new Point(e.getX(), e.getY());
		
		// if it's a POI click, add to POI array
		if(e.getButton() == 1) {
			POI tmpPOI = new POI(tmp, buff, "Unnamed", false);
			String name = JOptionPane.showInputDialog("Enter POI Name: ");
			tmpPOI.setName(name);
			poi.add(tmpPOI);
		}
		else if( e.getButton() == 3) {	
			
			// check to see if we should add it:
			// automatic yes if it's the 1st pt in the array or the second pt in a set
			// if it's the 1st pt in not the 1st set, it has to snap to an existing point
			if(node.isEmpty() ) {
				node.add(new PointBuffer(tmp, buffer));
				isFirst = false;
				System.out.println("first node created");
			} else if (node.size() == 1 ) {
				node.add(new PointBuffer(tmp, buffer));
				way.add(new Way(node.get(0).getCenter(), node.get(1).getCenter()));
				isFirst = true;
				System.out.println("second node created");
			} else if (!isFirst) {
				node.add(new PointBuffer(tmp, buffer));
				way.add(new Way(tmp, holding));
				isFirst = true;
			}
			
			
			else {
				// check to see if it's within the buffer of an existing point
				int index = -1;
				for(int i = 0 ; i < node.size(); i++) {
					if(node.get(i).isInside(tmp)) {
						index = i;
					}
				}
				if(index >= 0) {
					holding = node.get(index).getCenter();
					isFirst = false;
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
		// for all the actionListeners out there
		//System.out.println(e.toString());
		
		if(e.getSource() == lab ) {
			// then the user clicked the turn labels on/off button
			labelFlag = !labelFlag;
			if(labelFlag) {
				lab.setText("Turn labels off");
			} else {
				lab.setText("Turn labels on");
			}
		} else if(e.getSource() == clr ) {
			// then the user clicked the Clear button
			poi.clear();
			waypoint.clear();
			node.clear();
			way.clear();
			repaint();
			
		} else if(e.getActionCommand().equalsIgnoreCase("Open...")) {
			// the user clicked Open on the file menu
			System.out.println("Open file");
			// do open file things
			
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Open");
			int fileChooserResult = fileChooser.showOpenDialog(getParent());
			
			if( fileChooserResult == JFileChooser.APPROVE_OPTION) {
				File openPath = fileChooser.getSelectedFile();
				
				try {
					FileInputStream fileIn = new FileInputStream(openPath.getAbsolutePath());
					ObjectInputStream objIn = new ObjectInputStream(fileIn);
					
					saveFile = (SaveFile) objIn.readObject();
					poi = saveFile.getPoi();
					node = saveFile.getNode();
					way = saveFile.getWay();
					
					objIn.close();
					fileIn.close();
					
					repaint();
					
				} catch (FileNotFoundException i ) {
					System.out.println("Open file failed: FileNotFoundException");
					JOptionPane.showMessageDialog(getParent(), "There was an error opening the file.", "File Error", JOptionPane.ERROR_MESSAGE);
				} catch (IOException i ) {
					System.out.println("Open file failed: IOException");
					System.out.println(i.toString());
					JOptionPane.showMessageDialog(getParent(), "There was an error opening the file.", "File Error", JOptionPane.ERROR_MESSAGE);
				} catch (ClassNotFoundException i) {
					System.out.println("Open file failed: ClassNotFoundException");
					JOptionPane.showMessageDialog(getParent(), "There was an error opening the file.", "File Error", JOptionPane.ERROR_MESSAGE);
				}
				
			} // if the user goes through with the open
			
		} else if(e.getActionCommand().equalsIgnoreCase("Save...")) {
			// the user clicked Save on the file menu
			System.out.println("Save file");
			// do save file things
			
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Save As");
			File file = new File(System.getProperty("user.home")+java.io.File.separator+"MyData.tgis");
			fileChooser.setSelectedFile(file);
			
			int fileChooserResult = fileChooser.showSaveDialog(getParent());
			// don't have access to the frame because this is being called from within my JPanel;
			//   trying getParent(); seems to work -Jesi
			
			if(fileChooserResult == JFileChooser.APPROVE_OPTION) {
				File savePath = fileChooser.getSelectedFile();
				
				try {
					FileOutputStream fileOut = new FileOutputStream(savePath.getAbsolutePath());
					ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
					
					saveFile = new SaveFile(poi, way, node);
					objOut.writeObject(saveFile);
					
					objOut.close();
					fileOut.close();
					
					//saveFilePath = savePath.getAbsolutePath();
					//saveMenuItem.setEnabled(true);
					//fileSaved();
					
				} catch (IOException i) {
					System.out.println("Save file failed: " + i.toString());
					JOptionPane.showMessageDialog(getParent(), "There was an error in saving your data.", "Save Error", JOptionPane.ERROR_MESSAGE);
				} 
			}
			
		}
		
		repaint();
		
		
	} // end actionPerformed()

	
}
