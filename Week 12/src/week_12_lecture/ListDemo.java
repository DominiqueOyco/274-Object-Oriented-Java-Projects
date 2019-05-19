package week_12_lecture;
import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class ListDemo
{  
   public static void main(String[] args)
   {  
      LinkedList<String> staff = new LinkedList<String>();
      staff.addLast("Diana");
      staff.addLast("Harry");
      staff.addLast("Romeo");
      staff.addLast("Tom");
      
      // | in the comments indicates the iterator position

      ListIterator<String> iterator = staff.listIterator(); // | Diana, Harry, Romeo, Tom
      System.out.println(iterator.next()); // Diana | Harry, Romeo, Tom
      System.out.println(iterator.next()); // Diana, Harry, | Romeo, Tom

      // Add more elements after second element
      
      iterator.add("Juliet"); // Diana, Harry, Juliet, | Romeo, Tom
      iterator.add("Nina"); // Diana, Harry, Juliet, Nina | Romeo, Tom

      System.out.println(iterator.next()); // Diana, Harry, Juliet, Nina, Romeo | Tom
      System.out.println(iterator.previous()); //What does this print? i.e. where is the iterator
      System.out.println(iterator.previous());
      //WANT TO REMOVE NINA
      
      // Remove last traversed element 

      iterator.remove(); // Diana, Harry, Juliet, Nina, | Tom
     
      // Print all elements

      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
   }
}
