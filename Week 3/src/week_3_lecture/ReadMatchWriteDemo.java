package week_3_lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadMatchWriteDemo {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File tollfree = new File("/Users/Pir8/Documents/CECS 274/tollfree.txt");
		Scanner fileIN = new Scanner(tollfree); //this is the file object for the .txt"
		String currentLine; //declaring a variable to store each line
		
		Pattern pattern = Pattern.compile("([\\w|\\s]+)[.]+\\s([\\d|-]+)"); //creating the pattern from a regular expression which is also known as regex
		Matcher m;
		
		PrintWriter fileOUT = new PrintWriter("/Users/Pir8/Documents/CECS 274/tollfree2.txt");
		while(fileIN.hasNextLine()){
			currentLine = fileIN.nextLine(); //this is the current line in document
			m = pattern.matcher(currentLine); //matching the pattern to the current line
			if(m.find()){// if a match is found
				
				fileOUT.println("Company Name: " + m.group(1) + "\t\tPhone Number: " + m.group(2));
				//System.out.println("Company Name: " + m.group(1) + "Phone Number: " + m.group(2)); //print the name and number
			}			
		}
		fileOUT.close();
	}

}
