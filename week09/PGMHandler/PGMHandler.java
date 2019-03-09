package edu.ucsb.geog.w9;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class PGMHandler {
	
	private int[][] pic = new int[1][1];
	private int height, width, maxv;
	private String mn="", cmt="";
	
	public static void main(String args[]){
		PGMHandler img1 = new PGMHandler();
		img1.readPGMfromFile("l7sc2.pgm");
		//img1.invert();
		PGMHandler img2 = new PGMHandler();
		int[][] clip = img2.readPGMfromFile("l7sc2clip.pgm");
		img1.clip(img1.clip(clip, 100));
		img1.writePGMfromFile("output.pgm");
	}

	public void invert(){
	   int[][] pict = new int[height][width];
	   for (int i = 0; i < height; i++)
	     for (int j = 0; j < width; j++)
	       pict[i][j] = maxv - pic[i][j];
	   pic = pict;
	 }
	  
	public void clip(int[][] clip){
		   int[][] pict = new int[height][width];
		   for (int i = 0; i < height; i++)
		     for (int j = 0; j < width; j++){
			       pict[i][j] = pic[i][j]*clip[i][j];
		     }

		   pic = pict;
	}
	
	public int[][] clip(int[][] clip, int t){
		   for (int i = 0; i < height; i++){
		     for (int j = 0; j < width; j++){
		    	 System.out.println(clip[i][j]);
		    	 if(clip[i][j]< t)
		    		 clip[i][j] =0;
		    	 else
		    		 clip[i][j] =1;
		     }
		   }
		   return clip;
	}
	  
	public void writePGMfromFile(String filename){
	     
	        try {
	        	Writer writer = new OutputStreamWriter(new FileOutputStream(filename), Charset.forName("ASCII"));
	        	writer.write("P2\n");
	        	writer.write(cmt+"\n");
	        	writer.write(height + " " +width+"\n");
	        	writer.write(maxv+"\n");
        	    for (int i = 0; i < height; i++)
        	      for (int j = 0; j < width; j++)
        	        writer.write(pic[i][j]+" ");

	            writer.close();
	        } 		catch(Exception e){
				System.out.println(e);
			}
	}
	
	public int[][] readPGMfromFile(String filename){
		FileReader input;
		Scanner scanner;
		try{
	      	input = new FileReader(filename);
	      	scanner = new Scanner(input);
        	String mn = scanner.nextLine();
        	String cmt = scanner.nextLine();
        	height = scanner.nextInt();
        	width = scanner.nextInt();
        	maxv = scanner.nextInt();
        	if(mn.equals("P2")){
        		pic = new int[height][width];
        	    for (int i = 0; i < height; i++)
        	      for (int j = 0; j < width; j++)
        	        pic[i][j] = scanner.nextInt();
        	}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return pic;
	}
	public int[][] getPic() {
		return pic;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getMaxv() {
		return maxv;
	}

	public String getMn() {
		return mn;
	}

	public String getCmt() {
		return cmt;
	}

}
