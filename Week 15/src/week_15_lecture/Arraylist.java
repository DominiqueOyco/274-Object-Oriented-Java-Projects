package week_15_lecture;

public class Arraylist {
	
	private Object[] buffer;
	private int currentSize; // private at first
	
	public Arraylist(){
		final int initialSize = 5;
		buffer = new Object[initialSize];
		currentSize = 0;
	}
	
	public int size(){
		//returns current size
		return currentSize;		
	}
	
	private void checkBounds(int pos){
		if (pos < 0 || pos >= currentSize){
			throw new IndexOutOfBoundsException();
		}
	}
	
	public Object get(int pos){
		checkBounds(pos);
	    return buffer[pos];
	}
	
	public void set(int pos, Object data){
		checkBounds(pos);
	    buffer[pos] = data;
	}
	
	public void add(int pos, Object data){
		checkBounds(pos);
		growBufferIfNecessary();
		
	    for (int i = currentSize; i > pos; i--)
	    {	
	        buffer[i] = buffer[i - 1];
	    }
	    buffer[pos] = data;
	    currentSize++;
	}

	public Object remove(int pos){
		checkBounds(pos);
		Object removed = buffer[pos];
		 
		for (int i = pos + 1; i < currentSize; i++){
	      //buffer[i - 1] = buffer[i];
	      //buffer[pos] = buffer[pos - 1]; 
	    }	    
	    currentSize--; 
	    return removed;
		
	}
	
	public boolean addFirst(Object data){ //void
//		growBufferIfNecessary();
//	    currentSize++;
//		   
//	    buffer[0] = data;
//	    return true;
	    
		growBufferIfNecessary();
		for (int i = currentSize; i > 0; i--)
	    {	
	        buffer[i] = buffer[i - 1];
	    }
	    currentSize++;
	    buffer[0] = data;
	    return true;
	}
	
	private void growBufferIfNecessary(){
		if (currentSize == buffer.length){
			Object[] newBuffer =  new Object[2 * buffer.length];
		    for (int i = 0; i < buffer.length; i++){ 
		         newBuffer[i] = buffer[i]; 
		      }
		      buffer = newBuffer;
		   }
	}
}
