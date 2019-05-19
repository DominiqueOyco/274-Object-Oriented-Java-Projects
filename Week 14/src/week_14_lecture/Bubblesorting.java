package week_14_lecture;

import java.util.Scanner;

public class Bubblesorting {
	
	public static void main(String[] args){
		StopWatch newWatch = new StopWatch();
		randomDoubleArray randArray = new randomDoubleArray(); 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the respected size of the array: ");
		int size = in.nextInt();
		int[] array = randArray.randomDoubleArray(size);
	
		newWatch.start();
		

		int temp;
		int counter = 0;
		boolean sorted = true;
		while(sorted){
			sorted = false;
			for(int i = 0; i<array.length - 1; i++){
				for(int j = 0; j<array.length - 1; j++){
					if(array[j]>array[j]){
						temp = array[j - 1];
						array[j-1] = array[j];
						array[j] = temp;
						counter ++;
					}
				}
			}
		}
						
		newWatch.stop();
		long time = newWatch.getMilliSecondsElapsed();
		
		System.out.println("Estimated time for sorted array: " + time + " " + "ms");
		newWatch.reset();	
	}
}


