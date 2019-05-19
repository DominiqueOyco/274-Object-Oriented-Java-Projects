package week_10_lecture;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
	
	/**
	 * return the index of the smallest element in the array beginning 
	 * at some given index
	 * @param a - an array of integers
	 * @param start - the starting index of where the tail begins
	 * @return the index of the minimum element
	 */
	public static int minIdx(int[] a, int start){
		int minidx = start;
		for(int i = start; i < a.length; i++){
			if(a[i] < a[minidx]){ //if the current i-th position is smaller than the previous
				minidx = i;
			}
		}
		return minidx;
	}
	
	/**
	 * swaps the elements i and j of a given array
	 * @param a - an array of integers
	 * @param i - the index of one of the elements
	 * @param j - the index of the remaining element
	 **/
	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; 
	}
	
	/**
	 * generates an array of random integers
	 * @param size - the length of the array
	 * @param maxval - the maximum value an element can be
	 * @return an array of random integers
	 */
	public static int[] random(int size, int maxval){
		int[] a = new int[size];
		Random g = new Random();
		for(int i = 0; i < a.length; i++){
			a[i] = g.nextInt(maxval); //generating a random integer with max value maxval
		}
		return a;
	}

	
	public static void main(String[] args){
		
		int[] a = {4, -6, 2, -10, 9};
		
		int mini = minIdx(a, 0);
		
		System.out.println(a[mini]); 
		
		swap(a, a.length-1, mini);
		System.out.println(Arrays.toString(a)); 
	}
}
