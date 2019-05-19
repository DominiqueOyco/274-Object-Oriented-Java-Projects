package week_16_lecture;

import java.util.HashMap;
import java.util.ListIterator;

public class DLPriorityQueue{
	HashMap<Object, Integer> map = new HashMap<Object, Integer>();

    private DLinkedList list;
    
    public DLPriorityQueue(){
    	list = new DLinkedList();
    }
	  
  /**
  * adds the value to the priority queue
  * @param data - the value that gets added on the linked list
  */
    public void add(Object name, int prioritize){
    	if(peek() == null){
    		list.addFirst(name);
			map.put(name, prioritize);
			return;
		}
    	
    	ListIterator iterator = list.DLListIterator();
	    	
	  
		while(iterator.hasNext()){
			Object temporary = iterator.next();
			System.out.println(map.get(temporary));
			int tempPrioritize = map.get(temporary);
			
			if(tempPrioritize <= prioritize){				
				iterator.previous();
				iterator.add(name);
				map.put(name, prioritize);
				return;
    			}
    		}
   
    		list.addLast(name);
			map.put(name, prioritize);
			return;	    	
    	}
	     
	  /**
	  * removes the smallest value on the priority queue
	  */
	    public void remove(){
	    	map.remove(peek()); 
	    	list.removeLast();
	    }

	  /**
	  * returns the contents of the last element in the priority queue
	  * @return an Object containing the data of the last element
	  */
	    public Object peek(){	    	
	    	return list.getLast();
	    }
   }