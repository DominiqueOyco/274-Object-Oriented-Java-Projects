package week_4_lecture;
public class BankAccountTester {
	
	public static void main(String[] args){
		//Creating first BankAccount object
		BankAccount myAcct = new BankAccount("Katherine Varela", "123456789");
		myAcct.deposit(500);
		myAcct.deposit(150);
		myAcct.withdrawal(200);
		System.out.printf("Current balance: $%.2f\n",  myAcct.getBalance());
		System.out.println("Expected: $450.00\n");
		System.out.println(myAcct.getTransactionHistory());
		
		myAcct.withdrawal(500);
		myAcct.deposit(600);
		System.out.println(myAcct.getTransactionHistory());
		
		//Creating another BankAccount object with initial deposit
		BankAccount batmanAcct = new BankAccount("Bruce Wayne", "789456123", 10500000);
		System.out.println(batmanAcct.getTransactionHistory());
	}

}
