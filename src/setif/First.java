package setif;

import java.util.Set;
import java.util.HashSet;

public class First {

	public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	
	set.add(1);
	set.add(2);
	set.add(56);
	set.add(67);
	set.add(32);
	set.add(1);
	set.add(null);
	set.add(null);
	//set.add("demo");
	System.out.println(set);
	
	System.out.println(set.remove(20));  //----->false(because 20 is not present in the set)
	}
}
