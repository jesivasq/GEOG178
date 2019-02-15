package week5Thursday;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new SwingDemo();
			}
		});
	}

}
