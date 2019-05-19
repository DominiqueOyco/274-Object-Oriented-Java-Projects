package week_12_lecture;
/**
 * 
 * @author Dominique Oyco (014605758)
 *
 */
public class ComparableUtilYourName {
	public static int lowest(int[] array, int fIndex, int lIndex)
	{
	   int result;
	   if (fIndex == lIndex)
	   {
	      result = array[fIndex];
	   }
	   else                         
	   {
	      int middle = (fIndex + lIndex) / 2;
	      result = Math.min(highest(array, fIndex, middle),
	                        highest(array, middle + 1, lIndex));
	   }
	   return result;
	}
	
	private static int getLowest(Comparable[] a, int firstIndex, int lastIndex){
		
		return getLowest(a, 0, a.length - 1);
	}
	
	public static int highest(int[] array, int fIndex, int lIndex)
	{
	   int result;
	   if (fIndex == lIndex)
	   {
	      result = array[fIndex];
	   }
	   else                         
	   {
	      int middle = (fIndex + lIndex) / 2;
	      result = Math.max(highest(array, fIndex, middle),
	                        highest(array, middle + 1, lIndex));
	   }
	   return result;
	}
	
	private static int getHighest(Comparable[] a, int firstIndex, int lastIndex){
		
		return getHighest(a, 0, a.length - 1);
	}
	
	public static Comparable min(Comparable[] objects){		
	      Comparable[] a = {-1, 3, 5, -7, -9};
	      
	      for (int i = 0; i < a.length - 1; i++)
	      {
	    	Comparable x = a[0];
	    	Comparable y = a[4];
			if(x.compareTo(y) < 0){
				return -1;
			}
			else if(x.compareTo(y) == 0){
				return 0;
			}
			else{
				return 1;
			}
	      }
      
	      if(1){
	    	  minElement = 
	      }
	      
	      
	      return minElement;	      
	   }

	
	public static Comparable max(Comparable[] objects){
		Comparable[] a = {-1, 3, 5, -7, -9};
	      
	      for (int i = 0; i < a.length - 1; i++)
	      {
	    	Comparable x = a[0];
	    	Comparable y = a[4];
			if(x.compareTo(y) < 0){
				return -1;
			}
			else if(x.compareTo(y) == 0){
				return 0;
			}
			else{
				return 1;
			}
	      }
    
	      if(){
	    	  maxElement = 
	      }
	      
	      
	      return maxElement;	
	}
	
}
