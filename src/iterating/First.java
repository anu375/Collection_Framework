package iterating;

import java.util.Iterator;
import java.util.Queue;
import java.util.ArrayDeque;

public class First {

	public static void main(String[] args) {
		Queue<Integer> set = new ArrayDeque<Integer>();
		
		for(int i=0;i<100;i++) {
			set.add(i);
		}
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("*");
		}
	}
}
