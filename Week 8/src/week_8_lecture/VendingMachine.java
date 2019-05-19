package week_8_lecture;

/**
 * @author Dominique Oyco Sec 01
 * @since 10/19/17
 * This class adds coins to the vending machine, returns the coins if the amount of coins is less than the amount of the product,
 * handles the change that is given to the user, and detects insufficient money as an error.
 */
public class VendingMachine {
	
	public static int availability;
	public static double coins;
	public String productName;
	public double prices;
	public boolean accepted;
	public boolean farOff;
	
	/**
	 * Constructs the vending machine
	 */
	public VendingMachine(){

	}
	
	/**
	 * detects insufficient money as an error and throws an appropriate exception
	 */
	public void detectInsufficientFunds(){
		
	}
	
	
	/**
	 * Sets the value for the change
	 * @param coins - the coins to be returned if the product is sold out or doesn't match the product's price
	 * @param change - the amount of change to be returned if the user doesn't give too much money
	 */
	public VendingMachine(double coins, double change){
		
	}
	
	/**
	 * Returns the coins if the product is sold out or doesn't match the product's price
	 * @return coins - the coins that was tested in the product class
	 */
	public void returnCoins(){
		
	}
	
	/**
	 * Determines if the amount put in the vending machine is far or in the range of the product's price
	 * @return true - if the amount of change is far from the amount of the price otherwise false
	 */
	public boolean farOff(){
		return farOff;
	}
	/**
	 * Returns the change if the money is on the range of the price
	 * @return change - the amount that was to be returned to the user
	 */
	public double getChange(){
		return 0;
	}

}



