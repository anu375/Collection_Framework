package ListIf;

import java.util.Vector;
import java.util.List;

public class Vector_1 {

	public static void main(String[] args) {
	List<String> vec = new Vector<String>();
	
	vec.add(null);
	vec.add(null);
	vec.add("12");
	vec.add("45");
	vec.add("12");
	System.out.println(vec);
	System.out.println(vec.remove(0));
	System.out.println(vec);
	System.out.println(vec.isEmpty());
	}
}
