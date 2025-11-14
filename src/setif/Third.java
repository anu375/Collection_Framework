package setif;

import java.util.Set;
import java.util.HashSet;

public class Third {

	public static void main(String[] args) {
		String str = "ABC";
		String str2 = new String("ABC");
		
		Set<String> set = new HashSet<String>();
		
		set.add(str2);
		set.add(str);
		
		System.out.println(set.size());
	}
}
