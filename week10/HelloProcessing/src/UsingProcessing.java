import processing.core.PApplet;

public class UsingProcessing extends PApplet {

//	private int pMouseX;
//	private int pMouseY;
	
	public static void main(String[] args) {
		PApplet.main("UsingProcessing");

	}
	
	public void settings() {
		// size goes in settings, not setup
		size(300, 300);
	}
	
	public void setup() {
//		fill(120, 50, 240);
		background(250);
	}
	
	public void draw() {
		//ellipse(width/2, height/2, second(), second());
		fill(255);
		rect(width-50, 20, 30, 30);
		
	}
	
	public void mousePressed() {
		if(mouseX > width-50 & mouseX < width-20 &
				mouseY > 20 & mouseY < 50) {
			// clear
			background(250);
		}
		fill(120, 50, 240);
		ellipse(mouseX, mouseY, 10, 10);
		
	}
	
	public void mouseDragged() {
		line(pmouseX, pmouseY, mouseX, mouseY);
	}
	
	public void mouseReleased() {
		fill(240, 120, 50);
		ellipse(mouseX, mouseY, 10, 10);
	}

}
