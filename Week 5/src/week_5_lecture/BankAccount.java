package week_5_lecture;
import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 * Objects from this class model a bank account capable of keeping
 * track of owner's information, deposit/withdrawal transactions, 
 * and current balance.
 * */
public class BankAccount implements Comparable
{
	private static int LastNumAssigned = 12345677;
	public static final double OVERDRAFT_FEE = 29.95;  //Constant 
	private int accountNumber;
	private String ownerName;
	private ArrayList<String> transactions;
	private double balance;
	
	/**
	 * overloaded constructor initializes a bank account with a given name and balance of $0
	 * @param name - name of the bank account owner as a string
	 * */
	public BankAccount(String ownerName){
		LastNumAssigned++;
		this.accountNumber = LastNumAssigned;
		this.ownerName = ownerName;
		this.transactions = new ArrayList<String>();
		this.transactions.add("Account Opened On: " + LocalDateTime.now());
		this.transactions.add(String.format("%s%.2f", "Initial Amount: $", balance));
		this.balance = 0;

	}
	
	/**
	 * overloaded constructor initializes a bank account with a given name, account number, and initial balance
	 * @param name - name of the bank account owner as
	 * @param acctNum - the account number as a string
	 * @param initial - the initial deposit amount as a double
	 * */
	public BankAccount(String ownerName, double initial){
		LastNumAssigned++;
		this.accountNumber = LastNumAssigned;
		this.ownerName = ownerName;
		this.transactions = new ArrayList<String>();
		this.transactions.add("Account Opened On: " + LocalDateTime.now());
		this.balance = initial;	
		this.transactions.add(String.format("%s%.2f", "Initial Amount: $",  balance));
		
	}
	
	/**
	 * updates the current balance by the given deposit amount
	 * @param amount - the amount deposited as a double
	 * */
	public void deposit(double amount){
		this.balance += amount;
		String transaction = String.format("%-50s%s%.2f%20s%.2f", "Deposit: " + LocalDateTime.now(), "Amount: $", amount, "Balance: $", balance) ;
		this.transactions.add(transaction);
	}
	
	/**
	 * updates the current balance by the given withdrawal amount
	 * @param amount - the amount withdrawn as a double
	 * */
	public void withdrawal(double amount){
		this.balance -= amount;
		String transaction = String.format("%-50s%s%.2f%20s%.2f", "Withdrawal: " + LocalDateTime.now(), "Amount: $", amount, "Balance: $", balance) ;
		this.transactions.add(transaction);
		if(amount > balance){
			this.balance -= BankAccount.OVERDRAFT_FEE;
			String overdraft = String.format("\t\t\t%20s%.2f%20s%.2f", "Overdraft Fee: $", BankAccount.OVERDRAFT_FEE, "Balance: $", balance) ;
			this.transactions.add(overdraft);	
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
		String formattedHistory = String.format("%-20s%20s", ownerName, "Acct #: " + accountNumber +"\n");
		for(String transaction : transactions){
			formattedHistory += transaction +"\n";
		}
		return formattedHistory;
	}
	
	/**
	 * overrides toString() to print the BankAccount object
	 * @return the formatted string with owner name, account number, and transaction history
	 * */
	public String toString(){
		return this.getTransactionHistory();
	}

	/**
	 * implements compareTo() so that a bank account with a smaller balance is consider smaller 
	 * than an account with a larger balance.
	 * @return -1 if this account balance is smaller, 1 if this account balance is larger, 0 otherwise
	 * */
	
	/**
	 * projects the final amount in a savings account after the given time, for an initial principal deposited at a given rate (%)
	 * @param principal - the initial amount 
	 * @param rate - the rate as percent e.g. for 2.5% pass 2.5
	 * @param time - the time in years
	 * @param compoundingPeriods - an integer to specify how many times per year the interest is compounded.  Valid options are 0 - continuously, 1 - annually, 2 - semi-annually, 4 - quarterly, 12 - monthly
	 * @return the final savings balance as a double
	 * */
	public static double projectedSavings(double principal, double rate, double time, int compoundingPeriods){
		if(compoundingPeriods == 0){
			return principal * Math.exp((rate/100) * time);
		}
		else if(compoundingPeriods == 1 || compoundingPeriods == 2 || compoundingPeriods == 4 || compoundingPeriods == 12){
			return principal * Math.pow((1 + rate), compoundingPeriods * time);
		}
		
		else{
			System.out.println("Invalid compounding period.");
		}
		return compoundingPeriods;
		
	}
	
	/**
	 * implements compareTo() so that a bank account with a smaller balance is consider smaller 
	 * than an account with a larger balance.
	 * @return -1 if this account balance is smaller, 1 if this account balance is larger, 0 otherwise
	 * */
	
	public int compareTo(Object other) {
		BankAccount otherAcct = (BankAccount) other;
		if(balance < otherAcct.getBalance()){
			return -1;
		}
		else if (balance > otherAcct.getBalance()){
			return 1;
		}
		return 0;
	}

}
