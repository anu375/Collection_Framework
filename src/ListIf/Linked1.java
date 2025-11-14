package ListIf;

import java.util.List;
import java.util.ArrayList;

public class Linked1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(12);
		list.add(12);
		list.add(13);
		
		List list2 = new ArrayList();
		list2.addAll(list);
		//System.out.println(list);
		System.out.println(list2);
//		list.clear();
//		System.out.println(list);
	//	System.out.println(list.get(3400));   //java.lang.IndexOutOfBoundsException
	}
}
