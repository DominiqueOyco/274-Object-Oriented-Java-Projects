package week_6_lecture;

public class LabAssingment7 {
	public static boolean find(String text, String str){
		if(text.contains(str)){
			System.out.println("True");
			return true;
		}
		else{
			System.out.println("False");
			return false;
		}

	}
	

	public static void main(String[] args){
		boolean a = find("Mississippi", "sip");
	}
}
