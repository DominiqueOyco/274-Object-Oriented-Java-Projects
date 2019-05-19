package week_9_lecture;

public class IsPalindromePart2 {
	/**
	 * recursive helper method, checks whether a string is a palindrome, i.e. reads the same way forward
	 * as it does backwards
	 * @param text - String for the text to check
	 * @param start - int for the starting index i.e. were we should start reading the text
	 * @param ending - int for the ending index i.e. where to stop reading the text
	 * @return boolean - true if the string is a palindrome, false otherwise
	 */
	private static boolean isPalindrome(String text, int start, int ending){
		boolean isPali = false;
		
		int n = text.length();
		
		//BASE CASE: If the starting index has reached the ending index and vice-versa
		if(ending <= start){
			isPali = true;
		}
		else{
			
			char lastChar = Character.toLowerCase(text.charAt(ending-1)); //last character changed to lowercase
			char firstChar = Character.toLowerCase(text.charAt(start)); //first character changed to lowercase
			// If both are letters
			if(Character.isLetter(firstChar) && Character.isLetter(lastChar)){
				//If first and last letters are the same, then reduce the problem by removing them
				//and checking if the resulting substring is a palindrome
				if(firstChar == lastChar){
					return isPalindrome(text, start + 1, ending - 1); //recursive step					
				}
			}
			else if(Character.isLetter(firstChar)) //if the first character is not a letter
			{ 
				return isPalindrome(text, start + 1, ending); //recursive step, not considering the first character
			}
			else{ //if the last character is not a letter
				String smallerText = text.substring(0, n-1); // removing the last character
				return isPalindrome(text, start + 1, ending - 1); //recursive step, not considering the last character
			}
		}
		return isPali;
	}

	//
	public static boolean isPalindrome(String text){
		return isPalindrome(text, 0, text.length()); //this is NOT a recursive call, this is calling the helper method
	}
	
	public static void main(String[] args){
		boolean p = isPalindrome("racecar");
		System.out.println(p);
	}
}
