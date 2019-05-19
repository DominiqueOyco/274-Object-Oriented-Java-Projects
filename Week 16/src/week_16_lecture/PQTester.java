package week_16_lecture;

import java.util.PriorityQueue;

public class PQTester {
	public static void main(String[] args) {
		DLPriorityQueue pq = new DLPriorityQueue();
		pq.add("The Joker", 8);
		pq.add("Lex Luthor", 5);
		pq.add("Captain Cold", 2);
		System.out.println(pq.peek());
		pq.remove();

		System.out.println(pq.peek());
		pq.remove();

		System.out.println(pq.peek());
		pq.remove();

		pq.add("Batman", 10);		
		System.out.println(pq.peek());
		pq.remove();

		System.out.println(pq.peek());
		pq.remove();

	}
}
