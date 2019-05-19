package week_14_lecture;

import java.util.Random;

public class randomDoubleArray {
		Bubblesorting size = new Bubblesorting();
		public int[] randomDoubleArray(int n){
			int[] x = new int[n];
			System.out.println("The size of the array: " + n);

			Random random = new Random();
			for(int i = 0; i<x.length; i++){
				x[i] = random.nextInt();
			}
			return x;			
		}
	}
