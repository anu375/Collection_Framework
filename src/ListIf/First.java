package ListIf;

import java.util.ArrayList;
import java.util.List;

public class First{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		list.add(null);
		list.add(null);
		list.add(12);
		
		System.out.println(list.size());    // o/p :- 5
		System.out.println(list);     // o/p :-[12, 13, null, null, 12]
		
		list.remove(1);
		System.out.println(list);     //  o/p :-[12, null, null, 12]
		
		list.set(1, 90);
		System.out.println(list);     //  o/p :-[12, 90, null, 12]
		list.clear();
		System.out.println(list);     //  o/p :-[]
	}
}