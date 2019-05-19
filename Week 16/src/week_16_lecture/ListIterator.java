package week_16_lecture;

public interface ListIterator{
	
	/**
     * Moves the iterator to the next element.
     * @return the next element
     */
	public Object next();
	
    /**
     * Finds out if an element exists after the iterator's position
     * @return true - if an element exists after the element on the iterator's position
     */	
	public boolean hasNext();
	
    /**
     * Moves the iterator on the previous element
     * @return result - the previous element before the element that the iterator is pointing at
     */
	public Object previous();
	
	/**
	 * Finds out if there is an element before the iterator position.
	 * @return true if there is an element before the iterator position
	 */            
	public boolean hasPrevious();
	
	/**
     * Adds an element before the iterator position and moves the iterator past the inserted element.
     * @param element - the element that is used to add
     */
	public void add(Object element);
	
	/**
     * Removes the element the iterator is pointing at
     */
	public void remove();
	
	/**
     * Sets the pointed element to a different value. 
     * @param element - the element to set
     */
	public void set(Object element);
}
