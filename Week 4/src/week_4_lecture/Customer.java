package week_4_lecture;

public class Customer {
	private int Customer = 0;
	
	public Customer() {
		
		Customer = Customer + 1;
		return;
	}
	
	public Customer(int rewards) {
		Customer = Customer + 1;
		return;
	}

	public void addPoints(Integer rewards){
		if(rewards <= 2000){
			String membershipLevel = "Bronze";
			System.out.println("Customer: " + Customer + "\nRewards: " + rewards.toString() + "\nMembership Level: " + membershipLevel.toString());	
		}
		
		if(rewards <= 5000){
			String membershipLevel = "Silver";
			System.out.println("Customer: " + Customer + "\nRewards: " + rewards.toString() + "\nMembership Level: " + membershipLevel.toString());	
		}
		
		if(rewards <= 10000){
			String membershipLevel = "Gold";
			System.out.println("Customer: " + Customer + "\nRewards: " + rewards.toString() + "\nMembership Level: " + membershipLevel.toString());	
		}
		
		if(rewards > 10000){
			String membershipLevel = "Platinum";
			System.out.println("Customer: " + Customer + "\nRewards: " + rewards.toString() + "\nMembership Level: " + membershipLevel.toString());	
		}
	}
}
