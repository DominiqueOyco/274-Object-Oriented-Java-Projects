package week_4_lecture;
import java.time.LocalDateTime;


/**
 * Objects from this class model a bank account capable of keeping
 * track of owner's information, deposit/withdrawal transactions, 
 * and current balance.
 * */
public class BankAccount {

	public final double OVERDRAFT_FEE = 29.95;  //Constant 
	private double amount;
	private double balance;
	
	/**
	 * overloaded constructor initializes a bank account with a given name and account number, and balance of $0
	 * @param name - name of the bank account owner as
	 * @param acctNum - the account number as a string
	 * */
	public BankAccount(String name, String acctNum){
		name = "";
		acctNum = "";
		double balance = 0.0;
	}
	

	/**
	 * overloaded constructor initializes a bank account with a given name, account number, and initial balance
	 * @param name - name of the bank account owner as
	 * @param acctNum - the account number as a string
	 * @param initial - the initial deposit amount as a double
	 * */
	public BankAccount(String name, String acctNum, double initial){
		name = name;
		acctNum = acctNum;
		initial = 0;
		System.out.println(name + "\t\tAcct #:" + acctNum);
		System.out.print("Initial amount: 0");
		return;
		
	}
	
	/**
	 * updates the current balance by the given deposit amount
	 * @param amount - the amount deposited as a double
	 * */
	public void deposit(double amount){
		amount++;
		if(amount >= 5){
			amount = amount + 1;
		}
		
	}
	
	/**
	 * updates the current balance by the given withdrawal amount
	 * @param amount - the amount withdrawn as a double
	 * */
	public void withdrawal(double amount){
		amount++;
		if(amount == amount){
			amount = amount - 1;
		}
	}
	
	/**
	 * gets the current balance
	 * @return the balance as a double
	 * */
	public double getBalance(){
		return balance;
	}
	
	/**
	 * gets the transaction history as a formatted string (see ExamIPartIITester.png)
	 * @return a formatted string with all the pertinent account information and history
	 * */
	public String getTransactionHistory(){
		String now = LocalDateTime.now().toString();
		System.out.println("Account opened on: " + now + "\t\tAmount: " + amount + "Balance: " + balance);
		System.out.println("Account opened on: " + now + "\t\tAmount: " + amount + "Balance: " + balance);
		return""; 
	}

}
