package week_7_lecture;

public class IsPalindromeDemo {
	/**
	 * checks whether a string is palindrome, i.e. reads the same way forward 
	 * as it does backwards
	 * @param text - String for the text to check
	 * @return boolean - true if the string is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String text){
		boolean isPali = false;
		
		int n = text.length();
		
		//BASE CASE: If the text is 1 or 0 characters
		if(n <= 1){
			isPali = true;
		}
		else{
			
			char lastChar = Character.toLowerCase(text.charAt(n-1)); //last character changed to lowercase
			char firstChar = Character.toLowerCase(text.charAt(0)); //first character changed to lowercase
			// If both are letters
			if(Character.isLetter(firstChar) && Character.isLetter(lastChar)){
				//If first and last letters are the same, then reduce the problem by removing them
				//and checking if the resulting substring is a palindrome
				if(firstChar == lastChar){
					String smallerText = text.substring(1, n-1); //problem reduction step
					return isPalindrome(smallerText); //recursive step					
				}
			}
			else if(Character.isLetter(firstChar)) //if the first character is not a letter
			{ 
				String smallerText = text.substring(1); //removing the first character
				//1 because the first item in a word starts at index 0
				return isPalindrome(smallerText); //recursive step
			}
			else{ //if the last character is not a letter
				String smallerText = text.substring(0, n-1); // removing last character
				//the first item in the word is at index is 0 and the last item is n-1
				return isPalindrome(smallerText); //recursive step
			}
		}
		return isPali;
	}
	
	public static void main(String[] args){
		boolean p = isPalindrome("racecar");
		System.out.println(p);
	}
}
