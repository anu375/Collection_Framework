package queueif;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Second {

	public static void main(String[] args) {
		Queue<String>q1 = new PriorityQueue<String>();
		q1.add("Z");
		q1.add("D");
		q1.add("B");
		q1.add("Y");
		q1.add("A");
		System.out.println(q1);
		
		q1.add("G");
		System.out.println(q1);
		
		System.out.println(q1.poll());
		System.out.println(q1);
		
		System.out.println(q1.poll());
		System.out.println(q1);
//		Queue<Integer> qu = new ArrayDeque<>();
//		qu.add(11);
//		qu.add(10);
//		qu.add(90);
//		qu.add(1);
//		System.out.println(qu);
//		qu.poll();
//		System.out.println("add elements in qu : "+qu);
//		Queue<Integer>qu1 = new ArrayDeque<>();
//		qu1.addAll(qu);
//		System.out.println("add elements in qu1 : "+qu1);
	}
}