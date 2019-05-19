package week_14_lecture;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set<Book> books = new TreeSet<Book>();
		
		books.add(new Book("A", "Ana"));
		books.add(new Book("Z", "Zoe"));
		books.add(new Book("C", "Chi"));
		books.add(new Book("F", "Frida"));
		
		for(Book b: books) {
			System.out.println(b);
			System.out.println();
		}
	}

}
