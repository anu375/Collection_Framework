package ListIf;

import java.util.ArrayList;

public class Third {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(23);
		//list.add("12");  ----> Error <Integer> <--->  <String>  correct
		
		System.out.println(list);
		System.out.println(list.contains(13));   //----->contains check value/element is present
		//given string or not.  by-default :- false 
	}
}
