package week_15_lecture;

import java.util.Arrays;

public class ArraylistTester {
	public static void main(String[] args){
		Arraylist wordList = new Arraylist();
		String[] ArrayList = new String[]{};
		wordList.addFirst("The more you know!");
		wordList.add(0, "Hello");
		wordList.add(1, "It's me");
		wordList.add(2, "nein means no in German");
		wordList.add(3, "ja means yes in German");
		
//		wordList.remove(2); //EXPECTED: "nein means no in German" to be gone
//		System.out.println(wordList.get(0)); //EXPECTED "Hello" to be printed out twice
		
//		wordList.addFirst("Want more?");
//		wordList.addFirst("Too bad there's no more!");
//		wordList.addFirst("night");
		
//		wordList.get(2);
//		System.out.println(wordList.get(2));
		
		for(int i = 0; i < wordList.size(); i++){
			System.out.println(wordList.get(i));
		}
		
//		System.out.print(wordList);
	}
}
