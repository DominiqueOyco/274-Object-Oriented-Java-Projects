package week_3_lecture;

import java.util.Scanner;

public class CarGame {
	public static void main(String[] args){
		String rules = "Move the car as fast as you can by hitting..."
				+ "\n\t...\"R\" to move right\n\t...\"L\" to move left"
				+ "\n\t...\"U\" to move up\n\t...\"D\" to move down\n"
				+ "Each hit moves 1 unit in the direction you chose, starting at (0,0).\n"
				+ "To stop moving simply hit any other key.\n"
				+ "Can you keep track of where your car will end up?\n"
				+ "Ready? Set? .....Go!";
		System.out.println("Welcome to this very fun game where a car moves on an xy-plane!!!!\nTrain your brain to keep track of locations!\n" + rules);
		Scanner in = new Scanner(System.in);
		
		Car car = new Car(); //THIS IS CREATING THE CAR OBJECT
		
		String direction = in.nextLine().trim();
		while(direction.equals("R") | direction.equals("L") | direction.equals("D") | direction.equals("U")){
			car.move(direction);  //This is moving the car 1 unit in the given direction.
			direction = in.nextLine().trim();
		}
		int[] positionGuess = new int[2];
		System.out.print("Guess your car's current x-position: ");
		positionGuess[0] = in.nextInt();
		System.out.print("Guess your car's current y-position: ");
		positionGuess[1] = in.nextInt();
		
		int[] truePosition = car.getCurrentPosition();
		
		if(positionGuess[0] == truePosition[0] & positionGuess[1] == truePosition[1]){
			System.out.println("Good Job! Your guess is correct!");
		}
		else{
			System.out.println("Incorrect! The current position of your car is (" + truePosition[0] + ", " + truePosition[1] + ")");
		}
		
		
	}

}
