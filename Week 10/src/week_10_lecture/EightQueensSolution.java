package week_10_lecture;

import java.util.Arrays;

public class EightQueensSolution {
	
	public static void main(String[] args){
		solve(new EQPartialSolution(0));
	}
	
	public static void solve(EQPartialSolution sol){
		int exam = sol.examine();
		if (exam == EQPartialSolution.valid){ 
			System.out.println(sol); 
		}
		
		else if (exam != EQPartialSolution.invalid){			
			for (EQPartialSolution p : sol.extend()){
				solve(p);
			}
		}
	}
}