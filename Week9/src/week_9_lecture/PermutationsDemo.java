package week_9_lecture;

import java.util.ArrayList;

public class PermutationsDemo {
	
	public static ArrayList<String> permutations(String word){
		ArrayList<String> perms = new ArrayList<String>();
		
		int n = word.length();
		
		if(n <= 0){//if the word is empty or only has one character
			perms.add(word); //the only permutation is the word i
		}
		else{
			for(int i = 0; i < n; i++){
				char fixed = word.charAt(i); //fixing a character
				String shorter = word.substring(0, i) + word.substring(i+1); // word w/o fixed character
				
				ArrayList<String> permsOfShorter = permutations(shorter); //recursive call
				
				for(String w : permsOfShorter){
					perms.add(fixed + w); //concatenating the fixed character with each permutation
										  //of the shorter word and adding it to the main list
				}
				
			}
		}
		return perms;
		
	}
	
	public static void main(String[] args){
		ArrayList<String> p = permutations("miss");
		System.out.println("Number of permutations: " + p.size());
		for(String perm : p){
			System.out.println(perm);
		}
	}
}
