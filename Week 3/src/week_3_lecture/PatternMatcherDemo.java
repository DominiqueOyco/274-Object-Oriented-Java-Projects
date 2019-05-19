package week_3_lecture;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {
	
	public static void main(String[] args){
		// STEP 1: Create the regular expression, use regex101.com for help with matching
		String regularExpr = "([\\w | \\s]+)[.]+\\s([\\d |-]+)"; //create the regular expression as a spring
		
		// STEP 2: Create the pattern object
		Pattern pattern = Pattern.compile(regularExpr); //create a pattern object
		
		// STEP 3: Create the string
		String textString = "Abacus Associates  ....................... 1-800-547-5995"; //patch the pattern object to the string
				 
		// STEP 4: Create the matcher object
		Matcher m = pattern.matcher(textString); //the pattern that was created, is going to be matched to the string
				
		// STEP 5: Find and process the matching groups.
		if(m.find()){// if the matcher object found groups
			int numGroups = m.groupCount(); //number of matched groups
			
			for(int i = 0; i <= numGroups; i++){
				System.out.println("Group number " +i +": "+ m.group(i)); //printing each group
				
			}
		}
		
		
	}

}
