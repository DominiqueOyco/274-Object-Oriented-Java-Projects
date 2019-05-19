package week_8_lecture;

import java.util.ArrayList;

/**
 * @author Dominique Oyco Sec 01
 * @since 10/19/17
 * This class lists the available products, and gets the product returned if coins are insufficient
 */
public class Products {

	public static int availability;
	public static double coins;
	public String productName;
	public double prices;
	public boolean accepted;
	
	/**
	 * Constructs the products
	 */
	public Products(){
		availability++;
		this.productName = "";
	}
	
	/**
	 * Sets the value for the name of the product.
	 * @param productName - the name of the product
	 */
	public Products(String productName, int prices){
		
	}
	
	/**
	 * adds the coins 
	 * @return value 
	 */
	public void addCoins(){
		return;
	}
	
	/**
	 * Checks to see if the item is available on vending machine
	 * @return no if a certain product is not available
	 */
	public static void isAvailable(){
		
	}
	/**
	 * gets the value of the product name
	 * @return productName = the name of products available in the vending machine
	 */
	public String getProductName(){
		return this.productName;
	}
	
	/**
	 * gets the prices of the items available in the vending machine
	 * @return prices - the prices of the named items in the vending machine
	 */
	public double getPrices(){
		return prices;
		
	}
	
	/**
	 * Return the value of the boolean accepted
	 * @return true - if the number coins matches the price of the product otherwise return false
	 */
	public boolean buyProduct(){
		return accepted;
		
	}

}

