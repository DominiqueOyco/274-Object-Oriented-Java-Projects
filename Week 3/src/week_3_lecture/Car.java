package week_3_lecture;
/**
 *
 * Builds a car object represented by a position
 * @author Dominique
 * @version 1.0
 * @since 2017-09-14
 * */

public class Car {
	private int[] position = new int[2]; //Every car is defined by its position
	
	/**
	 * returns the current xy-position
	 * @return an array of integers; index 0 is for x-coordinate; index 1 is for y-coordinate
	 **/	
	public int[] getCurrentPosition(){
		return position; 
	}
	
	/**
	 * moves the car 1 unit in the given direction
	 * @param dir - is a string representing one of the four directions; must pass "R", "L", "D", OR "U"
	 */	
	public void move(String dir){
		if(dir.equals("R")){
			position[0] = position[0] + 1; //update the position of x since its moving to the right
		}
		
		else if(dir.equals("L")){
			position[0] = position[0] - 1;
		}
			
		else if(dir.equals("U")){
			position[1] = position[1] + 1; //position @ 1 represents 1 while position @ 0 represents x
		}
		
		else if(dir.equals("D")){
			position[1] = position[1] - 1;
		}
		}
	}
