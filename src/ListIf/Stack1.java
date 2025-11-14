package ListIf;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		
		names.push("s1");
		names.push("Dhruva");
		names.push("s2");
		names.push(null);
		System.out.println(names.size());
		
		//names.clear();
		String str = names.peek();
		System.out.println(str);
		//System.out.println(names);
	}
}