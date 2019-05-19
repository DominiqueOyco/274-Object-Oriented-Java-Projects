package week_14_lecture;
import java.util.Arrays;

public class BubblesortingTester{
	
	void fillArrays(){
		
	}
	
	public static void main(String[] args){
		StopWatch watch = new StopWatch();
		
		Bubblesorting testing = new Bubblesorting();
	    double array[] = {6.1, 4.2, 3.3, 7.4, 5.5, 2.6, 8.7, 1.8};
	    testing.bubbleSorting(array);
	    System.out.println("Sorted array");
	    
	    double sorter1[] = new double[10000];
	    Arrays.fill(sorter1);
	    watch.start();
	    testing.bubbleSorting(sorter1);
	    watch.stop();
	    long first = watch.getMilliSecondsElapsed();
	    
	    watch.reset();
	    
	    double sorter2[] = new double[20000];
	    fillArrays.fill(sorter2);
	    watch.start();
	    testing.bubbleSorting(sorter2);
	    watch.stop();
	    long second = watch.getMilliSecondsElapsed();
	    
	    watch.reset();
	    
	    double sorter3[] = new double[30000];
	    fillArrays.fill(sorter3);
	    watch.start();
	    testing.bubbleSorting(sorter3);
	    watch.stop();
	    long third = watch.getMilliSecondsElapsed();
	    
	    watch.reset();
	    
	    double sorter4[] = new double[40000];
	    fillArrays.fill(sorter4);
	    watch.start();
	    testing.bubbleSorting(sorter4);
	    watch.stop();
	    long fourth = watch.getMilliSecondsElapsed();
	    
	    watch.reset();
	    
	    double sorter5[] = new double[50000];
	    fillArrays.fill(sorter5);
	    watch.start();
	    testing.bubbleSorting(sorter5);
	    watch.stop();
	    long fifth = watch.getMilliSecondsElapsed();
	    
	    watch.reset();
	    
	    double sorter6[] = new double[60000];
	    fillArrays.fill(sorter6);
	    watch.start();
	    testing.bubbleSorting(sorter6);
	    watch.stop();
	    long sixth = watch.getMilliSecondsElapsed();
	    
	    
	    System.out.println("Time for sorting for each array: \n" + first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth + "\n" + sixth);    
	}
}
	