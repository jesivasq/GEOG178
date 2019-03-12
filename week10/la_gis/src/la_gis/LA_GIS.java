package la_gis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.OsmMercator;
import org.openstreetmap.gui.jmapviewer.events.JMVCommandEvent;
import org.openstreetmap.gui.jmapviewer.interfaces.JMapViewerEventListener;

import au.com.bytecode.opencsv.CSVReader;

public class LA_GIS extends JFrame implements ActionListener, MouseMotionListener, JMapViewerEventListener{

	
	private JMapViewer mapv = null;
	private JButton hsButton = new JButton("Show Only High Schools");
	private boolean hsFlag = false;
	private CSVReader reader = null;
	
	private ArrayList<String> names = new ArrayList<String>();
	private ArrayList<String> type =  new ArrayList<String>();
	
	private ArrayList<MapMarkerDot> mapDots = new ArrayList<MapMarkerDot>();
	
	
	public LA_GIS() throws NumberFormatException, IOException {
		super("LA Schools GIS");
		setSize(1080, 720);
		JPanel main = new JPanel(new BorderLayout());
		mapv = new JMapViewer();
		mapv.setDisplayPosition(new Coordinate(34, -118), 10);
		main.add(mapv);
		
		JPanel button = new JPanel();
		hsButton.addActionListener(this);
		button.add(hsButton);
		main.add(button, BorderLayout.NORTH);
		
		add(main, BorderLayout.CENTER);
		mapv.addMouseMotionListener(this);
		
		try {
			String[] record = null;
			reader = new CSVReader(new FileReader(new File(LA_GIS.class.getResource("schools.csv").toURI())));
			
			while( (record = reader.readNext()) != null ) {
				names.add(record[0]);
				mapDots.add(new MapMarkerDot(new Coordinate(Double.parseDouble(record[1]), Double.parseDouble(record[2]))));
				type.add(record[3]);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < mapDots.size(); i++) {
			mapv.addMapMarker(mapDots.get(i));
		}
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		try {
			new LA_GIS();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Coordinate geo =  mapv.getPosition(e.getPoint());
		
		for (int i = 0; i < mapDots.size(); i++) {
			MapMarkerDot tmp = mapDots.get(i);
			tmp.setName("");
			double dist = OsmMercator.getDistance(geo.getLat(), geo.getLon(), tmp.getLat(), tmp.getLon());
			
			if(dist < 150) {
				tmp.setName(names.get(i));
			}
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == hsButton) {
			hsFlag = !hsFlag;
			mapv.removeAllMapMarkers();
			
			if(hsFlag) {
				hsButton.setText("Show All Schools");
				for(int i = 0; i < mapDots.size(); i++ ) {
					MapMarkerDot tmp = mapDots.get(i);
					tmp.setBackColor(Color.red);
					
					if( type.get(i).contentEquals("High School")) {
						mapv.addMapMarker(tmp);
					}
				}
				
			} else {
				hsButton.setText("Show Only High Schools");
				for(int i = 0; i < mapDots.size(); i++ ) {
					MapMarkerDot tmp = mapDots.get(i);
					tmp.setBackColor(Color.yellow);
					mapv.addMapMarker(tmp);
				
				}
				
			}
			
		}
	}

	@Override
	public void processCommand(JMVCommandEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
