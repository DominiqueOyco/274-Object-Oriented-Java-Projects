package week_5_lecture;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class LabAssignment5{
	
	public static void main(String[] args) {
		boolean exceptionThrown = false;
 		 Scanner in = new Scanner(System.in);
    	 System.out.println("Enter the path to the file you want to use.");
    	 String fileName = in.nextLine();
    	 Scanner reader = null;
    	 int sum = 0;
         try{
        	 File fileIN = new File(fileName);
        	 reader = new Scanner(fileIN);
        	 try{
        	 while(reader.hasNext()){
        		 String currentLine = reader.nextLine().trim();
            	 String[] numbers = currentLine.split("\\s");
            	 for (String n : numbers){
            		 sum += Integer.parseInt(n);
            		 System.out.println("Sum of numbers in the file is : " + sum);
            	 }
        	 }}
        	 catch(NumberFormatException e){
        		 System.out.println("Your file contains something other than numbers.");
        	 }
         } catch (FileNotFoundException ex) {
             exceptionThrown = true;
        	 System.out.println("File does not exist");
        } finally {
         	 reader.close();
        	}
	}
}

        
//			do{
//				 boolean exceptionThrown = false;
//		 		 Scanner in = new Scanner(System.in);
//		    	 System.out.println("Enter the path to the file you want to use.");
//		    	 String fileName = in.nextLine();
//		    	 Scanner filePath = null;
//		    	 int sum = 0;
//				try {
//
//				if(path.equalsIgnoreCase("Q")) {
//					System.out.println("Goodbye");
//					break;
//					}
//				else {
//					Scanner fileReader = null;
//				try {
//					try {
//					File fileIn = new File(path);
//					fileReader = new Scanner(fileIn);
//					String currentNum;
//					int sum = 0;
//					
//					while(fileReader.hasNext()) {
//						currentNum = fileReader.next();
//						System.out.print(currentNum + " + " + sum);
//						sum += Integer.parseInt(currentNum);	
//						System.out.println(" = " + sum);
//						}
//					
//					System.out.println(sum);
//					} finally {
//					fileReader.close();
//					}
//				} catch (FileNotFoundException ex) { 
//					exceptionThrown = true;
//					System.out.println("The file does not exists. Please enter a different location or Q to quit.");
//				}
//				}
//			} while (exceptionThrown);
//		}
//		
//			}
//		} while (exceptionThrown);
//		
//		System.out.println("Bye! Come Again!.");
//		in.close();
//	}
//}
//}

