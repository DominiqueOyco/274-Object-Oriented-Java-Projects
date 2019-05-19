package week_5_lecture;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountTester {
	
	public static void main(String[] args){
		
		BankAccount batmanAcct = new BankAccount("Bruce Wayne", 10500000);

		BankAccount myAcct = new BankAccount("Katherine Varela");
		myAcct.deposit(500);
		myAcct.deposit(150);
		myAcct.withdrawal(200);
		myAcct.withdrawal(500);
		myAcct.deposit(600);
		myAcct.getTransactionHistory();
		

		ArrayList<BankAccount> privateClients = new ArrayList<BankAccount>();
		privateClients.add(batmanAcct);
		privateClients.add(myAcct);
		
		System.out.println(privateClients);
		
		Collections.sort(privateClients);
		System.out.println(privateClients); //Happens after the call to sort 
		
		double mysavings = BankAccount.projectedSavings(batmanAcct.getBalance(), 2.5, 2, 1); //a STATIC method
		System.out.printf("Projected Savings Account Balance: $%.2f",mysavings);
		System.out.println(BankAccount.OVERDRAFT_FEE);
	}

}

//Instance variable is unique to its object
//Static variable is universal towards all the object that is created within the entire class