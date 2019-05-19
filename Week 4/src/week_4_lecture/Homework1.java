package week_4_lecture;

public class Homework1 {
	public static class CustomerTester{
		public static void main(String[] args){
			Customer cauchy = new Customer();
			Customer newton = new Customer(6000);
			cauchy.addPoints(30);
			cauchy.addPoints(2000);
			System.out.println(cauchy);
			System.out.println();
			System.out.println(newton);}
		}
	}

