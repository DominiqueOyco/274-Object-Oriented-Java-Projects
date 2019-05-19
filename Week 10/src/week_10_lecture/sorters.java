package week_10_lecture;

import java.util.Arrays;


public class sorters {
	
	//JAVA IS PASS BY VALUE!
	
	/**
	 * sorts an array of integers using selection sort algorithm
	 * @param a - an array of integers
	 **/
	public static void sort(int[] a){
		
		for(int i = 0; i < a.length; i++){
			int currentval = a[i];
			int minidx = ArrayUtil.minIdx(a, i);
			if(a[minidx] < currentval){
				if(a[minidx] < currentval){
					ArrayUtil.swap(a, minidx, i);
				}
				ArrayUtil.swap(a, minidx, i);
			}
		}
		//1. Find the index of the minimum in the tail of the array
		//2. If smaller than the current position, need to swap	
				
	}
	
	public static void main(String[] args){
		
		int[] a = {4, 5, -2, 1, -2, 0};
		
		sort(a);
		
		System.out.println(Arrays.toString(a));
		StopWatch s = new StopWatch();
		
		for(int i = 1; i <= 8; i++){
			int size = i * 10000;
			int[] b = ArrayUtil.random(size, size * 2);
			s.start();
			sort(b);
			s.stop();
			System.out.println("For n = " + size + "\t Time elapsed: " + s.getMilliSecondsElapsed() + " milliseconds");
			s.reset();
			
		}
		
	}
}
