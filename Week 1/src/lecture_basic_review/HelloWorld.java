package lecture_basic_review;

public class HelloWorld {
	
	//System.out.println("Hello World"); //print is not allowed inside the main method
	/*
	 * Every class that will contain input and output needs a main method
	 * All the input/output code needs to happen inside the main method
	 **/
	
	public static void main(String[] args){
		System.out.println("Hello World!"); //Simple print statement: "Hello World\n"
		System.out.print("My name is Jarvis.");// "My name is Jarvis." no newline
		System.out.print("Nice to meet you!");// "Nice to meet you!" no newline
		
		/*---------------------ERRORS-----------------------*/
		// TYPE 1: COMPILE-TIME ERROR ---> Syntax Error
		
		//System.out.print("Katherine") missing a semi-colon
		
		/*  TYPE 2: RUN-TIME ERROR ---> Logic Error: All syntax is correct, 
		 * unexpected behavior happens as a result of poor algorithm or computation.*/
		
		//System.out.println(1/0); //This leads to an ArithmeticException that crashes the program.
	}
}
