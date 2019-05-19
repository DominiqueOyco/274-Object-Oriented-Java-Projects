package week_10_lecture;

import java.util.Arrays;

public class EQPartialSolution {
	private Queen[] queens;
	public static int valid = 1; //if queen1 doesn't get attacked by queen2
	public static int viable = 0; //if queen1 is attacked by queen2 but there is still a chance
	public static int invalid = -1; //if the queen1 is attacked by queen2
	
	/**
	 * A constructor. Constructs the partial solution for a given size
	 * @param size - the size
	 */
	public EQPartialSolution(int size){
		
		queens = new Queen[size]; //An arraylist containing the number of the queens
	}
	
	/**
	 * examines the partial solution
	 * @return valid, viable, or invalid
	 */
	public int examine(){
		for(int i = 0; i < queens.length; i++){
			for(int j = i + 1; j < queens.length; j++){
				if(queens[i].attacks(queens[j])){
					return invalid;
				}
			}
		}
		if (queens.length == 8){ 
			return valid; 
		}
		else{ 
			return viable; 
		}
	}
	
	/**
	 * extends the partial solution
	 * @return array of partial solutions
	 */
	public EQPartialSolution[] extend(){
		EQPartialSolution[] pSolutions = new EQPartialSolution[8];
		for(int i = 0; i < pSolutions.length; i++){
			int size = queens.length;
			
			//new solutions to have more rows
			pSolutions[i] = new EQPartialSolution(size + 1);
			
			//copies the solution into the new one
			for(int j = 0; j < size; j++){
				pSolutions[i].queens[j] = queens[j];
			}
			
			pSolutions[i].queens[size] = new Queen(size, i);
		}
		return pSolutions;
			
		}
	
	public String toString(){
		return Arrays.toString(queens);
	}


	
}

