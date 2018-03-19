package studio8;

import java.io.File;
import java.io.FileNotFoundException;
//import java.nio.file.*;
import java.util.Scanner;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

public class CountSteps{
	//need to use .split next time i guess
	public static void main(String[] args) {
		
		String csvFile = "/Users/jboss/git/studio-8-armando-boss/data/data.csv"; 
		String line = ""; 
		String cvsSplit = ",";  
		
		File file = new File(csvFile); 
				
		try {
			//reads from file with Scanner class
			Scanner in = new Scanner(file); 
			//hasNext() loops line-by-line
			while(in.hasNext()) {
				
				//read single line, put in string
				String data = in.next();
				System.out.println(data);
				
			}
			//after loop, close scanner
			in.close(); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}
}