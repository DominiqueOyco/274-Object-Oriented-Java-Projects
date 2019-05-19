package week_16_lecture;

/**
 * implements a DOUBLY-LINKED list
 * @author - Dominique Oyco (014605758)
 * @since 1.0
 */

import java.util.NoSuchElementException;
import java.util.ListIterator;

public class DLinkedList{ 
		Node first;
		Node last;

		public DLinkedList(){
			this.first = new Node(null);
		}
	
		/**
		 * The doubly linked list iterator that returns a class the iterates it
		 * @return LinkedListIterator() - the class that iterates the linked list
		 */
		public LinkedListIterator DLListIterator(){
			return new LinkedListIterator();
		}
	   
	   class LinkedListIterator implements ListIterator{ 
		   private Node position;
	       private boolean isAfterNext;
	       private boolean isAfterPrevious;
	
	       /**
	        * Constructs the iterator that points at the beginning of the linked list
	        */
	       public LinkedListIterator(){  
	    	   position = null;
	           isAfterNext = false;
	           isAfterPrevious = false;
	       }
    
	       /**
	        * Moves the iterator to the next element.
		    * @return the next element
	        */
	       public Object next(){
	    	   if (!hasNext()){
	    		   throw new NoSuchElementException();
			   }
	    	   isAfterNext = true;
	    	   isAfterPrevious = false;
	
	    	   if (position == null){
	    		  position = first;
	    	   }
	    	   
	    	   else{
	            position = position.next;
	    	   }
	
	    	   return position.data;
	       }
	      
	      
	       /**
	        * Finds out if an element exists after the iterator's position
	        * @return true - if an element exists after the element on the iterator's position
	        */
		    public boolean hasNext(){  
		    	if (position == null){
		    		return first != null;
		    	}
	         
		    	else{
		    		return position.next != null;
		    	}
		    }
	
		    /**
		     * Moves the iterator on the previous element
		     * @return result - the previous element before the element that the iterator is pointing at
		     */
		    public Object previous(){
			  if (!hasPrevious()){
				  throw new NoSuchElementException();
			  }
			  
		      isAfterNext = false;
		      isAfterPrevious = true;
		
		      Object result = position.data;
		      position = position.previous;
		      return result;
		    }
	      
		  /**
		   * Finds out if there is an element before the iterator position.
		   * @return true if there is an element before the iterator position
		   */    
	       public boolean hasPrevious(){ 
	    	   return position != null;
	       }
	      
	      /**
	       * Adds an element before the iterator position and moves the iterator past the inserted element.
	       * @param element - the element that is used to add
	       */
	       
		  public void add(Object element){
			  if (position == null){
				  addFirst(element);
				  position = first;
			  }
			  
		      else if (position == last){
		    	  addLast(element);
		    	  position = last;
		      }
			  
			  else{ 
				  Node newNode = new Node();
				  newNode.data = element;
				  newNode.next = position.next;
				  newNode.next.previous = newNode;
				  position.next = newNode;
				  newNode.previous = position;
				  position = newNode;
			  }
		
			  isAfterNext = false;
			  isAfterPrevious = false;
	  	  }
	      
	      /**
	       * Removes the element the iterator is pointing at
	       */
		  public void remove(){
			  Node positionToRemove = lastPosition();
	
			  if (positionToRemove == first){
				  removeFirst();
			  }
			  
			  else if (positionToRemove == last){
				  removeLast();
			  }
			  
			  else{
				  positionToRemove.previous.next = positionToRemove.next;
				  positionToRemove.next.previous = positionToRemove.previous;
			  }
	
			  if (isAfterNext){ 
				  position = position.previous;
			  }
	
	         isAfterNext = false;
	         isAfterPrevious = false;
	      }
	
	      /**
	       * Sets the pointed element to a different value. 
	       * @param element - the element to set
	       */		  
	      public void set(Object element){
	    	  Node positionToSet = lastPosition();
	          positionToSet.data = element; 
	      }
	
	      /**
	       * Returns the last node that is being pointed by the iterator, or
	       * throws an IllegalStateException if there is no call to next or previous nodes.
	       * @return the last position
	       */
	      
	      private Node lastPosition(){
	    	  if (isAfterNext){ 
	    		  return position; 
	    	  }
	    	  
	    	  else if (isAfterPrevious){
	    		  if (position == null){
	    			  return first;
	    		  }
	    		  else{
	    			  return position.next;
	    		  }
 		  }
	          else{
	        	  throw new IllegalStateException();
     	  }
      }      
   }
	   
	  public class Node{
		private Object data;
		private Node next;
		private Node previous;
		private int prioritize;
	
		public Node(Object data)
		{
			prioritize = 0;
			this.data = data;
			previous = null;
			next = null;
		}
		
		public int getPrioritize(){
			return prioritize;
		}
		
		public Node(Object data, int prioritize)
		{
			this.prioritize = prioritize;
			this.data = data;
			previous = null;
			next = null;
		}
		
		 public int compareTo(Object otherData){
		    	Node other = (Node) data;		    
		    	if (prioritize < other.prioritize) {return -1;}
		    	if (prioritize > other.prioritize) {return 1;}
		    	return 0;
	    }  
	}	

  /**
  * gets the first item in the linked list
  * @return first.data - the first item in the linked list
  */
	public Object getFirst(){  
		if (first == null){
			throw new NoSuchElementException();
		}
	    return first.data;
	}

	/**
	 * removes the first item in the linked list
	 * @return element - the element that was removed
	 */
	public Object removeFirst(){  
		if (first == null){
			throw new NoSuchElementException();
		}
		
       Object element = first.data;
       first = first.next;
       if (first == null){
       	first.data = null;
	    } // List is now empty
       else{
       	first.previous = null;
	    }
       return element;
	}
	
	   /**
	    * adds the element at the beginning of the linked list
	    * @param element - the element used to add
	    */
	   public void addFirst(Object data){
		   if(first.data == null){
				first.data = data;
			}

			else{
				Node newNode = new Node(data);
				newNode.next = first; 
				first.previous = newNode;
				first = newNode; 
			}
	   }
	   
	   /**
	    * gets the last elements in the linked list
	    * @return temporary.data - the last element in the linked list
	    */
	   public Object getLast(){
		   Node temporary = first;

			while(temporary.next != null){
				temporary = temporary.next;
			}
			
			return temporary.data;
	   }
	   
	   /**
	    * removes the last element in the linked list
	    */
	   public void removeLast(){  

			if(first.data == null){
			}
			
			else if(first.next == null){
				first.data = null;
			}

			else{
				Node temporary = first;
				while(temporary.next != null){ 
					temporary = temporary.next;
				}
				temporary.previous.next = null;
			}
	   }
	
	   
	   /**
	    * adds an element all the way on the back of the linked list
	    * @param data - the element used to add
	    */
	   	public void addLast(Object data){  
		   if(first.data == null) addFirst(data);
			else{
				Node temporary = first;
				while(temporary.next != null){
					temporary = temporary.next;
				}

				Node newNode = new Node(data);

				temporary.next = newNode;
				newNode.previous = temporary;
			}
		}
	   
	   
		/**
	    * returns true if the data is found in the linked list otherwise false
	    * @param data - the element in the linked list
	    * @return true - if the data is found in the linked list
	    */
		public boolean contains(Object data){
			   if(first.data == null){
					return false;
				}
				else{
					Node temp = first;
					if(first.data.equals(data)) {
						return true;
					}
		
					while(temp.next != null){ 
						temp = temp.next;
		
						if(temp.data.equals(data)){
							return true;
						}
					}
					return false;
				}
		}
	}
	


	
