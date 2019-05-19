package week_5_lecture;

/**
A rental car with static methods to count rented and available cars.
*/
public class RentalCar{
	private boolean rented;
	private static int rentalCars;
	private static int availability;

	/**
	   Constructs a rental car.
	*/
	public RentalCar(){ 
		availability++;
	    rented = false;
	}
	
	/**
	   Get number of cars available.
	   @return count of cars that are available
	*/
	public static int numAvailable(){
		return availability;
	}
	
	/**
	   Get number of cars rented.
	   @return count of cars that are rented
	*/
	public static int numRented(){
	   return rentalCars;
	}
	
	/**
	   Try to rent this car.
	   @return true if the car was successfully rented, false if it was already
	   rented.
	*/
	public boolean rentCar(){
		if (!rented) {
	        availability--;
	        rentalCars++;
	        rented = true;
	    }
	    return rented;
	}
	        
	
	/**
	   Return rented car.
	   @return true if the car was previously rented and is now returned,
	   false if it was not previously rented.
	*/
	public boolean returnCar(){
		if (rented) {
	        availability++;
	        rentalCars--;
	        rented = true;
	    }
		return rented;
	   
	}
	   	
}