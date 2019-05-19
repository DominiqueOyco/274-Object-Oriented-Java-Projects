package week_14_lecture;

import java.util.HashSet;
import java.util.Iterator;

public class HashTableDemo {
	
	public static void main(String[] args) {
//		HashSet<String> words = new HashSet<String>();
//
//		words.add("car"); words.add("zoe"); words.add("cat");
//		words.add("hat"); words.add("zinger"); words.add("cookies");
//		words.add("hot"); words.add("cot");
//		
//		for(String w : words) {
//			System.out.println(w + "\tHashcode: " + w.hashCode());
//		}
		
		HashSet<Book> books = new HashSet<Book>();
		Book a = new Book("A", "Ana", 220);
		Book b =  new Book("B", "Bob", 100);
		Book c = new Book ("A", "Ana", 220);
		//When printed, a and c are printed as one because they have the same number of pages and the same hashcode		
		
		books.add(a);
		books.add(b);
		books.add(c);
		
		for(Book i : books){
			System.out.println(i);
		}
		
		System.out.println(a.equals(c));
	}

}
