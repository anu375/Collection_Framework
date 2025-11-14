package ListIf;

import java.util.ArrayList;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			list.add(i+1);
		}
		list.add(67);
		list.add(90);
		System.out.println(list);     // o/p :- [1, 2, 3, 4, 5, 67, 90]
		list.remove(2);
		System.out.println(list);
	}
}
