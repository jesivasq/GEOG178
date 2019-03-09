package foo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class Test {

	public static void main(String[] args) {
		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader("schools.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String [] nextLine;
	    try {
			while ((nextLine = reader.readNext()) != null) {
			    // nextLine[] is an array of values from the line
			    System.out.println(nextLine[0] + ", " + nextLine[1] + ", " + nextLine[2] + ", " + nextLine[3]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
