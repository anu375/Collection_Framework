package ListIf;

import java.util.List;
import java.util.ArrayList;

public class Fifth {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list.add(3);
		list.add(11);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(9);
		
		for(int i=list.get(0);i<=list.get(list.size() - 1);i++) {
			System.out.println(i);
			if(list.contains(i)==false) {
				list2.add(i);
			}
		}
		System.out.println(list2);
	}
}
