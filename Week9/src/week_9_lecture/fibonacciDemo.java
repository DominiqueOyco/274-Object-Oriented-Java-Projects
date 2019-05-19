package week_9_lecture;

public class fibonacciDemo {
	/**
	 * returns the n-th fibonnacci number where f0 = 1 and f1 = 1
	 * @param n - the index of the fibonnacci 
	 * @return the n-th fib number
	 */
	public static long fibRecursive(int n){
		long f;
		if(n <= 1){
			f = 1;
		}
		else{
			f = fibRecursive(n - 1) + fibRecursive(n - 2);
		}
		return f;		
	}
	
	public static long fibIterative(int n){
		
		if(n <= 1){ return 1;}
		else{
			long f0 = 1;
			long f1 = 1;
			long f2 = 0; //dummy value
			for(int i = 0; i <=n-2; i++){
				f2 = f1 + f0;
				f0 = f1;
				f1 = f2;
			}
			return f2;
		}
	}
	
	public static void main(String[] args){
		
		StopWatch s = new StopWatch(); //iterative
		StopWatch r = new StopWatch(); //recursive
		s.start();
		for(int i = 0; i <= 46; i++){
			System.out.print(fibIterative(i) + " ");
		}
		s.stop();
		System.out.println("\n");
		r.start();
		for(int i = 0; i <= 46; i++){
			System.out.print(fibRecursive(i) + " ");
		}
		r.stop();
		
		System.out.println("\nTime Elapsed for iterative: " + s.getMilliSecondsElapsed());
		System.out.println("\nTime Elapsed for recursive: " + r.getMilliSecondsElapsed());

	}
}
